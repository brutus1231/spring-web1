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
            //kliknieto w przycisk
            Object counter = model.getAttribute("counter_value");
            if(counter == null) {
                model.addAttribute("counter_value", 1);
                model.addAttribute("counter", "Kliknieto 1");
            }
            else {
                Integer counterInt = (Integer) counter;
                model.addAttribute("counter", "Kliknieto " + ++counterInt);
                model.addAttribute("counter_value", counterInt);
            }

        }
        return "index";
    }


}
