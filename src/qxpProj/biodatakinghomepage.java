package qxpProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class biodatakinghomepage implements setup,signup,footerlink {

	@BeforeTest
public void propertyset()
	{
		
		System.setProperty(key, path);
		d.get(url);
	}
	

	
	
	
	@Test(priority=1)
	public void logintest() throws InterruptedException {
		// TODO Auto-generated method stub
		
		d.findElement(Login).click();
		Thread.sleep(2000);
		
		d.findElement(username).sendKeys("vishalrane02@gmail.com");
		Thread.sleep(2000);
		
		d.findElement(password).sendKeys("12454555");
		Thread.sleep(2000);
		
		d.findElement(submit).click();
		Thread.sleep(2000);
		
		
		d.navigate().refresh();
		
		
	}

	@Test(priority=2)
	public void signuptest() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebElement gendr=d.findElement(gender);
		Select s1=new Select(gendr);
		s1.selectByVisibleText("Male");
		Thread.sleep(2000);
		
		d.findElement(fname).sendKeys("vishal");
		Thread.sleep(2000);
		
		d.findElement(lname).sendKeys("Rane");
		Thread.sleep(2000);
	
		
	}

	@Test(priority=3)
	public void footertest() throws InterruptedException
	{
		
		footer[0]="//a[contains(.,'Biodata Samples')]";
		footer[1]="//a[@href='/biodata-background']";
		footer[2]="//a[@title='Privacy Policy']";
		
		for(int i=1;i<=footer.length;i++) 
		{
			
			d.findElement(By.xpath(footer[i])).click();
			Thread.sleep(2000);
			
			d.navigate().back();
			Thread.sleep(2000);
			
			
			}
		
	}

	
	
	
	
	
	
	
}
