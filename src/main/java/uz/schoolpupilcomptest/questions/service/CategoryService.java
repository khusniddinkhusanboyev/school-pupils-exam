package uz.schoolpupilcomptest.questions.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.schoolpupilcomptest.questions.model.Category;
import uz.schoolpupilcomptest.questions.repository.CategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }
    public Category add(Category category){
        return categoryRepository.save(category);
    }


}
