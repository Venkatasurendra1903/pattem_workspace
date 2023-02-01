package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTables_UserRegistration {

	@Given("user is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("user navigates on registration page");
	}

	@When("user enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		List<List<String>> userList = dataTable.asLists(String.class);
		System.out.println("the data table is: ");
		for(List<String> i : userList ) {
			System.out.println(i);
		}
	}
	
	@When("user enters following user details with coloumns")
	public void user_enters_following_user_details_with_coloumns(DataTable dataTable) {
		List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
//		System.out.println(userMap);
//		System.out.println("the 1st index value is:\n"+userMap.get(0));
		
		for(Map<String, String> i : userMap) {
			System.out.println(i.get("firstname"));
			System.out.println(i.get("lastname"));
			System.out.println(i.get("email"));
			System.out.println(i.get("phone no"));
			System.out.println(i.get("city"));

		}
	}

	@Then("user registration sholud be successful")
	public void user_registration_sholud_be_successful() {
	    System.out.println("user registration sholud be successful");
	}
}
