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

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,30);
			driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
			
			
			driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/input")).sendKeys("Salma123");
			
			driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("Salma123");
			driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[3]/td[2]/input")).sendKeys("Salma");
			driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[4]/td[2]/input")).sendKeys("Murmu");
			
			driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[5]/td[2]/input")).sendKeys("salma.murmu@gmail.com");
			
			driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[6]/td[2]/input")).sendKeys("Bengaluru");
			
//			Select country = new Select(driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[12]/td[2]/select")));
//			country.selectByValue("Select Value");
//			
//			Select gender = new Select(driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[17]/td[2]/select")));
//			gender.selectByValue("Select Value");
			
//			
			
            driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[21]/td/input[1]")).click();
			
			System.out.println("As Expected");

			
//			driver.quit();
			
			
	}

}


