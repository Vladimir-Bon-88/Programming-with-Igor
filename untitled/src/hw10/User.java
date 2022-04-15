package hw10;

import java.util.Scanner;

public class User {
    private int id;
    private String name;
    private int age;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void read(Scanner reader) {
        String str = reader.nextLine();
        String[] strArray = str.split(";");
        id = Integer.parseInt(strArray[0]);
        name = strArray[1];
        age = Integer.parseInt(strArray[2]);
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "," + " name: " + getName() + "," + " age: " + getAge() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && name.equals(user.name);
    }
}
