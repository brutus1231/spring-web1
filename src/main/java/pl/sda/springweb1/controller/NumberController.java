package pl.sda.springweb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NumberController {

    @GetMapping("/numbers/{id}")
    public String getNumber(@PathVariable Integer id, Model model) {
        model.addAttribute("number", "Wybrano " + id);
        return "numbers";
    }
}
