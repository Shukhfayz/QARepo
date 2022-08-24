@regression
Feature: Login
	As a user 
  	I want to login to the application 
  	so that I can add products to the shopping cart
  	
  	@smoke @positive
  	Scenario: Validate login with correct username and correct password
  	Given Codekaplan Login page
  	When user enters username and password:
  	|username                   | password   |
  	| shuhratfaiziev@gmail.com  | aldjsj123  |
    | shukhratfayziev@gmail.com | alsdlfjasl |
  	Then user successfully login and see user information
  	
#Examples:
#| username                  | password   |
#| shuhratfaiziev@gmail.com  | aldjsj123  |
#| shukhratfayziev@gmail.com | alsdlfjasl |

  	@regression @negative
  	Scenario: Validate login with correct username and incorrect password
   	Given Codekaplan Login page
  	When user enters username and incorrect password
  	Then user should not be able to login and see user information
  	
  	@regression @negative
  	Scenario: Validate login with incorrect username and incorrect password
   	Given Codekaplan Login page
  	When user enters incorrect username and incorrect password
  	Then user should not be able to login and see user information