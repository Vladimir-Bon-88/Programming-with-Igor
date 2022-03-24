package hw8;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> arrayList;
    private double weightOfBox;

    public Box() {
        arrayList = new ArrayList<>();
    }

    public void putFruit(T fruit) {
        arrayList.add(fruit);
        System.out.println("You put " + fruit.getName() + " in the box");
        weightOfBox = arrayList.size() * fruit.getWeight();
    }

    public int getNumberOfFruit() {
        return arrayList.size();
    }

    public double getWeightOfBox() {
        return weightOfBox;
    }

    public boolean compare(Box anotherBox) {
        return this.getWeightOfBox() == anotherBox.getWeightOfBox();
    }

    public void moveFruitTo(Box anotherBox) {
        anotherBox.arrayList.addAll(this.arrayList);
        this.arrayList.removeAll(arrayList);
    }
}
