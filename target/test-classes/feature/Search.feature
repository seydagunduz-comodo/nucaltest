Feature: This is a feature

  # Comments are added like this
  @NotCompleted
  Scenario: This is a scenario
    Given I am on "https://www.google.com.tr/"
    When I click search for "abc"
    Then I should see relevant search results

  @IamSomeRandomTag
  Scenario: This is another scenario
    Given I am on "https://www.google.com.tr/"
    When I click search for "abc"

  Scenario: I log these variable to the screen
    When I should see systemout for "output 1" and "output 2"

  Scenario: This is a new scenario
    Given I want to write "sd"
    When I whatever
    Then whatever II
