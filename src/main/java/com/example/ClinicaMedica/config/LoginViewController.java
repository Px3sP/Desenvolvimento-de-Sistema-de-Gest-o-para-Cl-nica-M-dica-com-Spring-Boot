package com.example.ClinicaMedica.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginViewController {
    //Aquui esta estou criando um controlador para a pagina de login
    //RestController não ira funcionar aqui, ela trabalha sonmente com as requisições REST , com as API
    //Ja a controller trabalha quando estamos utilizando paginas web's.


    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
