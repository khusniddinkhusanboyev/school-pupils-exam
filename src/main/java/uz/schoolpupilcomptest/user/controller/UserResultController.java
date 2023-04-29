package uz.schoolpupilcomptest.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.schoolpupilcomptest.user.model.UserResults;
import uz.schoolpupilcomptest.user.service.UserResultService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserResultController {

    private final UserResultService userResultService;
    @GetMapping("/user-results")
    public List<UserResults> userResultsList(){
        return userResultService.getAll();
    }
}
