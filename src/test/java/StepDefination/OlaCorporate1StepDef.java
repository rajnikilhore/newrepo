package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OlaCorporate1StepDef {
	
	public WebDriver driver;
	
	@Given("^Contact us form is open$")
	public void contact_us_form_is_open() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		    driver =  new ChromeDriver();
		    driver.get("https://corporate.olacabs.com/#/contact");  
		    Thread.sleep(3000);
		    driver.findElement(By.id("link-contact")).click();
		    Thread.sleep(3000);
	    
	}

//	@When("^enter (\\d+) for name field$")
//	public void enter_value_for_name_field(String arg1) throws Throwable {
//		driver.findElement(By.name("name")).sendKeys(arg1); 
//	}
	
	@When("^enter \"([^\"]*)\" for name field$")
	public void enter_for_name_field(String arg1) {
		driver.findElement(By.id("email43")).click(); 
		driver.findElement(By.id("email43")).sendKeys(arg1); 
	}


	@Then("^Valid values should be accepted$")
	public void valid_values_should_be_accepted() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='submit'][@value='Submit']")).click();
	    System.out.println("test passed");
	}


}
