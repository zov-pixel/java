

public class Arithmetic {
    int oneNum = 0;
    int twoNum = 0;
    public Arithmetic(int oneNum, int twoNum) {
      this.oneNum = oneNum;
      this.twoNum = twoNum;
    }

    public int getSumNumber() {
        return oneNum + twoNum;
    }
    public int getProductNumber() {
        return oneNum * twoNum;
    }
    public int getMaxNumber() { return oneNum >= twoNum ? oneNum : twoNum; }
    public int getMinNumber() { return oneNum <= twoNum ? oneNum : twoNum; }
}
