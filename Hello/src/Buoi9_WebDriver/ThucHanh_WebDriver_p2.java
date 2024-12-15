package Buoi9_WebDriver;

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
public class ThucHanh_WebDriver_p2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\application\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testpages.eviltester.com/styled/frames/frames-test.html");
		driver.manage().window().fullscreen();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//chuyển đến khung frame để lấy được element bên trong
		driver.switchTo().frame("middle");
		String itemMiddle = driver.findElement(By.xpath("//h1[normalize-space()='Middle']")).getText();
		System.out.println(itemMiddle);
		
		
	}

}
