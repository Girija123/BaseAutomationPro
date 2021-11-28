Feature: Verify user Registration
  As a new user
  I should be able to  register and use the app.

  @Registration
  Scenario: Verify user direction to Registration page

    Given I'm on Home Page "http://www.next.co.uk"
    When I click on My Account link
    And I click Register Now button
    Then I should on the sign up page with text "Quick Secure Sign Up"
