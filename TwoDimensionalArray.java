

import java.util.ArrayList;

public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] multiDimensionalArr = new char[size][size];
        int number = 0;
        int numberLength = 1;


        for (int outer = 0; outer < multiDimensionalArr.length; outer++) {

            for (int inner = 0; inner < multiDimensionalArr.length; inner++) {
                    multiDimensionalArr[outer][inner] = ' ';
            }
            for (int inner = 0; inner < multiDimensionalArr.length; inner = multiDimensionalArr.length) {
                multiDimensionalArr[outer][number] = symbol;
                multiDimensionalArr[outer][multiDimensionalArr.length-numberLength] = symbol;
                number = number + 1;
                numberLength = numberLength + 1;
            }
        }
        return multiDimensionalArr;
        }
    public static void main(String[] args) {
        TwoDimensionalArray.getTwoDimensionalArray(7);
    }
    }

