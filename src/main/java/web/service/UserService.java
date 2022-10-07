package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUser(int id);

    List<User> getAllUsers();

    void removeUser(int id);

}
