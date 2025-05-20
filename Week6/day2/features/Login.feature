Feature: User Autentication for the CRM application
@negative
Scenario: The user attempt to login with the invalid Credentials

When The user enters the username as 'DemoCSR'
And The user enters the password as 'crmfa'
And The user clicks the login button