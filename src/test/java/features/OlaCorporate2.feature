@ola2
Feature: Check that name field in ola corporate accepting valid values

  @tag2
  Scenario Outline: Check name field
    Given Contact us form is open
    When enter "<value>" for email field
    Then Valid values should be accepted

    Examples: 
      | value |
      | test1 |
      | 1test |
