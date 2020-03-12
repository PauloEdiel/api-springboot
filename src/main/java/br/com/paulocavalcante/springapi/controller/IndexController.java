package br.com.paulocavalcante.springapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class IndexController {

    @GetMapping(value = "/user", produces = "application/json")

    public ResponseEntity init() {
        return new ResponseEntity("Olá Rest Spring", HttpStatus.OK);
    }
}
