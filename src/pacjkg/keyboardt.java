package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\Web Driver\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		
		WebElement fname =d.findElement(By.xpath("(//input[contains(@class,'6luy')])[1]"));
		fname.sendKeys("vishal");
		Thread.sleep(2000);
		fname.sendKeys(Keys.CONTROL,"a");
		fname.sendKeys(Keys.CONTROL,"c");
		
		WebElement lname=d.findElement(By.xpath("//input[@id='pass']"));
		lname.sendKeys("rane");
		Thread.sleep(2000);
		
	    WebElement mob=d.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]"));
		mob.sendKeys(Keys.CONTROL,"v");
		
		
		
		
	}

}
