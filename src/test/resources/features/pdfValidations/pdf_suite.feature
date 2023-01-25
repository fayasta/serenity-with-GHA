Feature: PDF Validation

  Background: Open website

  @pdf
  Scenario Outline: Validate PDF
    Given the user opens the pdf
    Then the user validate "Patient Name" is "<patient_name>"
    And the user validate "Lab Patient ID" is "<lab_patient_id>"
    And the user validate "Test" is "<test>"
    And the user validate "Total Estimated Patient Responsibility" is "<total_estimated>"

    Examples:
      |patient_name| lab_patient_id | test | total_estimated|
      |Holly Buckel     | AB212| NIPT GC | $180.00 |
