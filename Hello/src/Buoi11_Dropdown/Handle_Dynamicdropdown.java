package Buoi11_Dropdown;
import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.nio.channels.Pipe.SourceChannel;
import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Script;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Initialization.Init;
import net.bytebuddy.asm.Advice.Argument;
public class Handle_Dynamicdropdown extends Init {

	public static void main(String[] args) throws Exception {
		Setup();
		
		driver.navigate().to("https://www.lambdatest.com/selenium-playground/jquery-dropdown-search-demo");
		Thread.sleep(2000);
		
		WebElement countryDropdown = driver.findElement(By.xpath("(//span[contains(@role,'combobox')])[1]"));
       
		//click
		countryDropdown.click();
		
		//chờ cho menu dropdown hiển thị
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@role,'combobox')])[1]")));
		Thread.sleep(2000);
		
		//nhập input
		WebElement inputCountry = driver.findElement(By.xpath("(//input[contains(@role,'textbox')])[2]"));
		Thread.sleep(2000);
		inputCountry.sendKeys("India");
		Thread.sleep(1000);
		
		//khai báo đối tượng thuộc lớp action để handle bàn phím
		Actions action = new Actions(driver);
		
		//hàm build để xây dựng hành động cho action, hàm perform để xác nhận xây dựng đó
		action.sendKeys(Keys.ENTER).build().perform();
		
//	    List<WebElement> list = driver.findElements(By.xpath("//li[@role='treeitem']"));
//	    for(WebElement option: list) {
//	    	System.out.println(option.getText());
//	    }
		
		
		
		
		
		TearDown();

	}

}
