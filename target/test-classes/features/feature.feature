Feature: Purchase the order from SwagLab website
 
  Background:
  Given User landing on Ecommerse page
 
Scenario Outline: Positive test on submitting the order.
 
  Given User login with "<username>" and "<password>"
  When I added "<product>" to cart
  And checkout "<product>" and continue order
  And finish the order
  Then "Thank you for your order!" message should be displayed
  And User land on homepage
   
 
  
Examples:
|username|password|product|
|standard_user|secret_sauce|Sauce Labs Backpack|
 
