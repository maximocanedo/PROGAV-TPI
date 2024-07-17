package frgp.utn.edu.ar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.entidad.Persona;
import frgp.utn.edu.ar.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository repository;

	@Override
	public List<Persona> listarPersonas() {
		return repository.findAll();
	}

	@Override
	public Persona agregarPersona(Persona p) {
		return repository.saveAndFlush(p);
	}
	
}
