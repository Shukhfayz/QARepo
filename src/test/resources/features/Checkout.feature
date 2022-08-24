@regression
Feature: Checkout
	As a user 
  	I want to login to the application 
  	so that I can add products to the shopping cart
  	
	Background:
		Given user logs in the application
		
  	
  	@checkout @smoke @positive
  	Scenario: Validate checkout page
  	When Codekaplan checkout page
  	Then user successfully see checkout information
  	
  	@checkout
  	Scenario: Validate List page
  	Given Lists page
  	Then user validate the product in the lists page
  	