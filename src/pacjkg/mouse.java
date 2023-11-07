package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Desktop\\Selenium64bit\\Web Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[contains(.,'✕')]")).click();
		Thread.sleep(2000);
		Actions a= new Actions(d);
		
		WebElement ele=d.findElement(By.xpath("//span[contains(.,'Electronics')]"));
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		
	d.findElement(By.linkText("Mi")).click();
	Thread.sleep(2000);	
	
	
	
	WebElement praice= d.findElement(By.xpath("(//div[contains(@class,'_3aQU3C')])[2]"));
	a.moveByOffset(-5000, 0);
	Thread.sleep(2000);
		
	
	WebElement Ram=d.findElement(By.xpath("(//div[contains(.,'RAM')])[11]"));
	Ram.click();
	Thread.sleep(2000);
	
	d.findElement(By.xpath("(//div[contains(@class,'1p7h2j')])[6]")).click();
	
	d.navigate().refresh();
	d.findElement(By.xpath("(//div[contains(@class,'1p7h2j')])[5]")).click();

	
	
	
	}

}
