package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void updateUser(int id, User user);

    void deleteUser(int id);

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);
}
