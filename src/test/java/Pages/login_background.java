package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_background {
	

	
	WebDriver driver ;
	
	
	@FindBy(name = "username")
	WebElement txtuname;
	

	@FindBy( name = "password")
	WebElement txtpass;
	
	@FindBy( xpath = "//button[@type='submit']")
	WebElement loginbtn;
	
	public login_background(WebDriver driver){
		
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enteruserneme(String uname) {
		
		txtuname.sendKeys(uname);
	}	
	
	public void enterpssword(String pass) {
		
		txtpass.sendKeys(pass);
	}
	
	public void clickonbtn() {
		
		loginbtn.click();
	}
	
	

}
