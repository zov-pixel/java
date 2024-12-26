

public class BankAccount {
  private double amount = 0.0;


  public void put(double amountToPut) {
    if (amountToPut > 0) {
      amount = amount + amountToPut;
    }
  }

  public boolean take(double amountToTake) {
    boolean returnStatement = false;
    if (amountToTake <= amount) {
      amount = amount - amountToTake;
      returnStatement = true;
    }
    return returnStatement;
  }
  public void setAmount(double amount) {
    this.amount = amount;
  }
  public double getAmount() {
    return amount;
  }
}
