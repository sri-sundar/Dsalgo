Feature: To Test Home page

Scenario: User is in HomePage
Given User opens Home Page
When User clicks "Sign in"
Then User should be redirected to Sign in page

Scenario: User is in HomePage
Given User opens Home Page
When User clicks "Register"
Then User should be redirected to Register form

Scenario: User is in HomePage
Given User opens Home Page
When User clicks "Register"
Then User should be redirected to Register form

When User clicks "Register" button with all fields empty
Then User should display an error "Please fill out this field" below Username textbox

Given User opens Register Page
When User clicks "Register" button after entering Username with other fields empty
Then User should display an error "Please fill out this field" below Password textbox


When User clicks "Register" button after entering Username and password with Password Confirmation field empty
Then  User should display an error "Please fill out this field" below Password Confirmation textbox

When User enters a name with characters other than Letters, digits and @/./+/-/_
Then  Usershould display an error message "Please enter a valid username"
	