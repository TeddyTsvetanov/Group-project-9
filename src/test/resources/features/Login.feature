Feature: NextBaseCRM application login feature
  User Story: As a User , I should be able to login to the app.


  @smoke @AC3
    Scenario: user redirect to login page by clicking "Authorization" link
    Given user is on nextbaseCRM login page
    When user clicks on "FORGOT YOUR PASSWORD?" link
    And  user clicks on "Authorization" link
    Then user should redirected to login page