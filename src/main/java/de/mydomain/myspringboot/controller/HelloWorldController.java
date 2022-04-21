package de.mydomain.myspringboot.controller;

import de.mydomain.myspringboot.services.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    @Qualifier("sayConfigurableService")
    SayService sayService;

    @GetMapping("/hallo")
    public String helloWorld() {
        return sayService.say();
    }
}
