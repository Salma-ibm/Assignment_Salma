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

public class Login_End_Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.get("http://demowebshop.tricentis.com");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")));
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			
//			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
//			driver.findElement(By.id("gender-male")).click();
			
			
//			WebElement user_firstname = driver.findElement(By.id("FirstName"));
//			user_firstname.clear();
//			user_firstname.sendKeys("Salma");
//			WebElement user_lastname = driver.findElement(By.id("LastName"));
//			user_lastname.clear();
//			user_lastname.sendKeys("Murmu");
			WebElement user_email = driver.findElement(By.id("Email"));
			user_email.clear();
			user_email.sendKeys("salma.murmu@gmail.com");
			
//			driver.quit();
//			System.out.println("As Expected");
//			
//			Select primary = new Select(driver.findElement(By.id("company_type")));
//			primary.selectByValue("selling");
//			
//			Select role = new Select(driver.findElement(By.id("individual_role")));
//			role.selectByVisibleText("Technical/developer");
//			
//			Select country = new Select(driver.findElement(By.id("country")));
//			country.selectByIndex(10);
//			
			WebElement user_password = driver.findElement(By.id("Password"));
			user_password.clear();
			user_password.sendKeys("Welcome@123");
//			WebElement user_confirmpass = driver.findElement(By.id("ConfirmPassword"));
//			user_confirmpass.clear();
//			user_confirmpass.sendKeys("Welcome@123");
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
			
			
//			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"msp-recaptcha-d84b65fc916e7398083ea5f17089d8f1\"]/div/div/iframe")));
//			driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).click();
//			driver.switchTo().defaultContent();
//			
//			if(!driver.findElement(By.id("agree_terms")).isSelected())
//			{
//			driver.findElement(By.id("agree_terms")).click();
//			}
			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form-validate\"]/div/div/button/span")));
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form-validate\"]/div/div/button/span")));
            driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")).click();
            driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-5\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
            
            driver.findElement(By.id("termsofservice")).click();
            
            driver.findElement(By.id("checkout")).click();
      
    
//			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			
			System.out.println("As Expected");
			
		    driver.quit();
			
			
	}

}


