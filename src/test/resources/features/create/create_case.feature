Feature: Proyecto Yevo - POC

  Background: Open careviso site
    Given The user is full authenticated

  @creation_case_pa
  Scenario Outline: Create a new PA case
    Given the user clicks on New Case button
    When the user uses the data from "<jsonName>" to create a new case
    Then validate the case is created correctly

    Examples:
    | jsonName |
    | pa_case_creation.json |

#  @creation_case_seeqer
#  Scenario Outline: Create a new Seeqer case
#    Given the user clicks on New Case button
#    When the user uses the data from "<jsonName>" to create a new case
#    Then validate the case is created correctly
#
#    Examples:
#      | jsonName |
#      | seeqer_case.json |
