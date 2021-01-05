package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OlaCorporate4StepDef {
	
	public WebDriver driver;
	
	

	@When("^enter (\\d+) for country field$")
	public void enter_value_for_name_field(String arg1) throws Throwable {
		Select drpcountry = new Select(driver.findElement(By.name("country")));
		drpcountry.selectByVisibleText(arg1);
	}


}
