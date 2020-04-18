 @AndroidTest
Feature: Testing product searching

  Scenario: ss.com car search with empty board

    Given client opens ss.com application
    When client chooses Volvo car model
    And client sets up car filter
    Then client sees board with no results

  Scenario: ss.com car search failed test

    Given client opens ss.com application
    When client chooses Volvo car model
    And client sets up car filter with minimal price
    Then client sees board with no results

  Scenario: ss.com language change

    Given client opens ss.com application
    When client opens settings
    Then client chooses Русский language

#  Scenario: ss.com car search with output
#
#    Given client opens ss.com application
#    When client chooses Volvo car model
#    And client sets up car filter with minimal price
#    Then client sees search results



