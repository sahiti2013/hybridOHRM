Feature: Employee should be added successfully with Add Employee link


  Background:
    Given admin on login page
    When admin enters username,password
      | username | password |
      | Admin    | Admin    |
    And clicks login button
    Then admin should enter into dashboard page
    When user selects PIM on left hand side panel

  @ADDEMP_001
  Scenario: verify adding employee with add employee link                                                                         Given user is on the Employee List page
    When user selects Add Employee Link
    Then user should enter into add employee page
    When user enters FirstName,lastName
      | firstname | lastname |
      | sunil     | reddy    |
    And uploads a photograph
    And user clicks save button
    Then Employee should be created successfully
    And able to see recently added Employee in Employee list page