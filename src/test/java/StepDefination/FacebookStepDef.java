package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.hooks;

public class FacebookStepDef {
	
	//public WebDriver driver;
	
	WebDriver driver =  hooks.driver;
	
	@Given("^Open facebook page$")
	public void open_facebook_page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	    //driver =  new ChromeDriver();
	    driver.get("https://www.facebook.com");    
	    
	}

	@When("^Enter credentials name(\\d+) & (\\d+)$")
	public void enter_credentials_name(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(arg1); 
	    driver.findElement(By.id("pass")).sendKeys(arg2);
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.id("u_0_b")).click();
	}
	
	@When("^Enter credentials valid test & tets$")
	public void enter_credentials_valid_test_tets() throws Throwable {
	    
	}
	
	@Then("^click on login button success$")
	public void click_on_login_button_success() throws Throwable {
		System.out.println("second scenario then");
	}


}
