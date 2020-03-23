package br.com.paulocavalcante.springapi.controller;

import br.com.paulocavalcante.springapi.model.User;
import br.com.paulocavalcante.springapi.repository.UserReposirory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class IndexController {

    @Autowired
    UserReposirory userReposirory;

    @GetMapping(value = "/users/{id}/relatorio")
    public ResponseEntity<User> relatorio(@PathVariable Long id) {
        return new ResponseEntity(userReposirory.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> init(@PathVariable Long id) {
        return new ResponseEntity(userReposirory.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<User> list() {
        return new ResponseEntity(userReposirory.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> cadastrar(@RequestBody User user){

        return new ResponseEntity<User>(userReposirory.save(user), HttpStatus.OK);
    }


}
