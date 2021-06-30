Feature: Computer Page Navigation Functionality

  As a user I want to navigate on computer page

  Background:
    Given I am on homepage
@Smoke@Sanity@Regression
  Scenario: User should navigate to Desktops page successfully
    Given I am on Computer page
    When  I click on Desktops Link
    Then  I should navigate to Desktops page successfully
@Sanity@Regression
  Scenario: User should navigate to Note Books pages successfully
    Given I am on Computer page
    When I click on Note Books Link
    Then I should navigate to Note Books Link successfully
@Regression
  Scenario: User should navigate to software page successfully
    Given I am on Computer page
    When  I click on Software Link
    Then  I should navigate to Software Link successfully