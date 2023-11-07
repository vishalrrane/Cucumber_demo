package qxpProj;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class biotest implements set,sign,footer{


  @BeforeTest
  public void setproperty()  {
	  
	  System.setProperty(key, path);
	  d.get(url);

	
  }

@Test(priority=1)
public void biologin() throws InterruptedException {
	// TODO Auto-generated method stub
	
	d.findElement(login).click();
	Thread.sleep(2000);
	
	d.findElement(user).sendKeys("vishalrane02@gmail.com");
	Thread.sleep(2000);
	
	d.findElement(password).sendKeys("12345");
	Thread.sleep(2000);
	
	d.findElement(submit).click();
	Thread.sleep(2000);
	
	d.navigate().refresh();
	
	
	
}

@Test(priority=2)
public void signup() throws InterruptedException {
	// TODO Auto-generated method stub
	
	
	WebElement gen=d.findElement(gender);
	Select s1= new Select(gen);
	s1.selectByVisibleText("Male");
	Thread.sleep(2000);
	
	d.findElement(fname).sendKeys("vishal");
	Thread.sleep(2000);
	
	d.findElement(lname).sendKeys("rane");
	Thread.sleep(2000);
	
	d.navigate().refresh();
	
	
	
	
}

@Test(priority=3)
public void footer() throws InterruptedException {
	// TODO Auto-generated method stub
	
	
	link[0]="//a[contains(.,'Biodata Samples')]";
	link[1]="//a[@href='/biodata-background']";
	link[2]="//a[@title='Privacy Policy']";
	
	
	for(int i=0;i<link.length;i++) {
		
		
		d.findElement(By.xpath(link[i])).click();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		
	}
	
}
}
