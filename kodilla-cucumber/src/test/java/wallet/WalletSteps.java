package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("I have deposited {int} in my wallet", (Integer int1) -> {
            wallet.deposit(int1);
        });
        When("I request {int}", (Integer int1) -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, int1);
        });
        Then("{int} should be dispensed", (Integer int1) -> {
            Assert.assertEquals((int) int1, cashSlot.getContents());
        });
    }
}


