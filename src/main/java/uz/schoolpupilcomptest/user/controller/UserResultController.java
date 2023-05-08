package uz.schoolpupilcomptest.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.schoolpupilcomptest.user.model.UserResultRequest;
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

    @PostMapping("/save-user-result")
    public UserResults save(@RequestBody UserResultRequest userResults){
        return userResultService.create(userResults);
    }
}
