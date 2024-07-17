package frgp.utn.edu.ar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.entidad.Persona;

@Repository
public interface PersonRepository extends JpaRepository<Persona, Integer> {
	
	/** 
	 * Las operaciones CRUD y listado b�sico est�n inclu�das en {@link JpaRepository}. 
	 * Los repositorios no se implementan.
	 */
	
}
