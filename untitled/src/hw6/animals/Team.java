package hw6.animals;

import hw6.animals.*;

import java.util.Random;

public class Team {
    private String name;
    private Animal[] teamAnimal = new Animal[4];

    public Team(String name) {
        Random random = new Random();
        Animal[] animals = {new Cat("Barsik"), new Hen("Petya"), new Hippo("Andrew")};
        this.name = name;
        for(int i = 0; i < teamAnimal.length; i++){
            int temp = random.nextInt(3);
            teamAnimal[i] = animals[temp];
        }
    }

    public Animal[] getTeamAnimal() {
        return teamAnimal;
    }

    public String getName() {
        return name;
    }
    public void showInfo(){
        System.out.println("Name of team: " + name);
        System.out.println("Information about players: ");
        for (Animal animal : teamAnimal) {
            System.out.println("Name of animal: " + animal);
            System.out.println("Run limit: " + animal.getRun_limit());
            if (animal instanceof Jumpable) {
                System.out.println("limit of jumping: " + ((Jumpable) animal).getJump());
            }
            if (animal instanceof Swimable) {
                System.out.println("limit of swimming: " + (((Swimable) animal).getSwim()));
            }
        }
    }

    public void showPassedInfo(Animal animal, boolean passing, String nameOfObstance){
            if (passing) {
                System.out.println(animal.getName() + " could pass " + nameOfObstance + " successfully");

            } else {
                System.out.println(animal.getName() + " couldn't pass " + nameOfObstance + " successfully");
            }
    }
}
