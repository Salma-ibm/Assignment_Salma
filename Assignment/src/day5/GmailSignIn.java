package day5;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Sign in")).click();
		//main window id
		String parent = driver.getWindowHandle();
		
	//All available window ids
		Set<String> winids = driver.getWindowHandles();
		
		System.out.println(winids);
		
		driver.switchTo().window((String) winids.toArray()[1]);
		driver.findElement(By.id("identifierId")).sendKeys("salma.murmu@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		driver.close();
		//driver.switchTo().window((String) winids.toArray()[0]);
		driver.switchTo().window(parent);
		driver.findElement(By.linkText("For Work")).click();
		winids = driver.getWindowHandles();
		//driver.close();
		driver.switchTo().window((String) winids.toArray()[1]);
		//driver.close();
		System.out.println("As Expected");
	}

}
