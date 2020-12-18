Feature: To test the Crm application
Background: To  login  into Crm application  
Given To open the application and navigate url
When user clicks on loginlink
When user enters email and password 
Then click on login button


Scenario: To verify login and take sceenshot
Given user is logged in the application
#Then verify the user name 
Then take a screenshot
Then logout from the application
Then close the browser











