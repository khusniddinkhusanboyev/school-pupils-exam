package uz.schoolpupilcomptest.questions.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.schoolpupilcomptest.questions.model.Question;
import uz.schoolpupilcomptest.questions.model.SubCategory;
import uz.schoolpupilcomptest.questions.service.CategoryService;
import uz.schoolpupilcomptest.questions.service.QuestionService;
import uz.schoolpupilcomptest.questions.service.SubCategoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ExamController {

    private final CategoryService categoryService;
    private final SubCategoryService subCategoryService;
    private final QuestionService questionService;


    //categegories
    @GetMapping("/categories")
    public ResponseEntity<?> Categories() {
        return ResponseEntity.ok(categoryService.getAll());
    }
    //sub-categories
    @GetMapping("/sub-categories")
    public ResponseEntity<?> subCategories() {
        return ResponseEntity.ok(subCategoryService.getAll());
    }

    @GetMapping("/sub-category/{category_id}")
    public List<SubCategory> getByCategoryId(@PathVariable("category_id") Integer id){
        return subCategoryService.getByCategoryId(id);
    }

    //question
    @GetMapping("/questions")
    public ResponseEntity<?> questions() {
        return ResponseEntity.ok(questionService.getAll());
    }
    @GetMapping("/questions/{category_id}")
    public List<Question> getCategoryQuestion(@PathVariable("category_id") Integer id){
        return questionService.getByCategoryId(id);
    }


}
