package springbootdemo.service;

import springbootdemo.entity.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(User user);
    void delete(Long id);
    void upde(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
}
