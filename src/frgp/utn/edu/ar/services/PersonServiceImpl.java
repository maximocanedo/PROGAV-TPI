package frgp.utn.edu.ar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.model.Person;
import frgp.utn.edu.ar.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository repository;

	@Override
	public List<Person> listarPersonas() {
		return repository.findAll();
	}

	@Override
	public Person agregarPersona(Person p) {
		return repository.saveAndFlush(p);
	}
	
}
