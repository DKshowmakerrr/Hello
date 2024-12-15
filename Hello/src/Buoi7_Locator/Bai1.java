package Buoi7_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bai1 {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "E:\\application\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://anhtester.com");
			driver.manage().window().fullscreen();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			
			//click vào button login
			WebElement button_login = driver.findElement(By.id("btn-login"));
			button_login.click();
			Thread.sleep(1000);
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("abc");
			Thread.sleep(1000);
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("abc");
			Thread.sleep(1000);
			WebElement button_Submitlogin = driver.findElement(By.name("login"));
			button_Submitlogin.click();
			Thread.sleep(1000);
			
			
			driver.quit();
		}

}
