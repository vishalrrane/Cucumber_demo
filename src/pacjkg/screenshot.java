package pacjkg;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.graphbuilder.curve.Point;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

           System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\Web Driver\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		
		
		d.findElement(By.xpath("//button[contains(.,'✕')]")).click();
Thread.sleep(2000);

File screenshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshot,new File("C:\\Users\\VISHAL\\Desktop\\screenshots\\screen.jpg"));

Thread.sleep(2000);

	System.out.println("screeshot is capture and store in desktop");
	
	
	}
		
	}


