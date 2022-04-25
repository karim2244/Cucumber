package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.fbpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbstepdefination {
	public static WebDriver driver;
	
	@Before
	 public void openbrow( ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Cucumber\\Cucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@Given("I want to navigate to facebook")
	public void i_want_to_navigate_to_facebook() throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
	    
	}

	@When("I need to give username Password {string}, {string}")
	public void i_need_to_give_username_password(String string, String string2) throws InterruptedException {
		fbpage ob = new fbpage(driver);
		ob.emailid(string);
		ob.password(string2);
		Thread.sleep(7000);
	    
	}

	@Then("I need to click signup button it signingup")
	public void i_need_to_click_signup_button_it_signingup() throws InterruptedException {
		fbpage ob1 = new fbpage(driver);
		ob1.loginclick();
		Thread.sleep(7000);
	   
	}
	@After
	public void closebrow( ) {
		driver.close();
	}



}
