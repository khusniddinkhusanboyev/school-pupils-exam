package uz.schoolpupilcomptest.questions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.schoolpupilcomptest.questions.model.Category;
import uz.schoolpupilcomptest.questions.model.Question;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
    List<Question> findByCategoryId(Integer categoryId);
}
