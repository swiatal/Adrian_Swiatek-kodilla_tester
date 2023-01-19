package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    public WalletSteps() {


        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            //Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });
        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals( 30, cashSlot.getContents());
        });

        Given("There is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals( 100, wallet.getBalance());
        });
        When("I check the balance of my wallet", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.checkBalance(wallet);
        });
        Then("I should have $100 balance in my wallet", () -> {
            Assert.assertEquals( "Balance in your wallet is: $100", cashSlot.getMessage());
        });
    }
}


