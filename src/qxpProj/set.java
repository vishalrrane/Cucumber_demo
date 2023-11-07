package qxpProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface set {

	
	String key="webdriver.chrome.driver";
	String path="C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\chromedriver.exe";
	String url="https://biodataking.com";
	
	WebDriver d=new ChromeDriver();
	
	By login= By.xpath("(//a[contains(.,'Login')])[1]");
	By user=By.xpath("//input[@id='username']");
	By password=By.xpath("(//input[@type='password'])[2]");
	By submit=By.xpath("//input[@type='submit']");
	
	
	public void biologin() throws InterruptedException;
	public void signup() throws InterruptedException;
	public void footer()throws InterruptedException;
	
	
	
	
	
}
