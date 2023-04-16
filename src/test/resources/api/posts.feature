Feature: Posts
  As a user
  I want to see all post data
  So that I can create new post data

  Scenario: Get By Id - As user I have be able to get by id response code
    Given I set valid GET endpoints
    When I send GET HTTP requestss
    Then I receive valid HTTP responsess code 200
    And I receive valid data for detail posts