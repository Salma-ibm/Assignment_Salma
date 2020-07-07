package day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://magento.com");
//		WebElement user_icon = driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div"));
		//user_icon.click();
		//user_icon.clear();
//		System.out.println(user_icon.getAttribute("class"));
//		System.out.println(user_icon.getAttribute("id"));
//		System.out.println(user_icon.getCssValue("background-image"));
//		Point user_icon_location = user_icon.getLocation();
//		System.out.println(user_icon_location);
//		byte[] ss = user_icon.getScreenshotAs(OutputType.BYTES);
//		//@SuppressWarnings("resource")
//		FileOutputStream fos = new FileOutputStream("UserIcon.png");
//		fos.write(ss);
		
//		user_icon.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
		//login code
//		WebElement user_ip = driver.findElement(By.id("email"));
//		user_ip.clear();
//		user_ip.sendKeys("salma.murmu@gmail.com");
//		WebElement pwd_ip = driver.findElement(By.id("pass"));
//		pwd_ip.clear();
//		pwd_ip.sendKeys("welcome");
//		driver.findElement(By.id("send2")).click();
//		
//		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"), "Invalid login or password."));
//		System.out.println("As Expected");
		
		//end of login code
		//code for register
		driver.findElement(By.id("register")).click();
		System.out.println("As Expected");
		WebElement user_firstname = driver.findElement(By.id("firstname"));
		user_firstname.clear();
		user_firstname.sendKeys("Salma");
		WebElement user_lastname = driver.findElement(By.id("lastname"));
		user_lastname.clear();
		user_lastname.sendKeys("Murmu");
		WebElement user_email = driver.findElement(By.id("email_address"));
		user_email.clear();
		user_email.sendKeys("salma.murmu@gmail.com");
		WebElement user_password = driver.findElement(By.id("password"));
		user_password.clear();
		user_password.sendKeys("welcome");
		WebElement user_confirmpass = driver.findElement(By.id("password-confirmation"));
		user_confirmpass.clear();
		user_confirmpass.sendKeys("welcome");
		
		System.out.println("As Expected");
		
		
		
		
		
		
//		String error = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
//		System.out.println("Error message is: "+error);
//		if(error.equals("Invalid login or password."))
//		{
//			System.out.println("As Expected");
//		}
		}
	}


