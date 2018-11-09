package parellel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class B {

	
	
	@Test
public  void main2() {
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		System.out.println("B"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());

		driver.quit();

	
	}
}
