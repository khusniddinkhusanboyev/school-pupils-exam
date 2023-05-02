package uz.schoolpupilcomptest.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.schoolpupilcomptest.test.entity.SubCategory;
import uz.schoolpupilcomptest.test.repository.SubCategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubCategoryService {
    private final SubCategoryRepository subCategoryRepository;
    public List<SubCategory> getAll(){
        return subCategoryRepository.findAll();
    }
    public List<SubCategory> getByCategoryId(Integer categoryId){
        return subCategoryRepository.findByCategoryId(categoryId);
    }

    public SubCategory add(SubCategory subCategory){
        return subCategoryRepository.save(subCategory);
    }
}
