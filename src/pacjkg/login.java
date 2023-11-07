package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\Web Driver\\\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.google.com/");
Thread.sleep(2000);


WebElement signin= d.findElement(By.xpath("//a[@class='gb_4 gb_5 gb_be gb_5c']"));
signin.click();
Thread.sleep(2000);

WebElement email= d.findElement(By.xpath("//input[@type='email']"));
email.sendKeys("vishalrane02@gmail.com");
Thread.sleep(2000);

WebElement nxt= d.findElement(By.xpath("//button[@type='button']"));
nxt.click();
Thread.sleep(2000);

d.navigate().to("https://www.facebook.com/");

d.findElement(By.cssSelector("input.inputtext")).sendKeys("vishal");
Thread.sleep(2000);


d.findElement(By.cssSelector("input#pass")).sendKeys("rane");
Thread.sleep(2000);


d.findElement(By.cssSelector("button[name=login]")).click();
Thread.sleep(2000);

System.out.println("test is passed");
	}

}
