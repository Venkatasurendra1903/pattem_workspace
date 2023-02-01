package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberMultipleScenariosSteps 
{
	@Given("User1 wants to select a type {string} from uber application")
	public void user1_wants_to_select_a_type_from_uber_application(String carType) {
		System.out.println("User");
	}

	@When("User1 selects car {string} and pick up point {string} and drop location {string}")
	public void user1_selects_car_and_pick_up_point_and_drop_location(String carType, String picUpLocation, String dropLocation) {
		System.out.println("Selects");

	}

	@Then("Driver1 starts the journey")
	public void driver1_starts_the_journey() {
		System.out.println("Starts");

	}

	@Then("Driver1 ends the journey")
	public void driver1_ends_the_journey() {
		System.out.println("Ends");

	}

	@Then("User1 pays {int} USD")
	public void user1_pays_usd(Integer price) {
		System.out.println("USD");

	}


}
