package hw6.obstances;

import hw6.animals.Animal;
import hw6.animals.Team;

import java.util.Random;

public class Course {
    private Obstance[] obstances = new Obstance[3];

    public Course() {
        Random random = new Random();
        obstances[0] = new Track(random.nextInt(120));
        obstances[1] = new Water(random.nextInt(111));
        obstances[2] = new Wall(random.nextFloat() + 10);
    }

    @Override
    public String toString() {
        return "length of track: " + ((Track)obstances[0]).getLength() + "\n"
                + "length of water: " + ((Water)obstances[1]).getWaterLength() + "\n"
                + "height of wall: " + ((Wall)obstances[2]).getHeight() + "\n";
    }

    public void passingOfObstances(Team team) {
        boolean result;
        for (Animal animal : team.getTeamAnimal()) {
            System.out.println();
            for (Obstance obstance : obstances) {
                result = obstance.doIt(animal);
                team.showPassedInfo(animal, result, obstance.getName());
            }
        }
    }
}
