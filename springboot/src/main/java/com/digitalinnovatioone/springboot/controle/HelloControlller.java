package com.digitalinnovatioone.springboot.controle;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloControlller {

    @GetMapping("/")
    public String helloMenssagem(){
        return "Digital Innovatio One";
    }

}
