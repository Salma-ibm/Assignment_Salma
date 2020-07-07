package day4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {

	public static void main(String[] args) throws FileNotFoundException, WebDriverException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://demowebshop.tricentis.com");
		new FileOutputStream("SS1.jpg").write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		new FileOutputStream("SS2.jpg").write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
		driver.findElement(By.id("Email")).sendKeys("salma.murmu@gmail.com");
		new FileOutputStream("SS3.jpg").write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
		driver.findElement(By.id("Password")).sendKeys("Welcome@123");
		new FileOutputStream("SS4.jpg").write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		new FileOutputStream("SS5.jpg").write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		new FileOutputStream("SS6.jpg").write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
		
		System.out.println("As Expected");
		
	}
	

}
