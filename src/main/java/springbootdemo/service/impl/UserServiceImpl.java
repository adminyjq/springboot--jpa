package springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootdemo.entity.domain.User;
import springbootdemo.entity.repository.UserRepository;
import springbootdemo.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository UserRepository;

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void upde(User user) {

    }

    @Override
    public Optional<User> findById(Long id) {
        return UserRepository.findById(id);
    }

  @Override
    public List<User> findAll() {
        return null;
    }
}
