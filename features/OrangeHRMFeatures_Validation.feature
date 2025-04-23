Feature: OrangeHRM Feature Validation

  @SC2
  Scenario Outline: Validate the Options present in the OrangeHRM HomePage
    Given The user logs in to the OrangeHRM using below TestCredential
      | TestUsername | TestPassword |
      | Admin        | admin123     |
    When user could see the Homepage
    Then user could see the '<options>' in the left pallete

    Examples: 
      | options     |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
