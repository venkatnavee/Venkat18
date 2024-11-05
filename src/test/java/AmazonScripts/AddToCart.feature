Feature: Add to cart

Scenario: Search and add to cart

Given user opens the testUrl
When user search for the "iphone"
And user click on search icon
And user clicks on first product
And user click on add to cart button 
Then product should be added to the cart