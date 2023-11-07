package qxpProj;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class dataprovider {
	
	 WebDriver d;
	String url="https://biodataking.com/";
	
	
  @Test(dataProvider = "bp")
  public void f(String email,String epass,String ctry,String mob,String pass ) throws InterruptedException {
  
	  d.findElement(By.xpath("(//a[contains(.,'Login')])[1]")).click();
	  Thread.sleep(2000);
	  
	  
	  d.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
  Thread.sleep(2000);
  
  d.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(epass);
  Thread.sleep(2000);
  
  d.findElement(By.xpath("(//input[@class='login'])[1]")).click();
  Thread.sleep(2000);
  
  d.findElement(By.xpath("(//label[contains(.,'Mobile')])[4]")).click();
  Thread.sleep(2000);
  
  
  Select s1=new Select( d.findElement(By.xpath("//select[contains(@id,'code')]")));
  s1.selectByVisibleText(ctry);
  Thread.sleep(2000);
  
  d.findElement(By.xpath("//input[@id='usermobile']")).sendKeys(mob);
  Thread.sleep(2000);
  
  d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(pass);
  Thread.sleep(2000);
  
  d.findElement(By.xpath("(//input[@class='login'])[1]")).click();
  Thread.sleep(2000);
  
	 d.quit();
  
  
  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	 
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\VISHAL\\\\\\\\Desktop\\\\\\\\Selenium64bit\\\\\\\\Web Driver\\\\\\\\chromedriver.exe");
		d=new ChromeDriver();	
	     d.get(url);
	     Thread.sleep(2000);
  }


  @DataProvider
  public Object[][] bp() {
    
	  
	 Object[][] Obj=new Object[3][5];
	 
	  
	 
	 Obj[0][0]="vishalrane02@gmail.com";
	 Obj[0][1]="12322";
     Obj[0][2]="India";
   	 Obj[0][3]="9082368555";
     Obj[0][4]="25656";
	 
     Obj[1][0]="ranevishal@gmail.com";
	 Obj[1][1]="12454";
     Obj[1][2]="India";
   	 Obj[1][3]="9082345585";
     Obj[1][4]="24678";
	 
     Obj[2][0]="vishurane02@gmail.com";
	 Obj[2][1]="16647";
     Obj[2][2]="India";
   	 Obj[2][3]="9072368551";
     Obj[2][4]="256555";
	
     
     return Obj;
  }
     
     @AfterTest
     
     public void aftertest() {
	 
	 
	 System.out.println("test is complete");
	 

	 
	 
    }
  }

