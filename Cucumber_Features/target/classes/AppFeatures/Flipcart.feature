Feature: Flipcart Search

Scenario: Search a product
Given I am on filpcart page
And I have a search field on flipcart page
When I search for a product with name "realme 7"
Then product with name "realme 7" should be displayed
And Click on that "realme 7" product 