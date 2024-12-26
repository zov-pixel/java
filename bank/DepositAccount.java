

import java.time.LocalDate;


public class DepositAccount extends BankAccount {
    BankAccount bankAccount = new BankAccount();
    private LocalDate lastIncome = LocalDate.now().minusMonths(2);
    private double amountToTake;

    @Override
    public boolean take(double amountToTake) {
        this.amountToTake = amountToTake;
        if (LocalDate.now().minusMonths(1).isAfter(lastIncome)) {
            lastIncome = LocalDate.now();
            return super.take(amountToTake);
        }
        return false;
        }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }
    public LocalDate getLastIncome() {
        return lastIncome;
    }

    public void setLastIncome(LocalDate lastIncome) {
        this.lastIncome = lastIncome;
    }
}
