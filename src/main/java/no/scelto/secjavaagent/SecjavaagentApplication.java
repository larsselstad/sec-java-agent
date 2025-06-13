package no.scelto.secjavaagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@SpringBootApplication
@Controller
public class SecjavaagentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecjavaagentApplication.class, args);
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("formInput", new FormInput());
        return "index";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute FormInput formInput, BindingResult bindingResult, Model model) {
        model.addAttribute("formInput", formInput);
        return "result";
    }
}
