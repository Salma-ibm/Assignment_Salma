package day3;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Copy_Paste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
	
//		 driver.findElement(By.xpath("//input[@name='user_login']")).SendKeys(OpenQA.Selenium.Keys.Control + "a");
//	     driver.findElement(By.xpath("//input[@name='user_password']")).SendKeys(OpenQA.Selenium.Keys.Control + "c");
//	     var txt = Clipboard.GetText();
	        
	  // or any locator strategy that you find suitable 
	WebElement locOfOrder = driver.findElement(By.xpath("//input[@name='user_login']"));
	locOfOrder.sendKeys("Admin");
	Actions act = new Actions(driver);
	act.moveToElement(locOfOrder).doubleClick().build().perform();
	
	// catch here is double click on the text will by default select the text 
	// now apply copy command 

	driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
	// now apply the command to paste
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	driver.close();
	System.out.println("As Expected");
	}

}
