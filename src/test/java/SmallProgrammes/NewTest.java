package SmallProgrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		System.out.println("Hi");

		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title WebPage-"+driver.getTitle());
  }
}
