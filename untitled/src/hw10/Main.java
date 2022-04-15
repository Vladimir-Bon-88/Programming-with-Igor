package hw10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*5;Igor;25
4;Vova;19
3;Anna;20
2;Alex;32*/

public class Main {
    private static List<User> userList;
    private static File file;

    public Main() {
        userList = new ArrayList<>();
        file = new File("D:\\Programming-with-Igor\\untitled\\src\\hw10\\input.txt");
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        User user = new User();
        try {
            FileReader fileReader = new FileReader(file);
            Scanner reader = new Scanner(fileReader);
            while (reader.hasNext()) {
                user = new User();
                user.read(reader);
                userList.add(user);
            }
            User user1 = new User(11, "Vanya", 41);
            //User user2 = new User(11, "Petya", 55);
            addToFile(user1);
            remove(userList.get(2));
            System.out.println("Get by ID:");
            getById(2);
            getAll();
            //System.out.println(userList.toString());
        } catch (UserAlreadyExistException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addToFile(User user) throws UserAlreadyExistException, Exception {
        for (User users : userList) {
            if (users.getId() == user.getId()) {
                throw new UserAlreadyExistException("User have been already existed");
            }
        }
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("\n" + String.valueOf(user.getId()) + ";" + user.getName() + ";" + String.valueOf(user.getAge()));
        userList.add(user);
        fileWriter.flush();
    }

    public static void remove(User user) throws UserNotExistException {
        int counter = 0;
        for (User users : userList) {
            counter++;
            if (users.equals(user)) {
                userList.remove(user);
                break;
            } else if ((!users.equals(user)) && userList.size() == counter)
                throw new UserNotExistException("User haven't been existed");
        }
    }

    public static void getById(int id) throws UserNotExistException {
        int counter = 0;
        for (User users : userList) {
            counter++;
            if (users.getId() == id) {
                System.out.println(users);
                break;
            } else if (users.getId() != id && counter == userList.size()) {
                throw new UserNotExistException("User haven't been existed");
            }
        }
    }

    public static void getAll() {
        System.out.println("General information: ");
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
