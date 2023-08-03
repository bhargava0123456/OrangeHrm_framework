Feature: verify add Employee funtionality

Background: user should login with valid credentials

 When User enters valid Username "Admin"
 And User enters valid password "admin123"
 Then User clicks on Login button
 
Scenario Outline: Add customer funtionality
 
 When User clicks on PIM button
 Then click on add Employee option
 And User enters <firstname> in firstname text field
 And User enter <middlename> in middlename text field
 And User enters <Lastname> in lastname text field
 And User enters employeeid in id field
 Then User clicks on save button
 Then verify if user is created successfully
 
 Examples: 
 |firstname      |middlename     |Lastname     |
 |sharath        |kumar          |Ediga        |
 |bhargav        |sai            |kuruba       |
 |charan         |kumar          |shree        |
 
 
 
 
 