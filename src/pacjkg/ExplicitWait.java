package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\VISHAL\\\\\\\\Desktop\\\\\\\\Selenium64bit\\\\\\\\Web Driver\\\\\\\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(d,90);
		
		d.get("https://www.google.com/");
		Thread.sleep(2000);		
		
		//before otp
	WebElement sign=d.findElement(By.xpath("//a[contains(.,'Sign in')]"));
	sign.click();
	Thread.sleep(2000);
		
 WebElement  newacc= d.findElement(By.xpath("(//span[contains(.,'Create account')])[2]"));
 newacc.click();
 Thread.sleep(2000);
 
 WebElement my=d.findElement(By.xpath("(//div[contains(.,'For myself')])[8]"));
 my.click();
 Thread.sleep(2000);
 
 WebElement  fname= d.findElement(By.xpath("//input[contains(@name,'firstName')]"));
 fname.sendKeys("vishu");
 Thread.sleep(2000);
 
 WebElement lname  = d.findElement(By.xpath("//input[contains(@id,'lastName')]"));
  lname.sendKeys("rane");
 Thread.sleep(2000);
 
 WebElement  user= d.findElement(By.xpath("//input[contains(@name,'Username')]"));
 user.sendKeys("vishurahh");
 Thread.sleep(2000);
 
 
 
 
 WebElement  pass= d.findElement(By.xpath("//input[@name='Passwd']"));
 pass.sendKeys("Vishu@9082");
 Thread.sleep(2000);
 
 
 WebElement  cpass= d.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
 cpass.sendKeys("Vishu@9082");
 Thread.sleep(2000);
 
 
 WebElement  next= d.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]"));
 next.click();
 Thread.sleep(2000);
 
 WebElement  phone= d.findElement(By.xpath("//input[@id='phoneNumberId']"));
 phone.sendKeys("9082368571");
 Thread.sleep(2000);
 
 
 WebElement  next1= d.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]"));
 next1.click();
 Thread.sleep(2000);
 
 
 //AFTER OTP
 
 WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Recovery email address (optional)']")));
 email.sendKeys("salgar.kshitij@gmail.com");
 Thread.sleep(2000);
 
 
 WebElement mon=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='month']")));
 Select s1=new Select(mon);
s1.selectByVisibleText("July");
 Thread.sleep(2000);
 
 
 WebElement day=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='day']")));
 day.sendKeys("25");
 Thread.sleep(2000);
 
 WebElement year=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='year']")));
 year.sendKeys("1995");
 Thread.sleep(2000);
 
 WebElement gen=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='gender']")));
 Select s2=new Select(gen);
s2.selectByVisibleText("Male");
 Thread.sleep(2000);
 
 
 WebElement nx=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(.,'Next')])[2]")));
 nx.click();
 Thread.sleep(2000);
 
 
	}

}
