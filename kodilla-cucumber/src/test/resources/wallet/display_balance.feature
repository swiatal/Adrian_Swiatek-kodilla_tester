Feature: Display Balance
  Scenario: User checks the balance of their wallet
    Given There is $100 in my wallet
    When I check the balance of my wallet
    Then I should have $100 balance in my wallet