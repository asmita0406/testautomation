package Stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class loginpagesteps {
	
LoginPage login= new LoginPage();

	public static WebDriver driver;

	@Given("User launch site URL")
	public void user_launch_site_url() {
		login.user_launch_site_url();
	}

	@When("User enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
login.user_enter_valid_username_and_valid_password();

	}

	@And("User click on login button")
	public void User_click_on_login_button() {
		login.User_click_on_login_button();
	}

	@Then("Validate User login into the application successfully")
	public void validate_user_login_into_the_application_successfully() {
		login.Validate_User_login_into_the_application_successfully();

	}
}
