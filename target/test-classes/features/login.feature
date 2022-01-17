Feature: Login

  Scenario: Login with valid data
    Given I on the login page
    When I input field email
    And I input field pasword
    Then I click button Sign in
    Then There should be validation
