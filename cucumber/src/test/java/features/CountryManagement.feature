@CountryManagement 
Feature: Country Management Test 
	Description: This feature will test a country management functionality

Background: 
	Given user navigate to https://webapp-dots-webportal-uat.azurewebsites.net/# 
	When user stay in login screen 
	And user enters Username as "systemadmin" and Password as "admin" 
	Then login should be successful 
	And user select menu item as "Country Management" 
	
Scenario Outline: Create and remove new country successful 
	Then user create country 
		|Country Name	|<country_name>	|
		|X Days			|<x_days>		|
		|Y Hours		|<y_hours>		|
		|Active			|<active>		|
		|Sorting Order	|<sorting_order>|
	And successful message "Country has been successfully created." is displayed 
	And user remove country 
		|Country Name	|<country_name>	|
		|Active			|<active>		|
	And successful message "Country has been successfully deleted." is displayed
	Examples: 
		|country_name	|x_days			|y_hours	|active		|sorting_order	|
		|Country12345	|1				|1			|checked	|999999			|
		|Country123456	|1				|1			|unChecked	|999999			|