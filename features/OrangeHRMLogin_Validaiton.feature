Feature: OrangeHRM Validation

  @SC1
  Scenario: Validating the OrangeHRM Home Page
    Given when the user launches the App
    When user lands in the Login page
    Then user could see and verify the Username and Password text boxes
