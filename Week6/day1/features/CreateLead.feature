Feature: Lead Creation in CRM

Scenario Outline: User tries to create a new lead successfully
When The user enters the username as 'DemoSalesManager'
And The user enters the password as 'crmsfa'
And The user clicks the login button
Then The user should be redirected to the welcome page
When The user clicks the crmsfa link
And The user clicks the leads module
And The user clicks the create lead shortcut menu
And The user enters the company name as <cname>
And The user enters the first name as <fname>
And The user enters the last name as <lname>
And The user enters the phone number as <phno>
And The user clicks the create lead button
Then The user should be redirected to the view lead page

Examples:
		| cname | fname | lname | phno |
		| Testleaf | Bhuvanesh | M | 98123 |
		| Qeagle | Harrish | A | 99887 |
		| TCS | Udhaya |M | 77889 |

Scenario: User tries to create a lead without entering the mandatory fields
When The user enters the username as 'DemoCSR'
And The user enters the password as 'crmsfa'
And The user clicks the login button
Then The user should be redirected to the welcome page
When The user clicks the crmsfa link
And The user clicks the leads module
And The user clicks the create lead shortcut menu
And The user enters the phone number as 7788
And The user clicks the create lead button
Then The user should encounter the error as parameter is missing