package com.iset.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/")
    public String index() {
        return "Salam Khadija, l'application fonctionne !";
    }
}