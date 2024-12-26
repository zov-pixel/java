

public class FactorialCalculator {

    public static int getFactorial(int number) {
        //TODO: тут реализуйте расчет факториал целого числа
        int result = 1;
        String before = "";
        String finalResult = "";
        if (number <= 1){
            finalResult = finalResult + number + "! = " + 1+ "\n"; }
        else {
            for(int i=1; i <=number; i++) {
                result = result*i;
                finalResult = finalResult + i + "! = " + before + (i) + " = " + result + "\n";
                before = before + i + " x ";
            }}
        System.out.println(finalResult);
        return result;
    }
    }

