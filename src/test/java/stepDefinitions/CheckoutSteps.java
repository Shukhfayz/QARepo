package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps extends TestBase{
	
	static WebDriver driver;
	
//	@Before
//	public static void setup() {
//		System.out.println("Opening the browser");
//		try {
//			driver = TestBase.initialize();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@After
//	public static void tearDown() {
//		driver.close();
//	}

	@Before
	public static void setup() {
		
		try {
			driver = TestBase.initialize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@After(order = 1)
	public void takeScreenshotOnFailure(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}
	}
	
	@After(order = 0)
	public void tearDown() {
		driver.close();
	}
	
	@Given("Codekaplan checkout page")
	public void codekaplan_checkout_page() {
	    System.out.println("Checkout page");
	}

	@When("user goes to checkout")
	public void user_goes_to_checkout() {
		 System.out.println("navigate to Checkout page");
	}

	@Then("user successfully see checkout information")
	public void user_successfully_see_checkout_information() {
		 System.out.println("verify the Checkout page");
	}
	
	@When("user logs in the application")
	public void user_logs_in_the_application() {
	    System.out.println("user logs in");
	}

	@Given("Lists page")
	public void lists_page() {
	    System.out.println("user on the lists page");
	}

	@When("user adds product to the list page")
	public void user_adds_product_to_the_list_page() {
		System.out.println("user adds product");
	}

	@Then("user validate the product in the lists page")
	public void user_validate_the_product_in_the_lists_page() {
		System.out.println("user validates the product");
	}

	

}
