import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        /**
         * task #2
         */
        byte a = -127, b = 125;
        int a1 = 4, a2 = 10;
        short a3 = 11;
        long a4 = 12;
        float b1 = 2, b2 = 1, b3 = 8, b4 = 1;
        double ba = 5.25;
        char c = 'd';
        boolean v = true;

        /**
         * task #3
         */
        System.out.println(resOfExpression(b1, b2, b3, b4));

        /**
         * task #4
         */
        System.out.println(isSum(a1, a2));

        /**
         * task #5
         */
        isPositive(a);

        /**
         * task #6
         */
        isNegative(b);

        String name = "Vova";
        /**
         * task #7
         */
        hello(name);

        /**
         * task #8
         */
        isLeap(2016);

    }

    public static float resOfExpression(float a, float b, float c, float d) {
        Scanner scanner = new Scanner(System.in);
        float res = 0;
        do {
            if (d == 0) {
                System.out.println("It's impossible to divide by 0. Enter the right data");
                d = scanner.nextFloat();
            }
        } while (d == 0);
        res = a * (b + (c / d));
        return res;
    }

    public static boolean isSum(int a, int b){
        int sum = a + b;
        if(sum > 10 && sum <= 20)
            return true;
        else return false;
    }

    public static void isPositive(byte a){
        if(a >= 0){
            System.out.println("It's a positive number");
        }
        else System.out.println("It's a negative number");
    }

    public static boolean isNegative(byte b) {
        if(b >= 0){
            return false;
        }
        else return true;
    }

    public static void hello(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void isLeap(int year){
        if(year % 4 == 0) {
            if (year % 400 == 0)
                System.out.println("It's a leap year");
            else if (year % 100 == 0) {
                System.out.println("It's non leap year");
            }
            System.out.println("It's a leap year");
        }
    }
}
