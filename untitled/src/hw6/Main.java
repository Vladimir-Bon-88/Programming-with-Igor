package hw6;


import hw6.animals.*;
import hw6.obstances.Course;
import hw6.obstances.Track;
import hw6.obstances.Wall;
import hw6.obstances.Water;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {

    public static void main(String[] args) {
        Team team1 = new Team("grands");

        team1.showInfo();
        System.out.println("----------------------");

        Course course = new Course();
        System.out.println("Information about obstances ");
        System.out.println(course);
        System.out.println("-----------------------");

        course.passingOfObstances(team1);

        team1.passedObstances();
    }
}