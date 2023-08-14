package br.com.criandoapi.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class Controuler {

    @GetMapping("/teste")
    public String mensgem(){
        return("Hello World");
    }

}
