package hw6.obstances;

import hw6.animals.Team;

import java.util.Random;

public class Course {
    Random random = new Random();
    Obstances[] obstances = {(Obstances) new Track(random.nextInt(120)), (Obstances) new Water(random.nextInt(111)), (Obstances) new Wall(random.nextFloat() + 10)};

    @Override
    public String toString() {
        return "length of track: " + ((Track)obstances[0]).getLength() + "\n"
                + "length of water: " + ((Water)obstances[1]).getWaterLength() + "\n"
                + "height of wall: " + ((Wall)obstances[2]).getHeight() + "\n";
    }

    public void passingOfObstances(Team team) {
        for (int i = 0; i < team.teamAnimal.length; i++) {
            System.out.println();
            for (int j = 0; j < obstances.length; j++) {
                if (!obstances[j].doIt(team.teamAnimal[i])) {
                    team.teamAnimal[i].setPassing(false);
                    team.passedObstances();
                } else {
                    team.teamAnimal[i].setPassing(true);
                    team.passedObstances();;
                }
            }
        }
    }
}
