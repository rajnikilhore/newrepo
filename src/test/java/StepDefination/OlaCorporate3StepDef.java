package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OlaCorporate3StepDef {
	
	public WebDriver driver;
	
	

	@When("^enter \"([^\"]*)\" for corporate_name field$")
	public void enter_value_for_name_field(String arg1) throws Throwable {
		driver.findElement(By.name("corporate_name")).sendKeys(arg1); 
	}


}
