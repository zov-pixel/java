

public class CardAccount extends BankAccount {
    BankAccount bankAccount = new BankAccount();
    private double amountToTake;
    @Override
    public boolean take(double amountToTake) {
        this.amountToTake = amountToTake;
        amountToTake = amountToTake + (amountToTake * 0.01);
        return super.take(amountToTake);
}

    @Override
    public double getAmount() {

        return super.getAmount();
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }
}
