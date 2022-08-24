package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = TestBase.initialize();
	}
	
	@Given("Codekaplan Login page")
	public void codekaplan_login_page() {
	    System.out.println("Login page");
	}

	@Then("user successfully login and see user information")
	public void user_successfully_login_and_see_user_information() {
		System.out.println("Login page login");
	}
	
	@When("user enters username and incorrect password")
	public void user_enters_username_and_incorrect_password() {
		System.out.println("Login page login with incorrect password");
	}

	@Then("user should not be able to login and see user information")
	public void user_should_not_be_able_to_login_and_see_user_information() {
		System.out.println("Login page login not able to login");
	}
	
	@When("user enters incorrect username and incorrect password")
	public void user_enters_incorrect_username_and_incorrect_password() {
		System.out.println("Login page login with incorrect password");
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		System.out.println(username + " " + password);
	}
	
	@When("user enters username and password:")
	public void user_enters_username_and_password(List<List<String>> dataTable) {
	   
		DataTable data = DataTable.create(dataTable);
		
		int rowSize = data.cells().size();
		
		List<List<String>> dataObj = data.cells();
		
		System.out.println(dataObj.get(0));
		
		System.out.println(dataObj.get(1));
		
//		System.out.println(data.cell(1, 0));
//		
//		System.out.println(data.cell(1, 1));
		
	}
}
