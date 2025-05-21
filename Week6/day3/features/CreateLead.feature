Feature: Lead Creation in CRM
@positive
Scenario: User tries to create a new lead successfully
When The user enters the username as 'DemoSalesManager'
And The user enters the password as 'crmsfa'
And The user clicks the login button
When The user clicks the crmsfa link
And The user clicks the leads module
And The user clicks the create lead shortcut menu

@negative
Scenario: The user attempt to login with the invalid Credentials

When The user enters the username as 'DemoCSR'
And The user enters the password as 'crmfa'
And The user clicks the login button