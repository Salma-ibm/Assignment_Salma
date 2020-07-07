package day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Row_Count_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://html.com/tables/#Table_Code_Sample_Simple_Table");
		
		//int EXPECTED_ROW_COUNT = 2;
		
	//	WebElement parentTable = driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[4]/table")); 
	
	    //WebElement parentTable = wd.findElement(By.xpath("//table[@class='table table-condensed table-hover event-list']/tbody"));
		WebElement TogetRows = driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[4]/table"));
		List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
		
		driver.findElement(By.xpath("//a[@class='pm-cta pm-allow']")).click();
		//driver.findElement(By.xpath("//a[@class='pm-cta pm-cancel-btn']")).click();		
		
		WebElement ToGetColumns = driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[4]/table/tbody"));
		
		//*[@id=\"post-382\"]/div/div[4]/table
		//*[@id="post-382"]/div/div[4]/table/tbody
		//*[@id="post-382"]/div/div[4]/table/tbody/tr[1]

		List<WebElement> TotalColsList = ToGetColumns.findElements(By.tagName("th"));

		System.out.println("Total Number of Columns in the table are: "+TotalColsList.size());
		driver.close();
		System.out.println("As Expected");
	 
	}

}
