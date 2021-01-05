@ola
Feature: Check that name field in ola corporate accepting valid values

  Scenario Outline: Check name field
    Given Contact us form is open
    When enter "<value>" for name field
    Then Valid values should be accepted

    Examples: 
      | value |
      | test1 |
