package hw10;

import hw10.Repository.UserRepository;
import hw10.model.User;
import hw10.service.UserService;
import hw10.service.UserServiceImpl;

public class App {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserServiceImpl(new UserRepository());
        User user1 = new User(11, "Vanya", 41);
        userService.addToFile(user1);
        userService.remove(user1);
        userService.getAll().toString();
    }
}
