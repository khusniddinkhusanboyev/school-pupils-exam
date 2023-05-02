package uz.schoolpupilcomptest.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.schoolpupilcomptest.test.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
