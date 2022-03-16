package hw7;

import java.util.Arrays;
import java.util.Random;

public class Exceptions {
    public static void main(String[] args) {
        String[][] arr = new String[4][4];
        try {
            task1(arr);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }

    public static void task1(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if (arr.length > 4 || arr[i].length > 4) {
                    throw new MyArraySizeException("Wrong size of array");
                }
            }
        }

        initializationOfArray(arr);

        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch(NumberFormatException e){
                    throw new MyArrayDataException("Wrong symbol in " + i + " " + j);
                }
            }
        }
        System.out.println("The sum is: " + sum);
    }

    public static void initializationOfArray(String[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = String.valueOf(random.nextInt(94) + 33);
            }
        }
    }

    public static void showArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
