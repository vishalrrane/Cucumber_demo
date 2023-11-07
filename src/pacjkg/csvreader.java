package pacjkg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;

public class csvreader {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\VISHAL\\\\\\\\Desktop\\\\\\\\Selenium64bit\\\\\\\\Web Driver\\\\\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(2000);	
		
		CSVReader csv=new CSVReader(new FileReader("C:\\Users\\VISHAL\\Desktop\\test.csv"));
		
		String cell[];
		
		while ((cell=csv.readNext())!=null) {
			
			String fname=cell[0];
			String lname=cell[1];
			String user=cell[2];
			String  pass=cell[3];
			String cpass=cell[4];
		
			
		
		
		
		d.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='Username']")).sendKeys(user);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(pass);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys(cpass);
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//span[contains(.,'Next')])[2]")).click();
		
	d.navigate().refresh();
		
		}
		}

}
