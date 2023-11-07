package pacjkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlvalidation {

	public static void main(String[] args) throws InterruptedException, IOException ,MalformedURLException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\Web Driver\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		String url="https://www.kyatrade.com/";
		HttpURLConnection http=null;	
		String testurl="";
	d.manage().window().maximize();
	
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	d.get(url);
	Thread.sleep(2000);
		
		//find link by anchor tag 
		List<WebElement> links=d.findElements(By.tagName("a"));
		
		//total numbaer of links
		
		System.out.println("total number of links"+links.size());
		Thread.sleep(2000);
		
		
		Iterator<WebElement> iter =links.iterator();
		
		while (iter.hasNext()) {
			
			testurl=iter.next().getAttribute("href");
		
			
			if(testurl==null|| testurl.isEmpty())
			{
			
			System.out.println(testurl+"anchor tag not specify");
			continue;
			
		}    // checking with same domain name
			
			//http connection 
			 http=(HttpURLConnection)(new URL(testurl)).openConnection();
				
				http.connect();
				
				Thread.sleep(2000);
				
			//Response code 
				int response=http.getResponseCode();
				
				if (response>=400) {
					
					
					System.out.println(testurl+ "link is broken");
					
					
				}else {
					System.out.println(testurl+ "   link is valid");
				}
				
					
		}
			
			
		}
			
	
	}


