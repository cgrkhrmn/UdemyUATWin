@smoke
@regression
Feature: Searh functionality 

Scenario: Search functionality check
	Given User is on udemy homepage 
	When user click search box 
	And search some item 
	Then user should be able to see expected results.
