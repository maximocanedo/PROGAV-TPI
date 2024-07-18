package frgp.utn.edu.ar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.model.Person;
import frgp.utn.edu.ar.services.PersonService;

@Controller
public class ControladorCliente {

	@Autowired
	private PersonService personService;
	
	
	@RequestMapping("/clients/add.html")
	public ModelAndView eventoRedireccionarPag1(Integer txtDni,String txtNombre, String txtApellido)
	{
		ModelAndView MV = new ModelAndView();
		
		Person persona = new Person();
		
		persona.setApellido(txtApellido);
		persona.setDni(txtDni);
		persona.setNombre(txtNombre);
		persona = personService.agregarPersona(persona);
		String cartel = "No se pudo agregar la persona";
		if(persona != null) {
			cartel="La persona ha sido agregada exitosamente";
		}
		
		MV.addObject("estadoAgregarPersona",cartel);
		MV.setViewName("Inicio");
		return MV;
	}
}
