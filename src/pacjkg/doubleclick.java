package pacjkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\VISHAL\\\\\\\\Desktop\\\\\\\\Selenium64bit\\\\\\\\Web Driver\\\\\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("http://only-testing-blog.blogspot.com/");

	Thread.sleep(2000);
		
		Actions a= new Actions(d);
		
		WebElement dbck=d.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
	a.doubleClick(dbck).perform();
	Thread.sleep(2000);
	
	Alert al=d.switchTo().alert();
	al.accept();  // for clicking ok button
	//al.dismiss(); for clicking cancal button 
	System.out.println("test is passed");
	
	}

}
