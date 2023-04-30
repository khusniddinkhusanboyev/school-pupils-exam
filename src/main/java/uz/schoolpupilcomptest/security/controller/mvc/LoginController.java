
package uz.schoolpupilcomptest.security.controller.mvc;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.schoolpupilcomptest.security.model.User;
import uz.schoolpupilcomptest.security.service.UserService;
import uz.schoolpupilcomptest.security.util.UserRequest;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final UserService userService;
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    /*@PostMapping("/loadProcessUrl")
    public String validation(@RequestParam("username") String username,@RequestParam("password")String password){
      var optinalUser=userService.validation(UserRequest.builder().username(username).password(password).build());
      if (optinalUser.isPresent()){
        return "redirect:/";
      }
       // System.err.println(optinalUser.get());
      return "redirect:/login";
    }*/
}

