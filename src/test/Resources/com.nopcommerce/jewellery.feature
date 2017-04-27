Feature: jewellery
  As a user, I can select jewellery and able to add to cart
  flower girl bracelet

  @test
  Scenario: The user should click on jewellery successfully
    Given user is on home page
    When  user click on jewellery
    And   user can nevigate to jewellery page
    And   user click on add to cart under flower girl bracelet
    And   user click on close button
    And   user click on shopping cart on top right hand corner of the page
    Then  user should nevigate to shopping cart page successfully
