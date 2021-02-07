@smoke_login
Feature:As a user, I should be able to login to the app

  @login_with_valid_credentials
  Scenario Outline: As a user, I should be able to login to the Bitrix App
    Given user is on the login page
    When user enter "<email>" and "<password>"
    And user clicks on "Log in" button
    Then user should see dashboard page
    Examples:

      | email     | password |
      | helpdesk  | UserUser |
      | hr        | UserUser |
      | marketing | UserUser |


  @check_remember_option
  Scenario:Check "Remember me on this computer" option
    Given user is on the login page
    When user enter "<email>" and "<password>"
    And user check "Remember me on this computer" checkbox
    And user clicks on "Log in" button
    Then user should see dashboard page

  @forgot_link
  Scenario:Access to "FORGOT YOUR PASSWORD?" link page
    Given user is on the login page
    And user logs in with "helpdesk" username and "wrong" password
    When click to "FORGOT YOUR PASSWORD?" link page
    Then users see "Get Password" page

  @invalid_credentials
  Scenario:Login with invalid credentials
    When user logs in with "helpdesk" username and "wrong" password
    Then user verifies that "Incorrect login or password" message is displayed

