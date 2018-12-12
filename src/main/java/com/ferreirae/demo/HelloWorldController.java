package com.ferreirae.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

// uses templating!
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public RedirectView homeRedirect() {
        return new RedirectView("/dinosaurs");
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/hello/{pineapple}/{fromPerson}")
    public String helloToYou(@PathVariable(name="pineapple") String myName,
                             @PathVariable String fromPerson,
                             Model model) {
        model.addAttribute("myName", myName);
        return "potato";
    }
}
