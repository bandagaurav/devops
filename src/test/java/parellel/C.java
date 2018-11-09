package parellel;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class C {

	private final static Logger log = Logger.getLogger(C.class.getName());
	
	@Test
public  void method1() {
		
		
//    System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		System.out.println("Cmethod1"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
		// TODO Auto-generated method stub
		log.info("Cmethod1"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());

		driver.quit();


	}
	
	
	@Test
	public  void method2() {
			
			
//	    System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");

			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.google.com/");
			System.out.println("Cmethod2"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
			// TODO Auto-generated method stub
			log.info("Cmethod2"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());

			driver.quit();


		}
	
	@Test
	public  void method3() {
			
			
//	    System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");

			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.google.com/");
			System.out.println("Cmethod3"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
			// TODO Auto-generated method stub
			//Assert.assertTrue(false);
			log.info("Cmethod3"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
			driver.quit();


		}
}
