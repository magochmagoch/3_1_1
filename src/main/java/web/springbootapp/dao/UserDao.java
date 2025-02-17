package web.springbootapp.dao;

import web.springbootapp.model.User;

import java.util.List;

public interface UserDao {

    void createUser(User user);
    User readUserById(int id);
    List<User> readAllUsers();
    void updateUser(int id, User user);
    void deleteUser(int id);

}
