package com.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fun")
public class FunRestController {
    //expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/porsche")
    public String sayPorsche() {
        return "Porsche 911";
    }
}


@RestController
@RequestMapping("/funny")
class FunnyRestController {
    @GetMapping("/stoic")
    public String sayStoic() {
        return "Stoic";
    }
}
