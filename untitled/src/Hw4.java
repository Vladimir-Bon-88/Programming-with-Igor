import java.util.Random;

public class Hw4 {
    public static void main(String[] args) {
        /**
         * task #1
         */
        System.out.println("Task #1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        initialization(arr);
        print(arr);
        System.out.println();

        /**
         * task #2
         */
        System.out.println("Task #2");
        int[] arr2 = new int[8];
        init(arr2);
        print(arr2);
        System.out.println();

        /**
         * task #3
         */
        System.out.println("Task #3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        mult(arr3);
        print(arr3);
        System.out.println();

        /**
         * task #4
         */
        System.out.println("Task #4");
        int[] arr4 = {1, 6, -4};
        System.out.println(position(arr4, 0));
        System.out.println();

        /**
         * task #5
         */
        System.out.println("Task #5");
        int[] arr5 = {34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20};
        changePos(arr5);
        System.out.println();

        /**
         * task #6
         */
        System.out.println("Task #6");
        int[] arr6 = {5, -1, 10, 77};
        minMax(arr6);
        System.out.println();

        /**
         * task #7
         * I don't know how to solve this task
         */
        System.out.println("Task #7");
        int[] arr7 = { 9, 1, 1, 1, 5, 5, 5, 5, 9};
        System.out.println(findTheNumber(arr7));
        System.out.println();

        /**
         * task #8
         */
        System.out.println("Task #8");
        Random random = new Random();
        int[][] arr8 = new int[5][5];
        for (int i = 0; i < arr8.length; i++) {
            for (int j = 0; j < arr8[i].length; j++) {
                arr8[i][j] = random.nextInt(10) - 5;
            }
        }
        initOfDiag(arr8);
        print2(arr8);

        /**
         * task 9
         * I don't know how to solve this task
         */

        /**
         * task 10
         * I don't know how to solve this task
         */
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void print2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] initialization(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        return arr;
    }

    public static int[] init(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
            num = arr[i] + 3;
        }
        return arr;
    }

    public static int[] mult(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public static int position(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void changePos(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                res[j] = arr[i];
                j++;
            }
        }
        print(res);
    }

    public static void minMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element is: " + max + "\n" + "Min element is: " + min);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // не получилась 111 555 9
    public static int findTheNumber(int[] arr) {
        int maxCounter = 1, num = 0;
        sort(arr);
        int tempCounter = 1;
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == arr[i + 1]) {
                tempCounter++;
            }
            else if (maxCounter >= tempCounter) {
                maxCounter = tempCounter;
                num = arr[i];
                tempCounter = 1;
            }
            else {
                maxCounter = tempCounter;
                tempCounter = 1;
            }
        }
        return num;
    }

    public static int[][] initOfDiag(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[arr.length - 1 - i][i] = 1;
        }
        return arr;
    }
}
