package uz.schoolpupilcomptest.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import uz.schoolpupilcomptest.test.entity.Category;
import uz.schoolpupilcomptest.test.entity.Question;
import uz.schoolpupilcomptest.test.entity.SubCategory;
import uz.schoolpupilcomptest.test.service.CategoryService;
import uz.schoolpupilcomptest.test.service.QuestionService;
import uz.schoolpupilcomptest.test.service.SubCategoryService;

@Controller
@RequiredArgsConstructor
public class AdminDashboardController {
    private final QuestionService questionService;
    private final CategoryService categoryService;
    private final SubCategoryService subCategoryService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("questions" ,questionService.getAll());
        model.addAttribute("categories" , categoryService.getAll());
        model.addAttribute("subCategories" , subCategoryService.getAll());
        model.addAttribute("saveQuestion" ,new Question());
        model.addAttribute("saveCategory" ,new Category());
        model.addAttribute("saveSubCategory" ,new SubCategory());
        return "index.html";
    }
    @PostMapping("/save-question")
    public String addQuestion(@ModelAttribute("saveQuestion")Question question){
        questionService.save(question);
        return "redirect:/";
    }
    @PostMapping("/save-Category")
    public String addCategory(@ModelAttribute("saveCategory")Category category){
        categoryService.save(category);
        return "redirect:/";
    }
    @PostMapping("/save-SubCategory")
    public String addSubCategory(@ModelAttribute("saveSubCategory")SubCategory subCategory){
        subCategoryService.save(subCategory);
        return "redirect:/";
    }



    //delete
    @GetMapping("/delete-SubCategory/{id}")
    public String deleteSubCategory(@PathVariable("id")Integer id){
        subCategoryService.remove(id);
        return "redirect:/";
    }

    @GetMapping("/delete-Question/{id}")
    public String deleteQuestion(@PathVariable("id")Integer id){
        questionService.remove(id);
        return "redirect:/";
    }
    @GetMapping("/delete-Category/{id}")
    public String deleteCategory(@PathVariable("id")Integer id){
        categoryService.remove(id);
        return "redirect:/";
    }

}
