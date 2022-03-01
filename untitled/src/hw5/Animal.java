package hw5;

public abstract class Animal {
    private static int counter = 0;
    private String name;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public Animal(){}

    public static int getCounter() {
        return counter;
    }

    public abstract void run(int distance);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void swim(int distance);
}
