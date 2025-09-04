@E2E
Feature: To be Verify the E2E Functionality in KBL website

@Case1
Scenario: To  Valiadte the Guser user Flow in home page

Given  User open the Home page
When   When user opening the home page > To verify the header section all the  Elements   
And    User verify the home page  sections is displayed or not
And    To verify the Categeory L1 > L2  sub-categeory  navigation page
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
Then   User click  the My account options in dashbord and Observe the redirection  page 
 

 
@Case4
Scenario Outline: To validate the search field functionality 

Given  User go to the Home page 
When   User Enter the product name in search box "<Product Name1>"
And    Observe the Related products suggestion.then,Click on any product name
And    Observe the Seeall navigation  page "<Product Name2>"
And    Observe the navigation  page using Enter button "<Product Name3>"
Then   Verify the Filter options in SLP page


Examples:
          |Product Name1|    |Product Name2|  |Product Name3|  
          |TL16010016A12211| |Surface pump|   |Submersible Pump| 


# D11130060676   

@Case5  

Scenario: To  Valiadte the listing Buy now functionaity for Guest user

Given User open the Home page 
When  User go to the listing page
And   verify the Buy now  CTA functionality
And   verify the Compare now option in listing page
Then  verify the added compare products in comparision page

@Case6  

Scenario: To Validate  the PDP page to Cart Page for Guest  user

Given User open the Home page 
When  User go to the listing page
And   On click Buy now CTA or any product cards in listing page
And   Verify the  correct delivery message based on TAT functionality
Then  verify the PDP page features and products prices & do the add to cart.

@Case7

Scenario: To Validate  the checkout flow  for login  user

Given user opens the Home page and logs in
When  the user navigates to the listing page
And   clicks the "Buy Now" CTA or any product card on the listing page
And   adds the product to the cart and proceeds to the Cart page
And   verifies the Cart page features and Order summary detail.Then,proceeds to the Checkout page
And   enters the shipping and billing details
And   selects a payment option and places the order
Then  after successful payment, the user should see the Thank You page


 






          


 

 
