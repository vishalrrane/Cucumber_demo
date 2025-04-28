package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	private static final WebDriver WebDriver = null;

	WebDriver driver;

	@FindBy(xpath = "//li[@class='oxd-userdropdown']")
	WebElement profile;

	@FindBy(xpath = "//*[text()='Logout']")
	WebElement logoutlink;

	@FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement admin;

	@FindBy(xpath = "//*[contains(text(),'User Management')]")
	WebElement user;

	public Homepage(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(d, this);
	}

	public void click_profile() {

		profile.click();
	}

	public WebDriver logoutlink_verify() {

		if (logoutlink.isDisplayed() == true) {
			System.out.println("Link is Displayed");
		}
		return driver;
        
		
		 
	}

	public  void click_admin() {

		admin.click();
	}

	public void verify_user() {

		if (user.isDisplayed() == true) 
		{
			System.out.println("user Link is Displayed");
		}
          
	}

}
