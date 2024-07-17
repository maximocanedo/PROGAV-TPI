package frgp.utn.edu.ar.services;

import java.util.List;

import frgp.utn.edu.ar.model.Person;


public interface PersonService {
	
	public List<Person> listarPersonas();
	
	public Person agregarPersona(Person p);
}
