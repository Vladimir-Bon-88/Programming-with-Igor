public class Dog extends Animal{
    public static int counter = 0;

    public Dog(){
        counter++;
    }
    @Override
    public void run(int distance){
        if(distance < 500) {
            System.out.println(getName() + " runs " + distance + " m");
        } else {
            System.out.println(getName() + " can't run over than 500 m");
        }
    }

    public void swim(int distance){
        if(distance < 11){
            System.out.println(getName() + " swims " + distance + " m");
        } else {
            System.out.println("It's too large distance for " + getName());
        }
    }

    public int numberOfDog(){
        return counter;
    }
}
