#Author: trantrongquoc@gmail.com
Feature: Verify create new customer

Scenario: Verify new customer can be created
	Given I open the Chrome application
	And I input username
	And I input password
	And I tap on Login button
	Then Manager Home Page displays