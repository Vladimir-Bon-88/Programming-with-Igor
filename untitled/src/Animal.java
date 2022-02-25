public abstract class Animal {
    private String name;
    public static int counter = 0;
    public abstract void run(int distance);

    public Animal(){
        counter++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int numberOfAnimal(){
        return counter;
    }
}
