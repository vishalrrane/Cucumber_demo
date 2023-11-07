package qxpProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	
	public void a() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\VISHAL\\\\\\\\Desktop\\\\\\\\Selenium64bit\\\\\\\\Web Driver\\\\\\\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("http://quickxpert.in/site-map");
		
		String cty[]=new String[6];
		cty[0]="//b[contains(.,'Airoli Mumbai')]";
		cty[1]="//b[contains(.,'Ambernath Mumbai')]";
		cty[2]="//b[contains(.,'Ambivili Mumbai')]";
		cty[3]="//b[contains(.,'Andheri Mumbai')]";
		cty[4]="//div[@class='city'][contains(.,'Asangaon Mumbai')]";
		cty[5]="//b[contains(.,'Atgaon Mumbai')]";
		
		
		
		for(int i=0;i<cty.length;i++)
		{
			WebElement city=d.findElement(By.xpath(cty[i]));
			city.click();
			Thread.sleep(2000);
			d.navigate().back();
			
		}
	}
}
