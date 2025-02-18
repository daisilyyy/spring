package web.service;

import web.model.User;
import web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }
    @Transactional
    public void delete(Long id) {
        userRepository.delete(id);
    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
