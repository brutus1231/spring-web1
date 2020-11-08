package pl.sda.springweb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model) {

        model.addAttribute("hello", "Hello world !!");
        return "index";
    }

    @GetMapping("/")
    public String buttonClicked(@RequestParam(name = "button1")
                                            String button1,
                                            Model model) {
        int counter = 0;
        model.addAttribute("counter", "Kliknieto " + counter);
        return "index";
    }
}
