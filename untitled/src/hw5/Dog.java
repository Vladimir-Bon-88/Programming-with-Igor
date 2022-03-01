package hw5;

import hw5.Animal;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    public Dog(){
        super();
    }
    @Override
    public void run(int distance){
        if(distance < 500) {
            System.out.println(getName() + " runs " + distance + " m");
        } else {
            System.out.println(getName() + " can't run over than 500 m");
        }
    }

    @Override
    public void swim(int distance){
        if(distance < 11){
            System.out.println(getName() + " swims " + distance + " m");
        } else {
            System.out.println("It's too large distance for " + getName());
        }
    }

    @Override
    public String toString(){
        return "Dog: " + getName();
    }

    @Override
    public int hashCode(){
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || obj.getClass() != getClass())
            return false;
        return this.getName().equals(((Dog) obj).getName());
    }
}
