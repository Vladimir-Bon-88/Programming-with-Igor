package hw6.animals;

import hw6.animals.*;

import java.util.Random;

public class Team {
    private String name;
    public Animal[] animals = {new Cat("Barsik"), new Hen("Petya"), new Hippo("Andrew")};
    public Animal[] teamAnimal = new Animal[4];
    Random random = new Random();

    public Team(String name) {
        this.name = name;
        for(int i = 0; i < teamAnimal.length; i++){
            int temp = random.nextInt(3);
            teamAnimal[i] = animals[temp];
        }
    }

    public String getName() {
        return name;
    }
    public void showInfo(){
        System.out.println("Name of team: " + name);
        System.out.println("Information about players: ");
        for(int i = 0; i < teamAnimal.length; i++){
            System.out.println("Name of animal: " + teamAnimal[i]);
            System.out.println("Run limit: " + teamAnimal[i].getRun_limit());
            if(teamAnimal[i] instanceof Jumpable){
                System.out.println("limit of jumping: " + ((Jumpable) teamAnimal[i]).getJump());
            }
            if(teamAnimal[i] instanceof Swimable){
                System.out.println("limit of swimming: " + (((Swimable) teamAnimal[i]).getSwim()));
            }
        }
    }

    public void passedObstances(){
        for(int i = 0; i < teamAnimal.length; i++){
            if(teamAnimal[i].passing){
                System.out.println(teamAnimal[i].getName() + " finished course successfully");
                break;
            }
            else {
                System.out.println(teamAnimal[i].getName() + " can't finish course successfully");
                break;
            }

        }
    }
}
