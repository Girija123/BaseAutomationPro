Feature: Verify Searcch
  DEsc

  Scenario: Verify search with product Name

    Given I'm on Home Page "http://www.next.co.uk"
    When I enter search term "Jeans"
    And  I click search icon
    Then I should get relevant resluts contains "Jeans" in product name

