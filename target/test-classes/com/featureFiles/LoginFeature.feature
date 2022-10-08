Feature: Login

@Test1
Scenario: Login with valid credentials
	Given user is on amazon homepage
	When user clicks on signin
	Then user enter email or mobile number
	And user click on continue
	And user enter password
	And user click on submit
	Then user logged in
	Then close browser
	
@Test2
Scenario: Unsuccesful Login with invalid email or mobile number
	Given user is on amazon homepage
	When user clicks on signin
	Then user enter invalid email or mobile number
	And user click on continue
	Then user should not move further
	Then close browser
	
@Test3
Scenario: Unsuccesful Login with valid mobile number and invalid password
	Given user is on amazon homepage
	When user clicks on signin
	Then user enter valid mobile number as "7897520524"
	And user click on continue
	And user enter password as "password"
	And user click on signIn button
	Then user should not logged in
	Then close browser
