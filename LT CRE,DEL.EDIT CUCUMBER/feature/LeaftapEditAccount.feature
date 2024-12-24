#Author: Priyadharshini Boopalan
#Keywords Summary : Leaftap App - Account creation
#Given Launch the browser and load the URL
Feature: Leaftap Application - Edit Account 
  Scenario Outline: Leaftap Application - Edit Account 
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
		When Cick on Edit button
		When Enter a Site Name as <SiteName>
		And Enter the updated description as <Description>
		And Click on the Save Button
		Then Verify the Account is updated
Examples:
|UserName|Password|AccountName|SiteName|Description|
|'DemoSalesManager'|'crmsfa'|'Harrish A'|'Leaftap'|'Updated Selenium Automation Tester'|
|'DemoSalesManager'|'crmsfa'|'Harrish B1'|'Leaftap'|'Updated Selenium Automation Tester'|
#|'DemoSalesManager'|'crmsfa'|'hari'|'Leaftap'|'Updated Selenium Automation Tester'|