package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//Interface WebDriver
   // ChromeDriver driver = new ChromeDriver();
	//FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
//		driver.close();
//		driver.quit();
		driver.get("http://magento.com");
		//driver.get("http://yahoo.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.startsWith("https"))
		{
			System.out.println("Secured");
		}
		
		if(url.equals("https://magento.com/"))
			//if(url.equals("https://in.yahoo.com/?p=us"))
		{
			System.out.println("As Expected");
		}
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("eCommerce Platforms | Best eCommerce Software for Selling Online | Magento"))
		{
			System.out.println("As Expected");
		}
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.get("http://yahoo.com");
		driver.navigate().to("http://google.com");
	//System.out.println(driver.getCurrentUrl());
	//	driver.quit();
		
	}

}
