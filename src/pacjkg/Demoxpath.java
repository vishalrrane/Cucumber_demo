package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		
		// by using syntax       //tag[@attribute='value']
		
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("vishal"); 
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Rane");
		Thread.sleep(2000);
		
		//by using syntax      //tag[contains(@attribute,'value')]
		
		
		d.findElement(By.xpath("//textarea[contains(@class,'form-control')]")).sendKeys("hfhhffff");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("vishalrane125@gmail.com");
		Thread.sleep(2000);
		
		
		//by using syntax  //tag[starts-with(@attribute,'value')]
		
		
		
		d.findElement(By.xpath("//input[starts-with(@value,'Male')]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
