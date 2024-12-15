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
import org.openqa.selenium.support.ui.Select;
import Initialization.Init;
public class Handle_Dropdown extends Init{

	public static void main(String[] args) throws Exception {
		Setup();
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		Thread.sleep(2000);
		
		//Handle dropdown tĩnh
		//Lấy element của thẻ "select" html
		WebElement element = driver.findElement(By.xpath("//select[@id='state']"));
		Thread.sleep(2000);
		//khai báo đối tượng kiểu Select cho element trên
		Select selectSimple = new Select(element);
		
		selectSimple.selectByIndex(1);
		System.out.println("Chạy được rồi");
		
		TearDown();

	}

}
