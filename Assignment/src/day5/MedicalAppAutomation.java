package day5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicalAppAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://demo.openemr.io/a/openemr");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
//		driver.findElement(By.id("clearPass")).submit();
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")).click();
//		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//button")).click();
		
//		WebElement user_name = driver.findElement(By.id("authUser"));
//		user_name.clear();
//		user_name.sendKeys("admin");
//		WebElement user_password = driver.findElement(By.id("clearPass"));
//		user_password.clear();
//		user_password.sendKeys("pass");
//			
//		Select language = new Select(driver.findElement(By.name("languageChoice")));
//		language.selectByIndex(0);
//		
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")).click();
		
//		Actions act = new Actions(driver);
//    	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/div"))).perform();
//    	
//    	driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div")).click();
//    	
//    	driver.findElement(By.xpath("//*[@id=\"tabs_div\"]/div/div[4]/span[1]")).click();
//    	
//    	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"framesDisplay\"]/div[3]/iframe")));
//    	
//    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
//    	Select name = new Select(driver.findElement(By.id("form_title")));
//        name.selectByValue("Mrs.");
        
//        driver.findElement(By.id("form_fname")).sendKeys("Salma");
//		driver.findElement(By.id("form_lname")).sendKeys("Murmu");
//		driver.findElement(By.id("form_DOB")).sendKeys("2020-06-11");
//		
//		Select sex = new Select(driver.findElement(By.id("form_sex")));
//        sex.selectByValue("Female");
//		
//        driver.findElement(By.id("create")).click();
//		driver.switchTo().defaultContent();
		
		Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//div[text()='Patient/Client']"))).perform();
        driver.findElement(By.xpath("//div[text()='New/Search']")).click();
        Thread.sleep(3000);
        driver.switchTo().frame("pat");
        Select title = new Select(driver.findElement(By.id("form_title")));
        title.selectByValue("Mrs.");
        driver.findElement(By.id("form_fname")).sendKeys("Salma");
        driver.findElement(By.id("form_lname")).sendKeys("Murmu");
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(dt));
        driver.findElement(By.id("form_DOB")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("xdsoft_today")).click(); 
        //by myself
        Select sex = new Select(driver.findElement(By.id("form_sex")));
        sex.selectByValue("Female");
        
        driver.findElement(By.id("create")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("modalframe");		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
		driver.switchTo().defaultContent();	
		
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.switchTo().frame("modalframe");		
		Thread.sleep(3000);
		driver.findElement(By.className("h2")).getText();
		driver.switchTo().defaultContent();	
		
		driver.findElement(By.className("closeDlgIframe")).click(); 
		act.moveToElement(driver.findElement(By.className("userSection"))).perform();
	    driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
		System.out.println("As Expected");
	
		
	}

}
