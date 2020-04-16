# @AndroidTest @testApp
Feature: Testing product searching

  @AndroidTest @testApp
  Scenario: ss.com car search with empty board

    Given client opens ss.com application
    When client chooses car model
    And client sets up car filter
    Then client sees board with no results

  @AndroidTest @testApp
  Scenario: ss.com failed car search test

    Given client opens ss.com application
    When client chooses car model
    And client sets up car filter with minimal price
    Then client sees board with no results

  @AndroidTest @testApp
  Scenario: ss.com car search with output

    Given client opens ss.com application
    When client chooses car model
    And client sets up car filter with minimal price
    Then client sees search results


