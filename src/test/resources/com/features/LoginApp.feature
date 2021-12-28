Feature: To test scenarios for login functionality

  Scenario: Login page title.
    Given user is on login page
    When user gets the title of page
    Then landing page title should be "Login - My Store"

  Scenario: Forget Password link is available on Login Page
  	Given user is on login page
  	Then forgot password link should be displayed
  	And user is able to click on forgot password

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "reyona250391@gmail.com"
    And user enters password "seleniumlearning123"
    And user clicks on Login button
    When user gets the title of page
    Then landing page title should be "My Account - MyStore"
