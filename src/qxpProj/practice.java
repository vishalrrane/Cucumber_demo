package qxpProj;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.awt.SecondaryLoop;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class practice  {
  
	
	WebDriver d;
	String url="https://www.google.com";
	Actions a;	
	
	@Test
  public void f() {
  }
  @BeforeMethod
  public void biologin() throws InterruptedException {
	  
	  d.findElement(By.xpath("(//a[contains(.,'Login')])[1]")).click();
	  Thread.sleep(2000);
	  
	WebElement email=  d.findElement(By.xpath("//input[@value='email']"));
	email.click();
  Thread.sleep(2000);
  
  WebElement userid= d.findElement(By.xpath("//input[@id='username']"));
  WebElement pass= d.findElement(By.xpath("//input[@id='userpassword']"));
	  
	  
  if(email.isSelected()) {
	  
	  userid.sendKeys("vishalrane02@gmil.com");
	  Thread.sleep(2000);
	  
	  pass.sendKeys("12345");
	  Thread.sleep(2000);
	  
  }
	 
	 d.findElement(By.xpath("//input[@type='submit']")).click();
	 Thread.sleep(2000);
	 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 
	 WebElement mob=d.findElement(By.xpath("//input[@value='mobile']"));
	 mob.click();
	 Thread.sleep(2000);
	
	  if(mob.isSelected()) {
		
		  WebElement contry=d.findElement(By.xpath("//select[contains(@id,'code')]"));
		  Select s1=new Select(contry); 
		s1.selectByVisibleText("India");
		Thread.sleep(2000);		
		d.findElement(By.xpath("//input[@id='usermobile']")).sendKeys("12345");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("456464");
         Thread.sleep(2000);		
		
		d.findElement(By.xpath("(//input[@class='login'])[1]")).click();
	 
	  Thread.sleep(2000);
	  
	  
	  }
	 
	 
	 
	  
	  
  }

  @BeforeClass
  public void fblogin() throws InterruptedException,IOException{
	  
	d.findElement(By.xpath("//button[contains(.,'✕')]")).click();
	Thread.sleep(2000);
	
	WebElement ele=d.findElement(By.xpath("//span[contains(.,'Electronics')]"));
	Actions a= new Actions(d);
	  a.moveToElement(ele).perform();
	  Thread.sleep(2000);
	  
	d.findElement(By.linkText("Mi")).click();
	Thread.sleep(2000);
	  
	
	WebElement slider=d.findElement(By.xpath("//div[@class='_3aQU3C']"));
	  a.dragAndDropBy(slider, 100, 0).perform();
	  Thread.sleep(2000);
	  
	  d.navigate().to("https://biodataking.com/");
	  
  }

  @BeforeTest
  public void signintest() throws InterruptedException {
	  
	   WebElement sign=d.findElement(By.xpath("//a[@id='gb_70']"));
	  sign.click();
	
	  d.findElement(By.xpath("//input[@type='email']")).sendKeys("vishalrane02@gmail.com");
	 Thread.sleep(2000);
	  d.findElement(By.xpath("(//span[contains(.,'Next')])[2]")).click();
	 Thread.sleep(2000);
	  
	  d.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Vish@6647rane");
	  Thread.sleep(2000);
	  
	  d.findElement(By.xpath("(//span[contains(.,'Next')])[1]")).click();
	  Thread.sleep(2000);
	  
	
	 d.navigate().to("https://www.flipkart.com/");
	  Thread.sleep(2000);
  }

  @BeforeSuite
  public void setup() throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\VISHAL\\Desktop\\Selenium64bit\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get(url);
	  Thread.sleep(2000);
	  
	  
  }

}
