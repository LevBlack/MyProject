package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.User;
import web.repository.UserRepository;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void addUser(User user) {

        userRepository.save(user);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null); //
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void removeUser(int id) {

        userRepository.deleteById(id);
    }
}
