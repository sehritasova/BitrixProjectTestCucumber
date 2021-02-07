Feature:As a user, I should be able to login to the Bitrix App

  @login_valid
  Scenario:Login with valid credentials
    Given user is on the login page
    When user logs in as a "marketing"
    And click on "Log in" option
    Then user should see dashboard page
    @check_remember_option
  Scenario:Check "Remember me on this computer" option
    When user logs in with valid credentials
    And click on "Remember me on this computer" option
    Then click on "Log in" option


  Scenario:Login with invalid credentials
    When user logs in with "invalid" username and "wrong" password
    Then user verifies that "Incorrect login or password" message is displayed

  Scenario:Access to "FORGOT YOUR PASSWORD?" link page
   Given user logs in with "invalid" username and "wrong" password
   When click to "FORGOT YOUR PASSWORD?" link page
   Then users see "Get Password" page








  #1. users (hr, marketing and helpdesk) login with valid credentilas
  #2. users cannot login with invalid credentials. (Negative )
  #3. users can check ""Remember me on this computer"" option
  #4. users access to  ""FORGOT YOUR PASSWORD?"" link page"


