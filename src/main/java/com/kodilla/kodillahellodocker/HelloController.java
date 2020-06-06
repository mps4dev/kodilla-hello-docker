package com.kodilla.kodillahellodocker;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloController {

    @GetMapping
    public String hello(@RequestParam Optional<String> name) {
        return name.map(n -> "Hello " + n + "!").orElse("Hello, World!");
    }

}
