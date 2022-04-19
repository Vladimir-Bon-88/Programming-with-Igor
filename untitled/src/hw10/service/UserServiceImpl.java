package hw10.service;

import hw10.Repository.UserRepository;
import hw10.exceptions.UserAlreadyExistException;
import hw10.exceptions.UserNotExistException;
import hw10.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addToFile(User user) {
        User userForCheck = userRepository.getById(user.getId());
        if(userForCheck != null){
            throw new UserAlreadyExistException("User has been already existed");
        }
        userRepository.addToFile(user);
    }

    @Override
    public void remove(User user) {
        User userForCheck = userRepository.getById(user.getId());
        if(userForCheck == null){
            throw new UserNotExistException("User hasn't been existed");
        }
        userRepository.remove(user);
    }

    @Override
    public User getById(int id) {
        User userForCheck = userRepository.getById(id);
        if(userForCheck == null){
            throw new UserNotExistException("User hasn't been existed");
        }
        return userRepository.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }
}
