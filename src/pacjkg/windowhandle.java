package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://adam.goucher.ca/parkcalc/");
		Thread.sleep(2000);
		
		String parent=d.getWindowHandle();
		d.findElement(By.xpath("(//img[@alt='Pick a date'])[1]")).click();
		
		for (String child:d.getWindowHandles())
		{	
			d.switchTo().window(child);	
		}
		
		
	WebElement month =d.findElement(By.xpath("//select[contains(@name,'MonthSelector')]"));
	Select s1=new Select(month);
	s1.selectByVisibleText("September");
	Thread.sleep(2000);
	
	for(int i=1;i<=3;i++) {
		
		d.findElement(By.linkText(">")).click();
		
	}
	
	Thread.sleep(2000);
	
	d.findElement(By.linkText("29")).click();
Thread.sleep(2000);


d.switchTo().window(parent);

	
		
		
	}

}
