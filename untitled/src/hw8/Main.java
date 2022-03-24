package hw8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Generics generics = new Generics();
        /**
         * task 1
         */
        String[] strArray = {"q1", "q2", "q3"};
        Integer[] intArray = {1, 2, 3};

        System.out.println("strArray " + Arrays.deepToString(generics.swap(strArray, 2, 1)));
        System.out.println("intArray " + Arrays.deepToString(generics.swap(intArray, 1, 2)));

        System.out.println("-----------------------------------------");

        /**
         * task 2
         */

        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        Apple apple = new Apple();
        Orange orange = new Orange();

        appleBox1.putFruit(apple);
        appleBox1.putFruit(apple);

        orangeBox1.putFruit(orange);
        orangeBox1.putFruit(orange);
        orangeBox1.putFruit(orange);

        System.out.println("weight of box with apples is: " + appleBox1.getWeightOfBox());
        System.out.println("weight of box with apples is: " + orangeBox1.getWeightOfBox());

        if(!orangeBox1.compare(appleBox1)){
            System.out.println("Boxes aren't equals");
        } else System.out.println("Boxes are equals");

        orangeBox1.moveFruitTo(orangeBox2);
        System.out.println("Size of the second box: " + orangeBox2.getNumberOfFruit());
        System.out.println("Size of the first box: " + orangeBox1.getNumberOfFruit());

        appleBox1.moveFruitTo(appleBox2);
        System.out.println("Size of the second box: " + appleBox2.getNumberOfFruit());
        System.out.println("Size of the first box: " + appleBox1.getNumberOfFruit());

    }
}
