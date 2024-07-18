package frgp.utn.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import frgp.utn.edu.ar.model.User;

import java.util.Arrays;
import java.util.List;

@Controller
public class ControllerAdmin {
	
	@RequestMapping("/admin.html")
    public String admin(Model model) {

        List<User> usuarios = Arrays.asList(
                new User("admin1", "Admin Uno", "admin1@utn.com", "adminpass1", true, "ADMIN"),
                new User("admin2", "Admin Dos", "admin2@utn.com", "adminpass2", true, "ADMIN"),
                new User("admin3", "Admin Tres", "admin3@utn.com", "adminpass3", true, "ADMIN"),
                new User("pbordon", "Patricio Bordon", "pbordon@utn.com", "clientpass1", true, "CLIENTE"),
                new User("mcanedo", "Maximo Canedo", "mcanedo@utn.com", "clientpass2", true, "CLIENTE"),
                new User("lgruden", "Lucas Gruden", "lgruden@utn.com", "clientpass3", true, "CLIENTE")
        );
        
        model.addAttribute("usuarios", usuarios);
        return "admin";
    }
}
