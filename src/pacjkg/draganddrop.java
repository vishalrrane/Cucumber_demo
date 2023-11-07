package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\VISHAL\\\\\\\\Desktop\\\\\\\\Selenium64bit\\\\\\\\Web Driver\\\\\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
		Thread.sleep(2000);
		Actions a=new Actions(d);
		WebElement ele1=d.findElement(By.xpath("(//div[contains(.,'Drag me to my target')])[21]"));
		WebElement  ele2=d.findElement(By.xpath("//div[@id='dropdiv']"));
		
		a.dragAndDrop(ele1, ele2).build().perform();
		
		
		System.out.println("test is passed");
		
		
	}

}
