package parellel;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	private final static Logger log = Logger.getLogger(A.class.getName());

	
	
	
@Test
	public  void methodone() {
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Amethodone"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
		// TODO Auto-generated method stub
		log.info("Amethodone"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());

		
		
		driver.quit();
	}








@Test
public  void methodtwo() {
	
	
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	System.out.println("Amethodtwo"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
	// TODO Auto-generated method stub
	log.info("Amethodtwo"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
	driver.quit();
}
@Test
public  void methodthree() {
	
	
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	System.out.println("Amethodthree"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
	// TODO Auto-generated method stub
	log.info("Amethodthree"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
	driver.quit();
}
@Test
public  void methodfour() {
	
	
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	System.out.println("Amethodfour"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
	// TODO Auto-generated method stub
	log.info("Amethodfour"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
	driver.quit();
}
@Test
public  void methodfive() {
	
	
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	System.out.println("Amethodfive"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
	// TODO Auto-generated method stub
	log.info("Amethodfive"+Thread.currentThread().getId()+"name"+Thread.currentThread().getName()+"time"+System.currentTimeMillis());
	driver.quit();
}
}
