package pacjkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class selectandhold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\Web Driver\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		
		Thread.sleep(2000);
		
		
		
		
		
		Actions a=new Actions(d);
		
		List<WebElement> sel = d.findElements(By.xpath("//ol[@id='selectable']/*"));
		
		a.clickAndHold(sel.get(0)).clickAndHold(sel.get(5)).click();
		
		Action an=a.build();
		an.perform();
		
		
	}

}
