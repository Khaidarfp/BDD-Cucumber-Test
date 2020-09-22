Feature: Login Feature

  Scenario Outline: Test Login
    Given User navigates to url
    When User input <username> and <password>
    And Click login button
    And User is navigated to dashboard
    Then User close the browser

Examples:
| username | password                      |
| Admin		 | hUKwJTbofgPU9eVlw/CnDQ==      |
