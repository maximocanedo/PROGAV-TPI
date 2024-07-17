package frgp.utn.edu.ar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.entidad.Prestamo;

@Repository
public interface LoanRepository extends JpaRepository<Prestamo, Integer> {
	/**
	 * Los m�todos CRUD y de listado b�sicos ya est�n inclu�dos en {@link JpaRepository}.
	 * Los repositorios no se deben implementar manualmente.
	 */
}
