package qxpProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbtest1 {

	
	WebDriver d;
	String url="https://www.facebook.com";
	
	@BeforeTest
	
	public void test() {
		
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\VISHAL\\\\\\\\Desktop\\\\\\\\Selenium64bit\\\\\\\\Web Driver\\\\\\\\chromedriver.exe");	
		d=new ChromeDriver();	
		d.get(url);
	
	}
	@Test 
	public void test2() throws InterruptedException {
		
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("vishalrane02@gmail.com");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("behapps");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(2000);
		
	}	
}
