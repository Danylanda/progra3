package com.example.AppRest.Controller;

import com.example.AppRest.Service.Persona;
import com.example.AppRest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class UserControllerRest {
    @Autowired
    private UserService userService;
    private final String NAME_APP = "Example Solutions";

    @GetMapping("/nameApp")
    public String nameApp(){
        return NAME_APP;
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam(value = "name", defaultValue = "World")String name){
        return userService.getName(name);
    }

    @PostMapping("/person")
    public String save(@RequestBody Persona persona){
        return "Persona Insertada Correctamente";
    }

}
