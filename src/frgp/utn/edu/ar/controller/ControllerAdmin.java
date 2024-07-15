package frgp.utn.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import frgp.utn.edu.ar.entidad.Usuario;

import java.util.Arrays;
import java.util.List;

@Controller
public class ControllerAdmin {
	
	//@GetMapping("/admin")
    public String admin(Model model) {

        List<Usuario> usuarios = Arrays.asList(
                new Usuario("admin1", "Admin Uno", "admin1@utn.com", "adminpass1", true, "ADMIN"),
                new Usuario("admin2", "Admin Dos", "admin2@utn.com", "adminpass2", true, "ADMIN"),
                new Usuario("admin3", "Admin Tres", "admin3@utn.com", "adminpass3", true, "ADMIN"),
                new Usuario("pbordon", "Patricio Bordon", "pbordon@utn.com", "clientpass1", true, "CLIENTE"),
                new Usuario("mcanedo", "Maximo Canedo", "mcanedo@utn.com", "clientpass2", true, "CLIENTE"),
                new Usuario("lgruden", "Lucas Gruden", "lgruden@utn.com", "clientpass3", true, "CLIENTE")
        );
        
        model.addAttribute("usuarios", usuarios);
        return "admin";
    }
}
