package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mous2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Desktop\\Selenium64bit\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[contains(.,'✕')]")).click();
		Thread.sleep(2000);
		Actions a= new Actions(d);
		
		WebElement ele=d.findElement(By.xpath("//span[contains(.,'Electronics')]"));
		a.moveToElement(ele).perform();
		
		WebElement tv=d.findElement(By.xpath("//span[contains(.,'TVs & Appliances')]"));
		a.moveToElement(tv).perform();
		Thread.sleep(2000);
		
		
		
		
		
	}

}
