Feature: SwagLab

  As a User

  I want to be able to add to cart
  So that I can buy items.

  Swag Labs

  Background:

    Given I am on the sauce demo home page - Swag Labs

    When I enter an acceptable username "standard_user" and password "secret_sauce", and click the LOG IN button

@swagLabADDED


  Scenario: Checkout 1 item from the cart


    When I add an item to cart by clicking on “ADD TO CART” button for the item

    Then my Cart should show that an item has just been added in it

    When I checkout the item by entering my information as first name"Anakin", last name "Skywalker" and ZIP code as "R2 D2" on the Checkout Your Information page

    Then I click the CONTINUE button, I should be directed to the Checkout Overview page which should display the correct information "Sauce Labs Backpack".

    When I click Finish on the Checkout Overview page

    Then I am directed to the “CHECKOUT: COMPLETE!” page




