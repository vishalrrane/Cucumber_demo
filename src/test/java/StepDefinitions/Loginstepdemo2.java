package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdemo2 {
	
/*   WebDriver d = null;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		
		System.setProperty("webdriver.chrome.driver","C://Users//VISHAL//Desktop//Selenium 64 bit//Web Driver//chromedriver.exe");
		d= new ChromeDriver();	
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	}

	@When("^user  enter  (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password ) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  
		d.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(2000);
	}

	@When("click on the Login button")
	public void click_on_the_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions	

		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Then("user is navigate to the dashboard page")
	public void user_is_navigate_to_the_dashboard_page() {
	
		System.out.println("User Navigate to the Dashboard");
		d.close();
	  
	}
	
*/


}
