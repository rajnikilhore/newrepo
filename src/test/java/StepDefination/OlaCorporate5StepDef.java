package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OlaCorporate5StepDef {
	
	public WebDriver driver;
	
	@Given("^Contact us form is open for dep$")
	public void contact_us_form_is_open() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		    driver =  new ChromeDriver();
		    driver.get("https://corporate.olacabs.com/#/contact");  
		    Thread.sleep(3000);
		    driver.findElement(By.id("link-contact")).click();
		    Thread.sleep(3000);
	    
	}
	
	
	@When("^enter \"([^\"]*)\" for Department field$")
	public void enter_for_Department_field(String arg1) throws Throwable {
		driver.findElement(By.xpath("//select[@id='department'][@ng-model='contact.department']")).click();
		Select dep = new Select(driver.findElement(By.xpath("//select[@id='department'][@ng-model='contact.department']")));
		dep.selectByValue(arg1);
		dep.selectByVisibleText(arg1);
	}

	
}
