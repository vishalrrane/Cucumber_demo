package pacjkg;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\Web Driver\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Windows.html");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[@href='#Tabbed'][contains(.,'Open New Tabbed Windows')]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//button[contains(.,'click')])[1]")).click();
		Thread.sleep(2000);
		System.out.println("current pge is "+d.getTitle());
		
		Set<String> s=d.getWindowHandles();
		
		for(String i:s) {
			
			String t=d.switchTo().window(i).getTitle();
			
			System.out.println(t);
			
		}
		
	}

}
