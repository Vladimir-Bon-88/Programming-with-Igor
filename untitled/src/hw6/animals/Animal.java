package hw6.animals;
/**
 * Abstract class Animal - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Animal {
    protected String name;

    protected int run_limit;
    public Animal(){}

    public String getName() {
        return name;
    }
    public abstract String voice();

    public boolean run(int length) {
        return run_limit >= length;
    }

    public int getRun_limit() {
        return run_limit;
    }
}