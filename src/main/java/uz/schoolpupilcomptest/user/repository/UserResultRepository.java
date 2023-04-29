package uz.schoolpupilcomptest.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.schoolpupilcomptest.user.model.UserResults;

public interface UserResultRepository extends JpaRepository<UserResults ,Integer> {
}
