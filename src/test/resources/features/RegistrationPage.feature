Feature: Registration Page feature
Scenario Outline:Register with invalid credentials
Given User is in Register Page
When User enters invalid username "<username>"
And User enters invalid password "<password>"
And User reenters invalid password "<repassword>"
Then User gets the alert Message 
Examples:
|username|		password|repassword|
|12345234|	qazxswe|qazxswe|
|test4|12356754|12356754|
||weerr||

Scenario: Register with valid credentials
Given User is in Register Page
When User enters valid username<username>
|username|
|Dsportal|
And User enters valid password<password>
|password|
|admin@4444|
And User reenters passwors<repassword>
|repassword|
|admin@4444|
And User clicks the register button
Then User redirects to Homepage with "New Account Created. You are logged in as " <username> 
|username|
|Dsportal|


