package com.poc.springboot.keycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleTestController
{
    @GetMapping( "/first")
    public String getPublic() {
        return "GET - first API, secured by Default";
    }
}
