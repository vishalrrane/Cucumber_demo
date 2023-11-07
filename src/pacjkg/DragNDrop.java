package pacjkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium 64 bit\\Web Driver\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		
		
		d.get("https://www.google.com/");
		Thread.sleep(2000);		
	
	}

}
