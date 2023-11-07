package pacjkg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class NewTest1 {
	
	WebDriver w;
	String url="https://biodataking.com/";

  
  @Test (priority=1)
  public void LogIn() throws InterruptedException
  {
	  
	  
	  
	  
	   w.findElement(By.xpath("(//a[contains(.,'Login')])[1]")).click();
	   Thread.sleep(2000);
	   
	   w.findElement(By.xpath("//input[@id='username']")).sendKeys("salgar.kshitij@gmail.com");
	   Thread.sleep(2000);
	   
	   w.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("salgar@786");
	   Thread.sleep(2000);
	   
	   w.findElement(By.xpath("//input[@value='Login']")).click();
	   Thread.sleep(2000);
	   
	  
          Actions a = new Actions(w);
	   
	   String s[]=new String[4];
	   
	   s[0]="(//a[contains(.,'Biodata Maker')])[1]";
	   s[1]="(//a[contains(.,'Profiles eBook')])[1]";
	   s[2]="(//a[contains(.,'My Profile')])[1]";
	   s[3]="(//a[contains(.,'Edit Profile')])[1]";
	   
		
		
		for(int i=0; i<s.length; i++)
		{
		    WebElement MOver=w.findElement(By.xpath(s[i]));
		    Thread.sleep(100);
			a.moveToElement(MOver).perform();
			Thread.sleep(2000);
		}
		
	
	   WebElement EditmyProfile=w.findElement(By.xpath("(//a[contains(.,'Edit My Profile')])[1]"));
	   EditmyProfile.click();
	   Thread.sleep(2000);
	  
	   
	   
  }
  
  
  @Test(enabled=false)
  public void f() throws InterruptedException {
	  
	  WebElement edit=w.findElement(By.xpath("(//input[@value='Edit'])[1]"));
	    edit.click();
	    Thread.sleep(2000); 
	   

	    JavascriptExecutor js=(JavascriptExecutor)w;
	    WebElement Fname=w.findElement(By.xpath("//input[@placeholder='First Name']"));
	    js.executeScript("arguments[0].removeAttribute('disabled')", Fname);
	    Fname.clear();
	    Fname.sendKeys("Yash");
	    Thread.sleep(2000);
	    
	    
	  WebElement Height=w.findElement(By.xpath("//select[@id='cp-height']"));
		Select s8=new Select(Height);
		s8.selectByVisibleText("5 ft 4 inch");
		Thread.sleep(2000);
		
		WebElement weight=w.findElement(By.xpath("//input[@id='cp-weight']"));
		weight.clear();
		weight.sendKeys("67");
		Thread.sleep(2000);
		
		WebElement complexion=w.findElement(By.xpath("//select[@id='cp-complexion']"));
		Select s9=new Select(complexion);
		s9.selectByVisibleText("Fair");
		Thread.sleep(2000);
		
		
		WebElement graduation=w.findElement(By.xpath("//select[@id='cp-gtype']"));
		Select s10=new Select(graduation);
		s10.selectByVisibleText("Graduate");
		Thread.sleep(2000);
		
		WebElement diet=w.findElement(By.xpath("//select[@id='cp-diet']"));
		Select s11=new Select(diet);
		s11.selectByVisibleText("Occasionally Non-Veg");
		Thread.sleep(2000);
		
		WebElement BType=w.findElement(By.xpath("//select[@id='cp-body-type']"));
		Select s12=new Select(BType);
		s12.selectByVisibleText("Average");
		Thread.sleep(2000);
		
		WebElement Lang=w.findElement(By.xpath("//span[contains(@class,'lang')]"));
		Lang.click();
		Thread.sleep(2000);
		
		WebElement marathi=w.findElement(By.xpath("//label[contains(.,'Akan')]"));
		marathi.click();
		Thread.sleep(2000);
		
		WebElement english=w.findElement(By.xpath("//label[contains(.,'Amharic')]"));
		english.click();
		Thread.sleep(2000);
		
		WebElement hindi=w.findElement(By.xpath("//label[contains(.,'Arabic')]"));
		hindi.click();
		Thread.sleep(2000);
		

		WebElement BGroup=w.findElement(By.xpath("//select[@id='cp-bgroup']"));
		Select s13=new Select(BGroup);
		s13.selectByVisibleText("B+ve");
		Thread.sleep(2000);
		
		WebElement HIV=w.findElement(By.xpath("//select[@id='cp-hiv']"));
		Select s14=new Select(HIV);
		s14.selectByVisibleText("HIV Not Affected");
		Thread.sleep(2000);
		
		WebElement challanged=w.findElement(By.xpath("//select[@id='cp-challenged']"));
		Select s15=new Select(challanged);
		s15.selectByVisibleText("No");
		Thread.sleep(2000);
		
		WebElement Diseased=w.findElement(By.xpath("//select[@id='cp-diseased']"));
		Select s16=new Select(Diseased);
		s16.selectByVisibleText("No");
		Thread.sleep(2000);
		
		WebElement smoking=w.findElement(By.xpath("//select[@id='cp-smoking']"));
		Select s17=new Select(smoking);
		s17.selectByVisibleText("No");
		Thread.sleep(2000);
		
		WebElement Drinking=w.findElement(By.xpath("//select[@id='cp-drinking']"));
		Select s18=new Select(Drinking);
		s18.selectByVisibleText("No");
		Thread.sleep(2000);
		
		WebElement C_city=w.findElement(By.xpath("//input[@id='cc-tmc-search-city']"));
		C_city.clear();
		C_city.sendKeys("Titwala");
		Thread.sleep(2000);
		
		WebElement Hcity=w.findElement(By.xpath("//input[@id='hc-tmc-search-city']"));
		Hcity.clear();
		Hcity.sendKeys("Mumbai");
		Thread.sleep(2000);
		
		WebElement save=w.findElement(By.xpath("(//input[@value='Save'])[1]"));
		save.click();
		Thread.sleep(2000);
	  
	  
	  
	  
  }
  @Test(enabled=false)
  public void Educational_Details() throws InterruptedException
  {
	   WebElement edit2=w.findElement(By.xpath("(//input[@value='Edit'])[2]"));
	   edit2.click();
	   Thread.sleep(2000);
	   
	   WebElement Qualification=w.findElement(By.xpath("//select[@id='cp-ug-quali']"));
	   Select s20=new Select(Qualification);
	   s20.selectByVisibleText("B.A");
	   Thread.sleep(2000);
	   
	   WebElement EC=w.findElement(By.xpath("//select[@id='cp-ug-cat']"));
	   Select s21=new Select(EC);
	   s21.selectByVisibleText("Automobile");
	   Thread.sleep(2000);
	   
	   WebElement Cname=w.findElement(By.xpath("(//input[contains(@placeholder,'Name of Institute/College')])[1]"));
	   Cname.clear();
	   Cname.sendKeys("RJ college");
	   Thread.sleep(2000);
	   
	   WebElement Uname=w.findElement(By.xpath("(//input[@placeholder='Name of University'])[1]"));
	   Uname.clear();
	   Uname.sendKeys("Mumbai University");
	   Thread.sleep(2000);
	   
  }
  
  @Test(priority=2)
  public void awared() throws InterruptedException
  {
  
  
  
  WebElement edit4=w.findElement(By.xpath("(//input[@value='Edit'])[4]"));
  edit4.click();
  Thread.sleep(2000);
  
  WebElement award1=w.findElement(By.xpath("//input[@id='input-awards']"));
  award1.clear();
  award1.sendKeys("Arjun Puraskar");
  Thread.sleep(2000);
  
  WebElement year1=w.findElement(By.xpath("//select[@id='awards-year']"));
  Select s27=new Select(year1);
  s27.selectByVisibleText("2014");
  Thread.sleep(2000);
  
  WebElement award2=w.findElement(By.xpath("//input[contains(@id,'input-awards')]"));
  award2.clear();
  award2.sendKeys("khelRatna Puraskar");
  Thread.sleep(2000);
  
  WebElement year2=w.findElement(By.xpath("//select[@id='awards-year']"));
  Select s28=new Select(year2);
  s28.selectByVisibleText("2016");
  Thread.sleep(2000);
  
  WebElement save4=w.findElement(By.xpath("(//input[@value='Save'])[5]"));
  save4.click();
  Thread.sleep(2000);

  WebElement EditmyProfile=w.findElement(By.xpath("(//a[contains(.,'Edit My Profile')])[1]"));
  EditmyProfile.click();
  Thread.sleep(2000);
  
  WebElement family=w.findElement(By.xpath("(//a[@class='sub-menu-link-l2'][contains(.,'Family')])[1]"));
	family.click();
	Thread.sleep(2000);
  
  }
  @BeforeTest
  public void beforeTest() {
 
  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\chromedriver.exe");
  w=new ChromeDriver();
  w.get(url);
  
  
  }}
