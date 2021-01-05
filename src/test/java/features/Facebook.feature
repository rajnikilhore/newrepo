Feature: facebook login

  Background: Facebook page should be open
    Given Open facebook page

  @smoke
  Scenario Outline: Facebook page is open
    When Enter credentials <userid> & <password>
    Then click on login button

    Examples: 
      | userid | password |
      | name1  |        5 |
      | name2  |        7 |

  @smoke
  Scenario Outline: Fackbook login with valid credential
    When Enter credentials valid <userid1> & <password1>
    Then click on login button success

    Examples: 
      | userid1 | password1 |
      | test    | tets      |
