Feature: Menu Re-Direction Test
  As a user
  I should be re-directed to appropriate product lists through menu

  @menu
  Scenario Outline: Verify menu options re-direction

    Given I'm on Home Page "http://www.next.co.uk"
    When I click on Menu Option "<Menu Option>"
    Then I should be in appropriate product list page with title "<Expected Page Title>"

    Examples:
      | Menu Option | Expected Page Title |
      | MEN         | Mens Clothing       |
      | WOMEN       | Women's Clothing    |
      | BOYS        | Boys Clothes        |


  @subMenu
  Scenario Outline: Verify submenu options re-direction

    Given I'm on Home Page "http://www.next.co.uk"
    When I mouseover on Menu Option "<Menu Option>"
    When I click on sub menu option "<Sub Menu Option>"
    Then I should be in appropriate product list page with title "<Expected Page Title>"

    Examples:
      | Menu Option | Sub Menu Option | Expected Page Title |
      | MEN         | Jeans           | Men's Jeans         |
      | WOMEN       | Dresses         | Dresses             |
      | BOYS        | Joggers         | Boys Joggers        |