package frgp.utn.edu.ar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.model.User;
import frgp.utn.edu.ar.services.UserService;

@Controller
public class ControladorLogin {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView loguearse() {
		ModelAndView d = new ModelAndView();
		d.setViewName("Login");
		System.out.println("Login");
		return d;
	}
	
	@RequestMapping("/listarUsuarios")
	public ModelAndView listarPersonas(String txtUser, String txtPassword) {
		ModelAndView MV = new ModelAndView();
		List<User> listaUsuarios = userService.listarUsuarios();
		MV.addObject("listaUsuarios", listaUsuarios);
		MV.setViewName("Clientes");
		return MV;
	}

}
