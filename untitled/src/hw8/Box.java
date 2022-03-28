package hw8;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> arrayList;

    public Box() {
        arrayList = new ArrayList<>();
    }

    public void putFruit(T fruit) {
        arrayList.add(fruit);
        System.out.println("You put " + fruit.getName() + " in the box");
    }

    public int getNumberOfFruits() {
        return arrayList.size();
    }

    public double getWeightOfBox() {
        double weightOfBox = 0;
        for(T fruit: arrayList){
            weightOfBox += fruit.getWeight();
        }
        return weightOfBox;
    }

    public boolean compare(Box<? extends Fruit> anotherBox) {
        return this.getWeightOfBox() == anotherBox.getWeightOfBox();
    }

    public void moveFruitTo(Box<T> anotherBox) {
        anotherBox.arrayList.addAll(arrayList);
        arrayList.clear();
    }
}
