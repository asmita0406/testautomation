Feature: Validate login functionality
@Reg
Scenario: Verify successful login with valid credentials
Given User launch site URL
When User enter valid username and valid password
And User click on login button
Then Validate User login into the application successfully