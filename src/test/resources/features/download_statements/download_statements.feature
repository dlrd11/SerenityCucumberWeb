Feature: user download their statements

  @pdf
  Scenario: User download their statement for last month
    Given Pepito has made purchases with this credit card
    And he already downloaded his statements
    When he reviews his transactions
    Then he should see the transactions for last month