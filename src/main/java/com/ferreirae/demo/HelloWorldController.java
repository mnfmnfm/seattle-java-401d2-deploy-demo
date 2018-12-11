package com.ferreirae.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello world! This is another change!";
    }

    @RequestMapping("/hello/{pineapple}/{fromPerson}")
    public String helloToYou(@PathVariable(name="pineapple") String myName, @PathVariable String fromPerson) {
        return "Hello " + myName + ", from " + fromPerson + "!";
    }
}
