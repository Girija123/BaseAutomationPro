Feature: Login

  Scenario: verfiy login with valid username and password

    Given I'm on Home Page "http://www.next.co.uk"
    When I click on My Account link
    When I enter username "GeorgeLyhh@sample.com"
    When I enter password "Lynn123@"
    When I click Login Button
    Then I should be logged in successfully