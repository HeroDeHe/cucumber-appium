@Login 
Feature: Login Action Test 
	Description: This feature will test a Login functionality

Scenario Outline: Login with valid credential 
	Given user navigate to https://webapp-dots-webportal-uat.azurewebsites.net/# 
	When user stay in login screen 
	And user enters Username as "<username>" and Password as "<password>" 
	Then login should be successful 
	And user logout 
	Examples: 
		|username		|password	|
		|systemadmin	|admin		|
		
		
Scenario Outline: Login with invalid credential 
	Given user navigate to https://webapp-dots-webportal-uat.azurewebsites.net/# 
	When user stay in login screen 
	And user enters Username as "<username>" and Password as "<password>" 
	Then error message "<error_msg>" is displayed 
	Examples: 
		|username		|password	|error_msg							|
		|a				|a			|Username or password is incorrect	|