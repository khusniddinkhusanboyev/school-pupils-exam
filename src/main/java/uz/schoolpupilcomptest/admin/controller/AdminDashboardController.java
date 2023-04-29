package uz.schoolpupilcomptest.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import uz.schoolpupilcomptest.questions.model.Question;
import uz.schoolpupilcomptest.questions.service.CategoryService;
import uz.schoolpupilcomptest.questions.service.QuestionService;
import uz.schoolpupilcomptest.questions.service.SubCategoryService;

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
        return "index.html";
    }
    @PostMapping("/save-question")
    public String addQuestion(@ModelAttribute("saveQuestion")Question question){
        questionService.save(question);
        return "redirect:/";
    }
}
