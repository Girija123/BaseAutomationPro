Feature: Forgot Password Test
  Desc

  @Forgot
  Scenario: Verify Forgot Password Link Re-Direction

    Given I'm on Home Page "http://www.next.co.uk"
    When I click on My Account link
    And I click on forgot password Link
    And I enter email "GoergeLybb@Sample.com" in reset password window
    And I click reset button
