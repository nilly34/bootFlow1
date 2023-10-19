@wip
Feature:About Functionality

  Background: User should access eaapp web page

    Given user is on the eaapp web page
    Then  user should see title is eaapp.somee.com

  Scenario:Verify that the user login with valid credentials
    Given The user clicks on the login button and lands on login page
    When  The user enters valid credentials into the field
    Then  The user clicks on login button
    And   The user lands on dashboard
    And   The user clicks on employee list on the dashboard
    When  The user clicks create new button
    Then  The user enters valid credentials about new employee into provided fields.
    And   The user clicks create button
    Then  The user should see new employee on the employee list page
    When  The user selects the new employee from the employee list and clicks delete button
    Then  Verify that the user succsessfully deleted new employee from the employee list



