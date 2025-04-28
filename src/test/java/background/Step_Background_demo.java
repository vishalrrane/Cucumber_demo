package background;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Homepage;
import Pages.login_background;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Step_Background_demo {
	

	   WebDriver d ;
	   login_background lb;
	   Homepage   HP ; 
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d= new ChromeDriver();	
		
	}
	
	
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
	    // Write code here that turns the phrase above into concrete actions
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enter username {string} &  password {string}")
    public void user_enter_username_password(String uname, String pass) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lb = new login_background(d);
		lb.enteruserneme(uname);
		Thread.sleep(2000);
		lb.enterpssword(pass);
		Thread.sleep(2000);

		
	}

	@When("Click on login Button")
	public void click_on_login_button() {
		
		lb.clickonbtn();
	    
	}

	@Then("User Navigate to Dashboard page")
	public void user_navigate_to_dashboard_page() {
	    
	boolean Dashboard =	d.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).isDisplayed();
		Assert.assertTrue(Dashboard);
		System.out.println("DASHBOARD IS VISIBLE");
	}

	
	
	@When("user click on profile")
	public void user_click_on_profile() throws InterruptedException {
	  
		HP = new Homepage(d);
		Thread.sleep(2000);
		HP.click_profile();
		Thread.sleep(2000);
	}
	
	

	@Then("Logout link is visible")
	public void logout_link_is_visible() throws InterruptedException {
		Thread.sleep(2000);
		HP.logoutlink_verify();
	}

	 @After(order = 1)
	 public void teardown() {

		 d.close();
		 
	 }
	

	@When("user click on Admin")
	public void user_click_on_admin() {
		   this.HP =new Homepage(d);
			HP.click_admin();
	
		}


	@Then("user management tab displayed")
	public void user_management_tab_displayed() {
	   
		HP.verify_user();
	}

	@After(order = 2)
	 public void teardown2() {

		 d.close();
		 
	 }

}
