package frgp.utn.edu.ar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.model.User;
import frgp.utn.edu.ar.services.UserService;

@Controller
public class ControladorLogin {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.html")
	public ModelAndView loguearse(Model model, 
			@RequestParam(name = "txtUser", defaultValue = "") String username,
            @RequestParam(name = "txtPassword", defaultValue = "") String password) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login");
		if(username != null) System.out.println("Usuario: " + username);
		if(password != null) System.out.println("Pass: " + password);
		
		mv.addObject("ok", "230");
		return mv;
	}
	
	@RequestMapping("/listarUsuarios.html")
	public ModelAndView listarPersonas(String txtUser, String txtPassword) {
		ModelAndView MV = new ModelAndView();
		List<User> listaUsuarios = userService.listarUsuarios();
		MV.addObject("listaUsuarios", listaUsuarios);
		MV.setViewName("Clientes");
		return MV;
	}

}
