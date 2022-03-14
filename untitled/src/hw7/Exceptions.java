package hw7;

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
        if (arr.length > 4) {
            throw new MyArraySizeException("Wrong size of array");
        }

        initializationOfArray(arr);

        showArray(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                char[] arrChars = arr[i][j].toCharArray();
                if (Character.isDigit(arrChars[0])) {
                    sum += Integer.parseInt(arr[i][j]);
                } else{
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
                StringBuilder stringBuilder = new StringBuilder();
                char sym = (char) (random.nextInt(2) + 56);
                stringBuilder.append(Character.toString(sym));
                arr[i][j] = stringBuilder.toString();
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
