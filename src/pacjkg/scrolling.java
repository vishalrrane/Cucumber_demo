package pacjkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\Web Driver\\\\chromedriver.exe");
		//System.out.println("Hello");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.android.com/intl/en_in/versions/oreo-8-0/");

		d.manage().timeouts().implicitlyWait(04, TimeUnit.SECONDS); 
		
	
	
	
	JavascriptExecutor js =(JavascriptExecutor)d;
	
	for(int i=1;i<=250;i++)
	{
	js.executeScript("window.scrollBy(0,"+i+");","");
	
	}
		
		
		
	}

}
