Feature: To test the Signin Page
Scenario: Check the Signin page with credentials

Given User is in the Sign in page
When User enters <username> without filling <password> and click login
|username|password|
|Login442| |
Then It should display an error "Please fill out this field." below Password textbox


Given User is in the Sign in page
When User enters invalid <username> and click sign in
|username|password|
|Login|admin@|
Then It should display an error "Invalid Username and Password"

When User enters an invalid <username>+ <password> combination
|username|password|
|Login|admin@|
Then System should alert user "Invalid Username and Password"


Given User is in the Sign in page
When User enters with valid <username> valid <password>
|username|password|
|Dsportalnew|verynewpw@123|
Then User should be redirected to Home Page with the message "You are logged in" 

