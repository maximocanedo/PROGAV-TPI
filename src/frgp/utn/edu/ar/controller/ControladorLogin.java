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
	
	@Autowired
	private User usuario;
	
	@RequestMapping("loginUser.html")
	public ModelAndView loguearse(String txtUser, String txtPassword) {
		ModelAndView MV = new ModelAndView();
		if (usuario.getRole() == "ADMIN") {
			MV.setViewName("Clientes");
		} else {
			MV.setViewName("Prestamos");
		}
		return MV;
	}
	
	@RequestMapping("listarUsuarios.html")
	public ModelAndView listarPersonas(String txtUser, String txtPassword) {
		ModelAndView MV = new ModelAndView();
		try {
			List<User> listaUsuarios = userService.listarUsuarios();
			MV.addObject("listaUsuarios", listaUsuarios);
		} catch (Exception e) {
			System.out.println(e);
		}
		MV.setViewName("Login");
		return MV;
	}

}
