package frgp.utn.edu.ar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	
}
