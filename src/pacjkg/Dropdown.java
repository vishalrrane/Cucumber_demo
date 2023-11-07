package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\VISHAL\\\\\\\\Desktop\\\\\\\\Selenium64bit\\\\\\\\Web Driver\\\\\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://biodataking.com/");
		Thread.sleep(2000);
		
		
		WebElement gender=d.findElement(By.xpath("//select[@id='register-gender']"));
		Select s1= new Select(gender);
		s1.selectByVisibleText("Male");
		Thread.sleep(2000);
		
		WebElement rel =d.findElement(By.xpath("//select[@id='cp-religion']"));
		Select s2=new Select(rel);
		s2.selectByVisibleText("Hindu");
		Thread.sleep(2000);
		
		WebElement dob =d.findElement(By.xpath("//button[contains(.,'Date Of Birth')]"));
		dob.click();
		Thread.sleep(2000);
		
		WebElement Day =d.findElement(By.xpath("//select[@id='reg-dob-day']"));
		Select s3=new Select(Day);
		s3.selectByVisibleText("29");
		Thread.sleep(2000);
		
		WebElement Month =d.findElement(By.xpath("//select[@id='reg-dob-month']"));
		Select s4=new Select(Month);
		s4.selectByVisibleText("Sep");
		Thread.sleep(2000);
		
		
		
		
		WebElement Year =d.findElement(By.xpath("//select[@id='reg-dob-year']"));
		Select s5=new Select(Year);
		s5.selectByVisibleText("1994");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[contains(.,'Set')]")).click();
		
		Thread.sleep(2000);
	d.close();
	
		
		System.out.println("test is passed");
		
		
	}

}
