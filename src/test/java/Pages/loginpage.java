package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	WebDriver driver ;
	
	By txtuname = By.name("username");
	By txtpass = By.name("password");
	By btnlogin =By.xpath("//button[@type='submit']");
	
	
	public loginpage(WebDriver d){
		
		this.driver = d;
		
		if(!d.getTitle().contentEquals("OrangeHRM")) {
			
			throw new  IllegalStateException("this is not a login page  The Current Page url is " +d.getCurrentUrl());
		}
		
		
	}
	


	public void enteruserneme(String uname) {
		
		driver.findElement(txtuname).sendKeys(uname);
	}	
	
	public void enterpssword(String pass) {
		
		driver.findElement(txtpass).sendKeys(pass);
	}
	
	public void clickonbtn() {
		
		driver.findElement(btnlogin).click();
	}
	
	
	
}
