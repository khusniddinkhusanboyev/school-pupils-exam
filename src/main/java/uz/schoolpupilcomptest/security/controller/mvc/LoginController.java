
package uz.schoolpupilcomptest.security.controller.mvc;


import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {
        Authentication authentication =
                new UsernamePasswordAuthenticationToken(username, password);
        AuthenticationManager authenticationManager =
                (AuthenticationManager) SecurityContextHolder.getContext().getAuthentication();
        Authentication result = authenticationManager.authenticate(authentication);
        SecurityContextHolder.getContext().setAuthentication(result);
        return "redirect:/home";
    }
}

