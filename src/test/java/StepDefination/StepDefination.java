package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	public WebDriver driver;

@Given("^User navigates to google page$")
public void user_navigates_to_google_page() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    driver =  new ChromeDriver();
    driver.get("https://www.google.com");   
    
}

@When("^User Enter String in search box$")
public void user_Enter_String_in_search_box() throws Throwable {
    driver.findElement(By.name("q")).sendKeys("test");
    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
}

@Then("^Result will display$")
public void result_will_display() throws Throwable {
	driver.findElement(By.id("result-stats")).isDisplayed();
    
}



}
