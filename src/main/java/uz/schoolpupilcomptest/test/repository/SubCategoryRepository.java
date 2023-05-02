package uz.schoolpupilcomptest.test.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.schoolpupilcomptest.test.entity.SubCategory;

import java.util.List;

public interface SubCategoryRepository extends JpaRepository<SubCategory,Integer> {
    List<SubCategory> findByCategoryId(Integer categoryId);
}