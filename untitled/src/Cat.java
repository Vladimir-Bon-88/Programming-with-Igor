public class Cat extends Animal {
    public static int counter = 0;

    public Cat(){
        counter++;
    }
    @Override
    public void run(int distance) {
        if (distance < 200) {
            System.out.println(getName() + " runs " + distance + " m");
        } else{
            System.out.println(getName() + " can't run over than 200 m");
        }
    }

    public void swim(int distance){
        System.out.println(getName() + " can't swim at all");
    }

    public int numberOfCat(){
        return counter;
    }
}
