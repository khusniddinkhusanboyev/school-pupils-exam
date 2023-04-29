package uz.schoolpupilcomptest.questions.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.schoolpupilcomptest.questions.model.SubCategory;

import java.util.List;

public interface SubCategoryRepository extends JpaRepository<SubCategory,Integer> {
    List<SubCategory> findByCategoryId(Integer categoryId);
}