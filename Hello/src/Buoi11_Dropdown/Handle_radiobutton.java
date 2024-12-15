package Buoi11_Dropdown;
import java.nio.channels.Pipe.SourceChannel;
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

import Initialization.Init;
public class Handle_radiobutton extends Init{

	public static void main(String[] args) throws Exception {
		Setup();
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		Thread.sleep(1000);
		WebElement radio1 = driver.findElement(By.xpath("//input[@type='radio']"));
		if (radio1.isSelected()) {
			System.out.println("Đã được chọn rồi.");
		}else {
			radio1.click();
			System.out.println("Đã được chọn rồi");
		}
		Thread.sleep(1000);
		WebElement radio2 = driver.findElement(By.xpath("document.querySelector(\"#vfb-7-2\")"));
		if (radio2.isSelected()==true) {
			System.out.println("radio 2 cũng đang được chọn_sai");
		}else {
			System.out.println("radio 2 không được chọn_đúng");
		}
		TearDown();

	}

}
