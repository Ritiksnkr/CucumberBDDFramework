Feature: SignUp

@test1
Scenario: User succesfully register with valid details
	Given user is on amazon homepage
	When user clicks on signin/signup button
	Then user click on create new account
	And user  enter name as "Ritik Sonker", mobile number as "7896738390", and password as "Abcd123@"
	And user click on continue
	Then user signed in
	Then close browser

@Test2	
Scenario: User unsuccesfully register with invalid details
	Given user is on amazon homepage
	When user clicks on signin/signup button
	Then user click on create new account
	And user  enter name as "Ritik Sonker", invalid mobile number as "78967383hj", and password as "Abcd123@"
	And user click on continue
	Then user registration unsuccesful
	Then close browser