package pl.sda.springweb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(@RequestParam(name = "button1", required = false)
                                       String button1, Model model) {

        model.addAttribute("hello", "Hello world !!");
        if (button1 != null) {
            int counter = 0;
            model.addAttribute("counter", "Kliknieto " + counter);
        }
        return "index";
    }


}
