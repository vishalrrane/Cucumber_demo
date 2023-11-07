package qxpProj;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class NewTest {
	
	WebDriver d;
	String url="https://biodataking.com";
	
	
	

  @Test(dataProvider = "dp")
  public void f(String email, String pass,String  ctry, String mob, String pass2) throws InterruptedException {
	  
	
	  d.findElement(By.xpath("(//a[contains(.,'Login')])[1]")).click();
	  Thread.sleep(2000);
	  
	  d.findElement(By.xpath("//input[@id='username']")).sendKeys(email); 
	  Thread.sleep(2000);
	  
	  d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(pass);
	  Thread.sleep(2000);
	  
	  d.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(2000);
	  
	  
	  d.findElement(By.xpath("//input[@value='mobile']")).click();
	  Thread.sleep(2000);
	  
	  
	  WebElement ct=d.findElement(By.xpath("//select[contains(@id,'code')]"));
	  Select s1= new Select(ct);
	  s1.selectByVisibleText("India");
	  Thread.sleep(2000);
	  
	  
	  d.findElement(By.xpath("//input[@id='usermobile']")).sendKeys(mob);
	  Thread.sleep(2000);
	  
	  d.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(pass2);
	  Thread.sleep(2000);
	  
	  d.findElement(By.xpath("(//input[@class='login'])[1]")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\VISHAL\\Desktop\\Selenium64bit\\chromedriver.exe");
	  d=new ChromeDriver();
      d.get(url);
	  
	  
	  
  }


  @DataProvider
  public Object[][] dp() {
	  
	  Object[][] obj=new Object[3][5];
	  
	   
	  obj[0][0]="vishalrane02@gmail.com";
	  obj[0][1]="12356";
	  obj[0][2]="India";
	  obj[0][3]="1234567891";
      obj[0][4]="56464";
	  
      
	  obj[1][0]="ranevish02@gmail.com";
	  obj[1][1]="156896";
	  obj[1][2]="Austria";
	  obj[1][3]="9034567891";
      obj[1][4]="55864";
	  
      
      
	  obj[2][0]="vishrr02@gmail.com";
	  obj[2][1]="12356";
	  obj[2][2]="Iran";
	  obj[2][3]="9956464000";
      obj[2][4]="56464";
	  
     
    return obj;
    
  
}}
