package Initialization;
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
public class Init {

	public static WebDriver driver = null;
	public static void Setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\application\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public static void TearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
