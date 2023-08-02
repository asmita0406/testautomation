Feature: Validate add to cart functionality
@Reg
Scenario: Verify add to cart successful from PDP page
Given User launch site URL
When Validate User login into the application successfully
And add product into the cart from PDP
Then Validate user is able to add the product
