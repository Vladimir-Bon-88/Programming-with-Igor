package hw6.obstances;

import hw6.animals.Animal;

/**
 * Write a description of class Track here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Track implements Obstance {
    protected int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean doIt(Animal animal) {
        return animal.run(length);
    }

    @Override
    public String getName(){
        return "track";
    }

    public int getLength() {
        return length;
    }
}