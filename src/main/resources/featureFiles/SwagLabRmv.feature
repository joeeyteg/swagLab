Feature: SwagLab

  As a User

  I want to be able to remove any item from my cart
  If I don't wants to buy it.

  Swag Labs

  @swagLabREMOVED

  Scenario: Remove item from the cart

    Given I am on the sauce demo home page,
    When I enter acceptable username "standard_user" and password "secret_sauce", and click the LOGIN
    When I add one item to cart by clicking on “ADD TO CART” button for the item,
    Then my Cart should show that the item I just added is in it,
    When I Click on Remove button on the “YOUR CART” page,
    Then item is removed from cart,