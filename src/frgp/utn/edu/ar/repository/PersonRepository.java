package frgp.utn.edu.ar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	/** 
	 * Las operaciones CRUD y listado b�sico est�n inclu�das en {@link JpaRepository}. 
	 * Los repositorios no se implementan.
	 */
	
}
