@E2E
Feature: To be Verify the E2E Functionality in KBL website

@Case1
Scenario: To  Valiadte the Guser user Flow in home page

Given  User open the Home page
When   When user opening the home page > To verify the header section all the  Elements   
And    User verify the home page  sections is displayed or not
And    When user opening the home page > To verify the Categeory (L1>L2) to sub-categeory  navigation
And    Observe the Footer section links
Then   Observe the  Footer section links redirections  
 


@Case2
Scenario: To  Valiadte the Login functionality with password field 

Given User open the Home page
When  Go the login page and select the login with password page
And   Enter the Email and passwors in repective field
Then  Observe the redirection to the my account page


@Case3
Scenario: To  Valiadte the My account page options & redirection in dashboard

Given  User open the Home page
When   do  the login  and Observe the my account page options
And    User select the My account options in dashbord page
Then   Observe the redirection  page

 
@Case4
Scenario Outline: To validate the search field functionality 

Given  User go to the Home page 
When   User Enter the product name in search box "<Product Name1>"
And    Observe the Related products suggestion.then,Click on any product name
And    Observe the Seeall navigation  page "<Product Name2>"
And    Observe the navigation  page using Enter button "<Product Name3>"
Then   Verify the Filter options in SLP page

Examples:
          |Product Name1| |Product Name2|  |Product Name3|  
          |Borwell pump|  |Surface Pump|   |Submersible Pump| 
           
            
@case5  

Scenario: To  Valiadte the listing Buy now functionaity for Guest user

Given User open the Home page 
When  User go to the listing page
And   verify the Buy now  CTA functionality
And   verify the Compare now option in listing page
Then  verify the added compare products in comparision page



          


 

 
