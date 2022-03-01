package hw5;

import hw5.Animal;

public class App {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Barsik");
        Animal dog1 = new Dog("Bobik");
        Animal animal1 = new Cat();
       /* cat1.setName("Barsik");
        dog1.setName("Bobik");*/

        cat1.run(150);
        dog1.run(200);
        cat1.swim(11);
        dog1.swim(20);

        System.out.println("General number is: " + Animal.getCounter());
    }
}
