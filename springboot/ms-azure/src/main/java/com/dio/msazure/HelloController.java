package com.dio.msazure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "<<<< Olá pessoal da Aceleração Avanade >>>> ";
    }
}
