Feature: Register Functionality

  As a user I want to check register functionality


@Smoke@Sanity
  Scenario: User should Navigate To Register Page successfully
    Given I am on homepage
    When  I click on register link
    Then  I should see the register text and verify it
@Sanity@Regression
  Scenario:  User should verify ErrorMessage Of FirstName Required As EmptyField
    When I click on register link
    And  I leave mandatory field empty and click on register button
    Then I should see error message that first name is  required
  @Regression
    Scenario: User should Successfully Register with valid credentials
      Given I click on register link
      When  I enter first Name "Diana"
      And   I enter last Name "spencer"
      And   I enter email "diana.spencer@yahoo.com"
      And   I enter password "abcd1234"
      And   I enter confirmed password "abcd1234"
      And   I click on register button
      Then  I should see registration completed successfully




