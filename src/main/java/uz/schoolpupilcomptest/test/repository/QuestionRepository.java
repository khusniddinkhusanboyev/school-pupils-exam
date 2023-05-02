package uz.schoolpupilcomptest.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.schoolpupilcomptest.test.entity.Question;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
    List<Question> findByCategoryId(Integer categoryId);
}
