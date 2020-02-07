package SmallProgrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class Report {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		System.out.println("Hi");

		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title WebPage-"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Deepali"));	
	}

}
