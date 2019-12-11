#Author: romal.arora

Feature: Update Personal Information in My Account

  Scenario: Update First Name in My Account
    Given User opens Home Page
    Then User clicks signin link
    And User enters Signin info
    Then User goes to my account page
    Then User clicks my personal info 
    When User changes firstname
    Then User verifies firstname change message "Your personal information has been successfully updated."
    

