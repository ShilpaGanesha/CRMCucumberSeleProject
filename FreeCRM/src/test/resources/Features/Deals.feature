Feature: To test the Crm application
Background: To  login  Crm application  

Given To open application and navigate url
When user clicks  loginlink
When  enter email and password 
Then click  login button

Scenario: To verify Deals functionality
Given user is in the home page
Then click on deals
When click on new deals button
Then enter the deal credentials and save
|Testing Deals|Shilpa Ganesha|ABC|123|shilpa|10/12/2020 22:00|t1|100|10|Won|New|Verify|New|Partner|gggjk335|
|Deals 1|     asggh   |XYZ|456|shwetha|11/12/2020 23:00|t2|200|20|Lost|Active|Debug|Old|Online|13jjhjhj|
Then take a sceenshot

