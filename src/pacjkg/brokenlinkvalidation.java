package pacjkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinkvalidation {

	public static void main(String[] args) throws InterruptedException, IOException,MalformedURLException{
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\VISHAL\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Selenium64bit\\\\\\\\\\\\\\\\Web Driver\\\\\\\\\\\\\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
	
		//maximize the window
		d.manage().window().maximize();
		
		//apply implicit wait
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		//open URL
		d.get("https://www.kyatrade.com/");
		
		//wait
		Thread.sleep(5000);
		
		//capture links from website
		
		List<WebElement> links=d.findElements(By.tagName("a"));
		//no of links 	
		System.out.println("total number of links"+links.size());
		
		//
		for(int i = 0;i<links.size();i++) {
		
		//by using href property
			
			WebElement element=links.get(i);
		String url=element.getAttribute("href");
		
		URL link=new URL(url);
		
		//create url connection
		
		HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
		//wait
		Thread.sleep(2000);
		
		httpconn.connect();
		
	
		int response=httpconn.getResponseCode();//if response code greater than 400- link is broken
		Thread.sleep(3000);
		
		
		if(response>=400) {
		
			System.out.println(url+ "" + "is broken links");
		}else {
			
			System.out.println(url + "" + "is valid links");
			
			
			httpconn.disconnect();
		}
			
			
		}
		
		
		
		}
	
}
	

	




