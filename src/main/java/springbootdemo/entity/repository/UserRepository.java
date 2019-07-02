package springbootdemo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import springbootdemo.entity.domain.User;

import java.io.Serializable;

public interface UserRepository extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>,Serializable{
}
