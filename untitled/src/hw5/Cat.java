package hw5;

import hw5.Animal;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
    }

    public Cat(){
        super();
    }
    @Override
    public void run(int distance) {
        if (distance < 200) {
            System.out.println(getName() + " runs " + distance + " m");
        } else{
            System.out.println(getName() + " can't run over than 200 m");
        }
    }

    @Override
    public void swim(int distance){
        System.out.println(getName() + " can't swim at all");
    }

    @Override
    public String toString(){
        return "Cat " + getName();
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
        return ((Cat) obj).getName().equals(this.getName());
    }
}
