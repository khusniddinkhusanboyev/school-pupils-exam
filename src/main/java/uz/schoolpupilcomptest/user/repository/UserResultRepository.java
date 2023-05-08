package uz.schoolpupilcomptest.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.schoolpupilcomptest.user.model.UserResults;
@Repository
public interface UserResultRepository extends JpaRepository<UserResults ,Integer> {
}
