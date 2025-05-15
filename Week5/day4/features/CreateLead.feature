Feature: Lead Creation in CRM

Background:
Given The user successfully establishes the environment
And The user loads the url

Scenario: User tries to create a new lead successfully


When The user enters the username as DemoSalesManager
And The user enters the password as crmsfa
And The user clicks the login button
Then The user should be redirected to the welcome page
When The user clicks the crmsfa link
And The user clicks the leads module
And The user clicks the create lead shortcut menu
And The user enters the company name as Testleaf
And The user enters the first name as Bhuvanesh
And The user enters the last name as M
And The user enters the phone number
And The user clicks the create lead button
Then The user should be redirected to the view lead page

Scenario: User tries to create a lead without entering the mandatory fields

When The user enters the username as DemoSalesManager
And The user enters the password as crmsfa
And The user clicks the login button
Then The user should be redirected to the welcome page
When The user clicks the crmsfa link
And The user clicks the leads module
And The user clicks the create lead shortcut menu
And The user enters the phone number
And The user clicks the create lead button
Then The user should encounter the error as parameter is missing