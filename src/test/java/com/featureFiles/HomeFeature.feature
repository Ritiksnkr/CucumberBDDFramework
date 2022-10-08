Feature: Homepage

	@Test1
  Scenario: Succesfully Verify logo, title, menu, and searchbox
    Given I am on amazon homepage
    When I verify logo
    And I verify title
    And I verify menu
    And I verify searchbox
    Then close browser
 
 @Test2   
  Scenario: Verify title unsuccesful
  	Given I am on amazon homepage
    When I verifying title
    Then Title verification should be unsuccesful
    Then close browser
 
	@Test3    
  Scenario: Succesfully search and select item
  	Given User is on amazon homepage
    When User search "iphone 13" on searchbox
    And  User select item
    Then close browser
    