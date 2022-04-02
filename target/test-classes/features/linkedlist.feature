Feature: Linked List feature

#Scenario: Check the Linkedlist page
#Given The user is in the Home page after logged in with valid <username> valid <password>
#|username|password|
#|Dsportalnew|verynewpw@123|
#When The user clicks the "Getting Started" button in Linked List Pane 

#Then The user should be directed to "Linked List" Page



Scenario Outline:To check Linked List
Given The user is in the Home page after logged in with valid <username> valid <password>
|username|password|
|Dsportalnew|verynewpw@123|
When The user clicks the "Getting Started" button in Linked List Pane 
And The user clicks "<Linked List>" button
Then The user should be directed to "<Linked List>"  of Linked List Page
And user enters text in textarea
 Then clicks the run button
Examples:
|Linked List|
|Introduction|
|Creating a Linked List|
|Types of Linked List|
|Implement Linked List in Python|
|Traversal|
|Insertion|
|Deletion|