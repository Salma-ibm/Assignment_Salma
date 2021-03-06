package day5;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcPageAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("footer");
		//driver.switchTo().frame(driver.findElement(By.name("footer")));
		//driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[2]")));
		driver.findElement(By.partialLinkText("Terms and Conditions")).click();
		driver.switchTo().defaultContent();
		
        Set<String> winids = driver.getWindowHandles();	
		//System.out.println(winids);		
		driver.switchTo().window((String) winids.toArray()[1]);
		
		driver.findElement(By.linkText("HDFC Ltd")).click();		
		driver.close();
		
		winids = driver.getWindowHandles();
		driver.switchTo().window((String) winids.toArray()[1]);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"HomepageModalVideo\"]/div/div/div[1]/button")).click();
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"haptik-xdk\"]")));
//		driver.findElement(By.id("Shape")).click();
//		
//		System.out.println("As Expected");
			
		
		driver.quit();
		
	}

}
