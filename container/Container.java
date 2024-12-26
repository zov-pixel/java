

public class Container {

    private Integer count;


    public void addCount(int value) {
        if (count == null) {
        setCount(0);
        count = count + value;
        }
        else {
            count = count + value;
        }
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
