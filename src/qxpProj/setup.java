package qxpProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface setup {

	
	String key="webdriver.chrome.driver";
	String path="C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\chromedriver.exe";
	String url="https://biodataking.com";
	
	WebDriver d=new ChromeDriver();
	
	
	By Login=By.xpath("//a[@class='sub-menu-link open-login-modal']");
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='userpassword']");
	By submit=By.xpath("//input[@type='submit']");
	
	
	public void logintest() throws InterruptedException;
	public void signuptest() throws InterruptedException;
	public void footertest()throws InterruptedException;
	
	
	
}
