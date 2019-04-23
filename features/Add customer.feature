
#Sample Feature Definition Template

Feature: To test add customer functionality
 
  
  Scenario: To verifiy the customer ID generated
    Given The user is in add customer page
    When The user fill in the valid customer details
    |chandru|selenium|test@yahoo.com|chennai|9500470563|
    When The user clicks the submit button
    Then The user should see the customer ID generated
    	