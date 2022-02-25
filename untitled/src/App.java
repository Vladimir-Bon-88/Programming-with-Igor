public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Animal animal1 = new Cat();
        cat1.setName("Barsik");
        dog1.setName("Bobik");

        cat1.run(150);
        dog1.run(200);
        cat1.swim(11);
        dog1.swim(20);
        System.out.println("General number is: " + (dog1.numberOfDog() + cat1.numberOfCat()));
    }
}
