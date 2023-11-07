package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class biodataking11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Desktop\\Selenium64bit\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("https://biodataking.com/");
		
		WebElement gender=d.findElement(By.xpath("//select[@id='register-gender']"));
		Select s1=new Select(gender);
		s1.selectByVisibleText("Male");
		Thread.sleep(2000);
	
		
		WebElement rel=d.findElement(By.xpath("//select[@id='cp-religion']"));
		Select s2=new Select(rel);
		s2.selectByVisibleText("Hindu");
		Thread.sleep(2000);
		
		WebElement dob=d.findElement(By.xpath("//button[@class='reg-search-value']"));
		dob.click();
		Thread.sleep(2000);
		
		
		WebElement Day=d.findElement(By.xpath("//select[@id='reg-dob-day']"));
		Select s4=new Select(Day);
		s4.selectByVisibleText("12");
		Thread.sleep(2000);
		
		WebElement Month=d.findElement(By.xpath("//select[@id='reg-dob-month']"));
		Select s5=new Select(Month);
		s5.selectByVisibleText("Sep");
		Thread.sleep(2000);
		
		
		WebElement Yer=d.findElement(By.xpath("//select[@id='reg-dob-year']"));
		Select s6=new Select(Yer);
		s6.selectByVisibleText("1995");
		Thread.sleep(2000);
	
		WebElement Set=d.findElement(By.xpath("//button[@id='set-dob-btn']"));
		Set.click();
		Thread.sleep(2000);
		
		
		
		WebElement  Ctry=d.findElement(By.xpath("//select[@id='reg-mobile-ctry']"));
		Select s7=new Select(Ctry);
		s7.selectByVisibleText("India");
		Thread.sleep(2000);
		
		WebElement  mstatus=d.findElement(By.xpath("//select[@id='reg-mstatus']"));
		Select s8=new Select(mstatus);
		s8.selectByVisibleText("Unmarried");
		Thread.sleep(2000);
		
		
		WebElement  complex=d.findElement(By.xpath("//select[@id='reg-complexion']"));
		Select s9=new Select(complex);
		s9.selectByVisibleText("Fair");
		Thread.sleep(2000);
		
		WebElement  Height=d.findElement(By.xpath("//select[@id='reg-height']"));
		Select s10=new Select(Height);
		s10.selectByVisibleText("5 ft 8 inch");
		Thread.sleep(2000);
		
		
		System.out.println("test case is passd");
		
		d.close();
		
	}

}
