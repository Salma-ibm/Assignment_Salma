package day5;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.get("https://magento.com");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
			driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
			
			driver.findElement(By.id("register")).click();
//			System.out.println("As Expected");
			
			WebElement user_firstname = driver.findElement(By.id("firstname"));
			user_firstname.clear();
			user_firstname.sendKeys("Salma");
			WebElement user_lastname = driver.findElement(By.id("lastname"));
			user_lastname.clear();
			user_lastname.sendKeys("Murmu");
			WebElement user_email = driver.findElement(By.id("email_address"));
			user_email.clear();
			user_email.sendKeys("salma.murmu@gmail.com");
			
//			driver.quit();
//			System.out.println("As Expected");
			
			Select primary = new Select(driver.findElement(By.id("company_type")));
			primary.selectByValue("selling");
			
			Select role = new Select(driver.findElement(By.id("individual_role")));
			role.selectByVisibleText("Technical/developer");
			
			Select country = new Select(driver.findElement(By.id("country")));
			country.selectByIndex(10);
			
			WebElement user_password = driver.findElement(By.id("password"));
			user_password.clear();
			user_password.sendKeys("Welcome@123");
			WebElement user_confirmpass = driver.findElement(By.id("password-confirmation"));
			user_confirmpass.clear();
			user_confirmpass.sendKeys("Welcome@123");
			
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"msp-recaptcha-d84b65fc916e7398083ea5f17089d8f1\"]/div/div/iframe")));
			driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).click();
			driver.switchTo().defaultContent();
			
			if(!driver.findElement(By.id("agree_terms")).isSelected())
			{
			driver.findElement(By.id("agree_terms")).click();
			}
			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form-validate\"]/div/div/button/span")));
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form-validate\"]/div/div/button/span")));
//			driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button/span")).click();
//			
			driver.findElement(By.partialLinkText("Back")).click();
			
			System.out.println("As Expected");
			
//			driver.quit();
			
			
	}

}


