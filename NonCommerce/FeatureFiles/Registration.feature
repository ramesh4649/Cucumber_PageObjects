@tag
Feature: Registration
  I want to use this template for my Registration feature

  @Smoketest
  Scenario: Create New Account for NonCommerce Application
    Given Open Browser and Enter Application URL
    And Click on Profile and Select Registration Option
    When Application Redirect to the Your Personal Details page
    And Enter all Mandatory details and Click Register Button
    And Verify the Email verification text to Activate the Account

 
