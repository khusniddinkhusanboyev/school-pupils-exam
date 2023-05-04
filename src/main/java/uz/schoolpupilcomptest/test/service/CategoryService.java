package uz.schoolpupilcomptest.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.schoolpupilcomptest.test.entity.Category;
import uz.schoolpupilcomptest.test.entity.Question;
import uz.schoolpupilcomptest.test.repository.CategoryRepository;

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


    public void save(Category category) {
        categoryRepository.save(category);
    }

    public void remove(Integer id) {
        categoryRepository.deleteById(id);
    }
}
