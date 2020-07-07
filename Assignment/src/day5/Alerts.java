package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	code for alerts
//		driver.get("http://www.echoecho.com/javascript4.htm");
//		Thread.sleep(3000);
////	    driver.findElement(By.name("B1")).click();
////		driver.findElement(By.name("B2")).click();
//		driver.findElement(By.name("B3")).click();
//		driver.switchTo().alert().sendKeys("Hello");
//		Thread.sleep(5000);
//		System.out.println(driver.switchTo().alert().getText());
////	    driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		// end of alert code
		
//		driver.get("https://naukri.com");
//		driver.findElement(By.id("file_upload")).sendKeys("C:\\Users\\SalmaMurmu\\Desktop\\Salma_CV .docx");
		driver.get("https://www.sejda.com/pdf-editor");
		driver.findElement(By.name("file")).sendKeys("C:\\Users\\SalmaMurmu\\Desktop\\Salma_CV.pdf");
		
		driver.findElement(By.id("save-pdf-btn")).click();
		
//		driver.findElement(By.partialLinkText("Download")).click();
		
		System.out.println("As Expected");
		
	}

}
