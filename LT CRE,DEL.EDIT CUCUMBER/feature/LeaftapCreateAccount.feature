#Author: Priyadharshini Boopalan
#Keywords Summary : Leaftap App - Account creation
#Given Launch the browser and load the URL
Feature: Leaftap Application - Account Creation
  Scenario Outline: Leaftap Application - Account Creation
		When Enter the username as <UserName>
		And Enter the password as <Password>
		And Click on the Login button
		Then Verify the Login is successful
		When Click on CRM/SFA link
		When Click on the Accounts tab
		When Click on the Create Account button
		When Enter an account name as <AccountName>
		And Enter a description as <Description>
		And Click the Create Account button
		Then Verify the Account is created
Examples:
|UserName|Password|AccountName|Description|
|'DemoSalesManager'|'crmsfa'|'Harrish A'|'Selenium Automation Tester'|
|'DemoSalesManager'|'crmsfa'|'harrish B1'|'Selenium Automation Tester'|
#|'DemoSalesManager'|'crmsfa'|'hari'|'Selenium Automation Tester'|