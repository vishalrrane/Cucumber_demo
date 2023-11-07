package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democssselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		
		d.findElement(By.cssSelector("input.form-control")).sendKeys("vishal");           // tag & class
		Thread.sleep(2000);

		d.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("rane"); //tag & attribute 
	Thread.sleep(2000);
	
	d.findElement(By.cssSelector("textarea.form-control")).sendKeys("aaaaaaaaaaaaa");      //tag & class
	Thread.sleep(2000);
	
	d.findElement(By.cssSelector("input[type=email]")).sendKeys("vishalrane02@");         //tag & class
	Thread.sleep(2000);
	
	d.findElement(By.cssSelector("input#checkbox1")).click();                              //tag & Id

	Thread.sleep(2000);
	
	d.findElement(By.cssSelector("input.form-control[type=password]")).sendKeys("123222");   //tag , class & Attribute
	Thread.sleep(2000);
	
	}
	
	
	
	

}
