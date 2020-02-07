package JavaProgrammes.OPPSConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class TestNgClass {
	WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver(); 
	 
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	  System.out.println("HelloTest1");
	 //driver.close();

  }
  
  @Test
  public void f2() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver(); 
		 
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			  System.out.println("HelloTest2");
//driver.close();
  }
  
  @Test
  public void f4() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver(); 
		 
			driver.get("https://www.gmail.com/");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			  System.out.println("HelloTest3");
	// driver.close();

  }
  @AfterMethod
  public void f3() {
	 
//driver.quit();
  }
}
