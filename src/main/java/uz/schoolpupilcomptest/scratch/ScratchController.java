package uz.schoolpupilcomptest.scratch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScratchController {
    @GetMapping("/scratch")
    public String game(){
        return "scratch/index";
    }
}
