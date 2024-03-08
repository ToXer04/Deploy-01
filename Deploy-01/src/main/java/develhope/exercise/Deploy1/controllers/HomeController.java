package develhope.exercise.Deploy1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {
    @Autowired
    Environment environment;

    @GetMapping
    public String sayDevName() {
        return environment.getProperty("varTree.devName");
    }
}
