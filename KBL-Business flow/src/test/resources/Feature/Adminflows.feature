@BE-FLOWS
Feature: To  verify Backend Flows on the KBL Website

  @Admincases1
  Scenario: To validate the  Admin Login Functionality

    Given the user opens the admin login page  
    When  the user enters valid login credentials and clicks the Sign In button  
    Then  the admin dashboard page should be displayed