package br.projectPersistence.mybatissolution.controller;

import br.projectPersistence.mybatissolution.mapper.UserMapper;
import br.projectPersistence.mybatissolution.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserMapper mapper;

    @GetMapping("listar")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAll(){
        return mapper.findAll();
    }

    @PostMapping("criar")
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(@RequestBody User user){
        this.mapper.insertNewUser(user);

        return "CRIADO COM SUCESSO";
    }

    @PutMapping("atualizar")
    @ResponseStatus(HttpStatus.OK)
    public String updateUser(@RequestBody User user){
        this.mapper.updateExistentUser(user);

        return "ATUALIZADO COM SUCESSO";
    }

}
