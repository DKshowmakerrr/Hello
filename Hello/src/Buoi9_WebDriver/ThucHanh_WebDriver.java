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
public class ThucHanh_WebDriver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\application\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().fullscreen();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		usernameField.sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement Myprofile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Admin']")));		
		Myprofile.click();
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		
		//Lấy tất cả đối tượng trong table
		List<WebElement> List = driver.findElements(By.xpath("//div[@role='columnheader']"));
		for(int i=0;i<List.size();i++) {
			System.out.println(List.get(i).getText());
		}
		
	}

}
