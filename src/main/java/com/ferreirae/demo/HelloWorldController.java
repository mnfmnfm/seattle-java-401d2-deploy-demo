package com.ferreirae.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello/{pineapple}/{fromPerson}")
    public String helloToYou(@PathVariable(name="pineapple") String myName,
                             @PathVariable String fromPerson,
                             Model model) {
        model.addAttribute("myName", myName);
        return "hello";
    }
}
