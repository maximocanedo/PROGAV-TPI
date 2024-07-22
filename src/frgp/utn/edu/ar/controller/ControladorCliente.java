package frgp.utn.edu.ar.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.model.Loan;
import frgp.utn.edu.ar.model.User;

@Controller
public class ControladorCliente {	
	
	@RequestMapping("/cliente/prestamos.html")
	public ModelAndView eventoRedireccionarPrestamos(Model model) throws ParseException
	{
		ModelAndView MV = new ModelAndView();
		List<User> users = Arrays.asList(
                new User("admin1", "Admin Uno", "admin1@utn.com", "adminpass1", true, "ADMIN"),
                new User("admin2", "Admin Dos", "admin2@utn.com", "adminpass2", true, "ADMIN"),
                new User("admin3", "Admin Tres", "admin3@utn.com", "adminpass3", true, "ADMIN"),
                new User("pbordon", "Patricio Bordon", "pbordon@utn.com", "clientpass1", true, "CLIENTE"),
                new User("mcanedo", "Maximo Canedo", "mcanedo@utn.com", "clientpass2", true, "CLIENTE"),
                new User("lgruden", "Lucas Gruden", "lgruden@utn.com", "clientpass3", true, "CLIENTE")
        );
		List<Loan> loanList = Arrays.asList(
                new Loan(1, new SimpleDateFormat("yyyy-MM-dd").parse("2024-09-11"), users.get(0), 108000),
                new Loan(2, new SimpleDateFormat("yyyy-MM-dd").parse("2024-02-09"), users.get(1), 18000),
                new Loan(3, new SimpleDateFormat("yyyy-MM-dd").parse("2024-03-09"), users.get(2), 100000),
                new Loan(4, new SimpleDateFormat("yyyy-MM-dd").parse("2024-04-19"), users.get(3), 600000),
                new Loan(5, new SimpleDateFormat("yyyy-MM-dd").parse("2024-06-19"), users.get(4), 490000)
        );
		MV.addObject("prestamos", loanList);
		MV.setViewName("cliente/Prestamos");
		return MV;
	}
}
