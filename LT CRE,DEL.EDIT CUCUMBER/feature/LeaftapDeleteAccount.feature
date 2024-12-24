#Author: Priyadharshini Boopalan
#Keywords Summary : Leaftap App - Account Deactivate
#Given Launch the browser and load the URL
Feature: Leaftap Application - Account Deactivate
  Scenario Outline: Leaftap Application - Account Deactivate
		When Enter the username as <UserName>
		And Enter the password as <Password>
		And Click on the Login button
		Then Verify the Login is successful
		When Click on CRM/SFA link
		When Click on the Accounts tab
		When Click on the Finds Account Link under shortcuts
		When Enter an account name as <AccountName> in search box
		And Click on Find Accounts Button
		When Click the Account ID link <AccountName> 
		When Cick on Deactivate Account button
		When click on OK button on Alert posted as Are you sure to deactivate the account
		Then Verify the Account is deactivated
Examples:
|UserName|Password|AccountName|
|'DemoSalesManager'|'crmsfa'|'Harrish A'|
|'DemoSalesManager'|'crmsfa'|'Harrish B1'|
#|'DemoSalesManager'|'crmsfa'|'hari'|