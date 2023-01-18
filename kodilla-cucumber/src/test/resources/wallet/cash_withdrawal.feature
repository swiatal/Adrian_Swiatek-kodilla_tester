Feature: Cash Withdrawal
 Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <depositMoney> in my wallet
    When I request <withdrawMoney>
    Then <withdrawMoney> should be dispensed
   Examples:
     | depositMoney | withdrawMoney |
     | 200 | 30 |
     | 0 | 170 |
     | 1000 | 0 |