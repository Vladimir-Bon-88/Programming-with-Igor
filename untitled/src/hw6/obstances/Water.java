package hw6.obstances;
import hw6.animals.Animal;
import hw6.animals.Swimable;

/**
 * Write a description of class Water here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Water implements Obstances{
    private int waterLength;

    public int getWaterLength() {
        return waterLength;
    }

    public Water(int length) {
        this.waterLength = length;
    }

    @Override
    public boolean doIt(Animal animal) {
        if (animal instanceof Swimable)
            return ((Swimable) animal).swim(waterLength);
        else
            return false;
    }
}