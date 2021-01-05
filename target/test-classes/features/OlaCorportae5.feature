@ola5
Feature: Check that name field in ola corporate accepting valid values

  Scenario Outline: Check name field
    Given Contact us form is open for dep
    When enter "<value>" for Department field
    Then Valid values should be accepted

    Examples: 
      | value |
      | HR    |
