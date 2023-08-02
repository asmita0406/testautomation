package Stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cartpagesteps {
	@When("add product into the cart from PDP")
	public void add_product_into_the_cart_from_pdp() {
		System.out.println("add product");
	}

	@Then("Validate user is able to add the product")
	public void validate_user_is_able_to_add_the_product() {
		System.out.println("product");

	}

}
