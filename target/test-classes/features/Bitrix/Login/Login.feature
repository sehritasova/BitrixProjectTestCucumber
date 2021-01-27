
Feature:As a user, I should be able to login to the app

  Background: common steps
    Given user is on the login page

  Scenario: Login as a helpdesk

    When user logs in as a "hepdesk"
    Then user should see dashboard page

  Scenario: Login as a marketing

    When user logs in as a "marketing"
    Then user should see dashboard page

  Scenario: Login as a hr

    When user logs in as a "hr"
    Then user should see dashboard page



