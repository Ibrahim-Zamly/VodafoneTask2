Feature: Automated End2End Tests for purchasing order
  Description: The purpose Of this feature is to check that the user can purchase order from vodafoneEshop website.


  Scenario Outline: User can login and add items to shopping cart by selection and search bar
    Given From the homepage the user can go to login page
    When The user can login with his credentials "<username>","<password>"
    And The user can select first item and added to the shopping cart then go back to home page
    And The user can select second item and added to the shopping cart then go back to home page
    Then The user can search for "<productName>" and select it and added to the shopping cart

    Examples:
      | username    | password     | productName                  |
      | 01009126459 | Xy@123456789 | ساعة سمارت امازفيت بيب 3 برو |