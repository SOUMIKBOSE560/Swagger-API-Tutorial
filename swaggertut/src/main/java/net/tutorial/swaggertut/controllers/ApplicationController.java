package net.tutorial.swaggertut.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @GetMapping("/divide/{firstNum}/{secondNum}")
    public int divide(@PathVariable("firstNum") int firstNum,@PathVariable("secondNum") int secondNum){
        return firstNum/secondNum;
    }
}
