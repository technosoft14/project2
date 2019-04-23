
#Sample Feature Definition Template

Feature: To test add customer functionality
 
  
  Scenario: To verifiy the customer ID generated
    Given The user is in add customer page
    When The user fill in the valid customer details
    When The user clicks the submit button
    Then The user should see the customer ID generated
    