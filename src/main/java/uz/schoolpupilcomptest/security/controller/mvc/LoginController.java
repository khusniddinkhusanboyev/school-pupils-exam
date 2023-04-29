package uz.schoolpupilcomptest.security.controller.mvc;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uz.schoolpupilcomptest.security.model.User;
import uz.schoolpupilcomptest.security.service.UserService;
import uz.schoolpupilcomptest.security.util.UserRequest;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final UserService userService;
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("userDetail" , new UserRequest());
        return "login";
    }

    @PostMapping("/loadProcessUrl")
    public String validation(@ModelAttribute("userDetail")UserRequest userRequest){
      var optinalUser=userService.validation(UserRequest.builder().username(userRequest.getUsername()).password(userRequest.getPassword()).build());
      if (optinalUser.isPresent()){
      return "redirect:/";
      }
        System.err.println(optinalUser.get());
      return "redirect:/login";
    }
}
