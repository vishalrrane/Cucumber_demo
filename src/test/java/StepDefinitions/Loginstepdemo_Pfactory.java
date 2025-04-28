package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.loginpage_PF;

public class Loginstepdemo_Pfactory {
	
   WebDriver d = null;
   loginpage_PF login ;
	
   
   
   @Before  
   public void Setup() { 
		
		System.setProperty("webdriver.chrome.driver","C://Users//VISHAL//Desktop//Selenium 64 bit//Web Driver//chromedriver.exe");
		d= new ChromeDriver();	
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		
		
		System.out.println("=======I am inside the   Loginstepdemo_Page Factory============");
	
	  
	}

	@When("^user  enter  (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password ) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	
		login	= new  loginpage_PF(d);
		
		login.enteruserneme(username);
		Thread.sleep(2000);
		login.enterpssword(password);
		Thread.sleep(2000);

	}

	@When("click on the Login button")
	public void click_on_the_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions	
		login.clickonbtn();
		
	}

	@Then("user is navigate to the dashboard page")
	public void user_is_navigate_to_the_dashboard_page() throws InterruptedException {

		System.out.println("User is on Dashboard page");
	   
	  
	}
	
	@After
	public void teardown() {
	
		System.out.println("Close the Browser");

	d.close();
	}


}
