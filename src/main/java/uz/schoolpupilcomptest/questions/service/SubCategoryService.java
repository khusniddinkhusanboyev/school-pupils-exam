package uz.schoolpupilcomptest.questions.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.schoolpupilcomptest.questions.model.SubCategory;
import uz.schoolpupilcomptest.questions.repository.SubCategoryRepository;

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
}
