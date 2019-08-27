package br.edu.ifpb.SDjwt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/users")
    @ResponseBody
    public String getUsers(){
        return "{\"users\":[{\"name\":\"Camila\",\"country\":\"Brasil\"}," +
                "{\"name\":\"Ari\",\"country\":\"EUA\"}]}";
    }


}
