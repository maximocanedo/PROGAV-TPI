package frgp.utn.edu.ar.services;

import java.util.List;

import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.entidad.Persona;

@Service
public interface PersonService {
	
	public List<Persona> listarPersonas();
	
	public Persona agregarPersona(Persona p);
}
