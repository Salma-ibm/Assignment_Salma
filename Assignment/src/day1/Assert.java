package day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.get("http://demowebshop.tricentis.com");
			
			  String i = driver.getCurrentUrl();
			  System.out.println(i);
			  echo(i);
			  String j = driver.getTitle();
			  System.out.println("Your page title Is : "+j);
			  Assert.assertEquals("Only Testing",j);
			  Assert.assertEquals("Only Testing",driver.getTitle());
			//  driver.close();
			  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
			  String k = driver.getTitle();
			  System.out.println("Your page title Is : "+k);
			  Assert.assertEquals("Only Testing",k);
			  Assert.assertEquals("Only Testing",driver.getTitle());
		
			System.out.println("As Expected");
			
		//    driver.quit();
			
//			driver.quit();
			
			
	}

	private static void echo(String i) {
		// TODO Auto-generated method stub
		
	}

	private static void assertEquals(String string, String j) {
		// TODO Auto-generated method stub
		
	}

	private static void assertEquals1(String string, String k) {
		// TODO Auto-generated method stub
		
	}

}


