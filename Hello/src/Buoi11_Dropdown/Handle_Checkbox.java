package Buoi11_Dropdown;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Initialization.*;
public class Handle_Checkbox extends Init {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Setup();
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		
		//driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();)
		Boolean isSelected = driver.findElement(By.xpath("//input[@id='vfb-6-0']")).isSelected();
		if(isSelected ==false) {
			System.out.println("Chưa được chọn.");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
			System.out.println("Vừa chọn nó xong.");
		}else {
			System.out.println("Đã được chọn.");
		}
		//kiểm tra nút "Check All" có text là check all
		WebElement button_CheckAll = driver.findElement(By.xpath("//input[@id='check1']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",button_CheckAll );
		
		if(button_CheckAll.getText().equals("Check All")) {
			button_CheckAll.click();
		}else {
			System.out.println("không phải text không lấy được");
		}
		
		//kiểm tra tất cả check box đã selected
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//Biến kiểm tra tất cả các checkbox có được chọn không
		Boolean allChecked = true;
		
		//Duyệt qua tất cả các checkbox
		for(WebElement checkbox: checkBoxes) {
			if(!checkbox.isSelected()) {
				allChecked = false;
				break;
			}
		}
		// In kết quả
        if (allChecked) {
            System.out.println("Tất cả các checkbox đã được chọn.");
        } else {
            System.out.println("Không phải tất cả các checkbox đều đã được chọn.");
        }
        
        
		
		
		
		TearDown();

	}

}
