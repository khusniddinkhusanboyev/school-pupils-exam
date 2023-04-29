package uz.schoolpupilcomptest.security.controller.rest;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.schoolpupilcomptest.security.model.User;
import uz.schoolpupilcomptest.security.service.UserService;
import uz.schoolpupilcomptest.security.util.ApiResponse;
import uz.schoolpupilcomptest.security.util.UserRequest;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Tag(name = "security" , description = "user details")
@RequestMapping("/api")
public class LogInRestController {
    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserRequest userRequest) {

        Optional<User> optionalUser = userService.validation(userRequest);
        if (optionalUser.isPresent() && optionalUser.get().getPassword().equals(userRequest.getPassword())) {
            return new ResponseEntity<>(optionalUser.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new ApiResponse("username or password is worng. "), HttpStatus.BAD_REQUEST);

        }
    }
}
