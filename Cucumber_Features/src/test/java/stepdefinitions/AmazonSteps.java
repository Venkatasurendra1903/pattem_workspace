package stepdefinitions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSteps
{
//	@Given("a registered user exists")
//	public void a_registered_user_exists() {
//	   
//	}

	@Given("user is on Amazon login page")
	public void user_is_on_amazon_login_page() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.quit();
		

	    
	}

	@When("user enters username")
	public void user_enters_username() {
	
	}

	@When("user enters password")
	public void user_enters_password() {
	
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	  
	}

	@Then("user navigates to order page")
	public void user_navigates_to_order_page() {
	  
	}

	@When("user clicks on Order link")
	public void user_clicks_on_order_link() {
	
	}

	@Then("user checks the previous order details")
	public void user_checks_the_previous_order_details() {

	}

	@When("user clicks on Open Orders link")
	public void user_clicks_on_open_orders_link() {
	 
	}

	@Then("user checks the open order details")
	public void user_checks_the_open_order_details() {
	  
	}

	@When("user clicks on cancelled orders link")
	public void user_clicks_on_cancelled_orders_link() {
	
	}

	@Then("user checks the cancelled order details")
	public void user_checks_the_cancelled_order_details() {
	    
	}
	

}
