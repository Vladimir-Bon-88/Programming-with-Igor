package hw10.Repository;

import hw10.model.User;
import hw10.utils.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public UserRepository() {
        File file = new File(Utils.getProp().getProperty("pathname"));
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        String str;
        try {
            while ((str = bufferedReader.readLine()) != null) {
                String[] strArr = str.split(";");
                int id = Integer.parseInt(strArr[0]);
                String name = strArr[1];
                int age = Integer.parseInt(strArr[2]);
                users.add(new User(id, name, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public User getById(int id) {
        List<User> users = getAll();
        for (User userI : users) {
            if (userI.getId() == id) {
                return userI;
            }
        }
        return null;
    }

    public void addToFile(User user) {
        UserRepository userRepository = new UserRepository();
        List<User> users = userRepository.getAll();
        try {
            bufferedWriter.write("\n" + String.valueOf(user.getId()) + ";" + user.getName() + ";" + String.valueOf(user.getAge()));
            users.add(user);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void remove(User user) {
//        UserRepository userRepository = new UserRepository();
//        List<User> users = userRepository.getAll();
        List<User> users = getAll();
        for (User userI : users) {
            if (userI.equals(user)) {
                users.remove(user);
            }
        }
    }
}
