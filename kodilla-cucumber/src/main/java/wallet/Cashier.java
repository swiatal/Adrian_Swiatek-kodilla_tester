package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }
    public void withdraw(Wallet wallet, int amount) {
       if (amount >= wallet.getBalance()) {
           cashSlot.dispense(0);
       } else {
        wallet.debit(amount);
        cashSlot.dispense(amount);
    }
}

    public void checkBalance(Wallet wallet) {
        cashSlot.setMessage("Balance in your wallet is: $" + wallet.getBalance());
    }
}
