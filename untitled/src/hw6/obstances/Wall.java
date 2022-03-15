package hw6.obstances;

import hw6.animals.Animal;
import hw6.animals.Jumpable;

/**
 * Write a description of class Wall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wall implements Obstance {
    private float height;

    public float getHeight() {
        return height;
    }

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public boolean doIt(Animal animal) {
        if (animal instanceof Jumpable)
            return ((Jumpable) animal).jump(height);
        else
            return false;
    }

    @Override
    public String getName(){
        return "wall";
    }
}