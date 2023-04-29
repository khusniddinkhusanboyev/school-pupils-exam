package uz.schoolpupilcomptest.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.schoolpupilcomptest.security.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
