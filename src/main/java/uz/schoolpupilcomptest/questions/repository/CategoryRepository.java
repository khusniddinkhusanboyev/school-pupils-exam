package uz.schoolpupilcomptest.questions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.schoolpupilcomptest.questions.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
