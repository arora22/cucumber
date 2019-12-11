#Author: romal.arora

Feature: Place Order and Verify Order

  Scenario: Order Tshirt and verify order in history
    Given User opens Home Page
    Then User clicks Tshirt Menu
    And User clicks Tshirt Link
    Then User adds item to cart
    And User clicks proceed to checkout button
    And User clicks proceed to checkout summary button
    Then User enters Signin info
    Then User clicks on Proceed Order Button
    Then User checks Terms agreement
    And User clicks Proceed process button
    Then User selects Pay by check method
    And User clicks Confirm Order button
    Then User checks success message "Your order on My Store is complete"
    # Verify in Order History
    Then User stores order reference no
    Then User goes to my account page
    And User clicks order history and details
    Then User checks placed order
    
    
