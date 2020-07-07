package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://magento.com");
		Actions act = new Actions(driver);
    	act.moveToElement(driver.findElement(By.partialLinkText("Products"))).perform();
//		driver.findElement(By.linkText("Request a demo")).click();
		act.contextClick(driver.findElement(By.linkText("Request a demo"))).perform();
		
		System.out.println("As Expected");
	}

}
