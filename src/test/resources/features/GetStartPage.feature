Feature: To check the DsAlgo Portal  

Scenario: User is in DsAlgo Webpage
#Given User is in DsAlgo Stating Page
#When User clicks "GetStart"
#Then User should be directed to Home page

#Scenario: The user clicks "Data Structures" drop downThe user clicks "Data Structures" drop down
Given User opens Home Page
When User clicks "Data Structures" drop down
Then User should see 7 different data structure entries in that dropdown

When User clicks any of the "Get Started" buttons below the data structures
Then It should alert the user with a message "You are not logged in"  
And  user should be redirected to Sign in page

When User selects any data structures item from the drop down without Sign in
Then It should alert the user with a message "You are not logged in"  
And  user should be redirected to Sign in page



