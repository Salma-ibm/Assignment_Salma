package day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.get("http://examples.codecharge.com/Store/Default.php");
			
			  String i = driver.getCurrentUrl();
			  System.out.println(i);
			  echo(i);
			  String j = driver.getTitle();
			  System.out.println("Your page title Is : "+j);
			  Title.assertEquals("Only Testing",j);
			  Title.assertEquals("Only Testing",driver.getTitle());
			//  driver.close();
			  
			  driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[2]/td/input")).sendKeys("Databases");
			 
			  driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
			  
			  int result = driver.findElements(By.xpath("/html/body/table[5]/tbody/tr/td")).size();
			    System.out.println(result);   

			
		
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

	
}


