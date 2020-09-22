Feature: Login Feature

  #Scenario: Test login with valid credentials
   #Given User navigates to login page
    #When User input email and password
    #And Click on login button
    #Then User is navigated to homepage
  
	Scenario Outline: Test login with valid credentials
    Given I navigates to login page
    When I input <username> and <password>
    And I click login button
    Then I click admin button
    When I click nationalities button
    And I click add button
    And I write text nationality aaa
    Then I click save button
    When I check the column aaa
    Then I click delete button
    And I click ok for delete button
    Then I should be navigated to home page
    
Examples:
| username | password                      |
| Admin		 | hUKwJTbofgPU9eVlw/CnDQ==      |
    
    
   