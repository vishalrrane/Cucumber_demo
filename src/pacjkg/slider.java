package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\Web Driver\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[contains(.,'✕')]")).click();
		Thread.sleep(2000);
		
		WebElement search= d.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Mi");
		Thread.sleep(2000);
		
		d.findElement(By.className("vh79eN")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//a[contains(.,'Mobiles')])[4]")).click();
		Thread.sleep(2000);
		
		
		Actions a=new Actions(d);
		WebElement slider=d.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"));
		Thread.sleep(2000);
		a.dragAndDropBy(slider, 136, 0).build().perform();	
		Thread.sleep(2000);
		
		

		
		
		
	}

}
