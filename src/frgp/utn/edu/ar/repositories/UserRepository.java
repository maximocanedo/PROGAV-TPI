package frgp.utn.edu.ar.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.entidad.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, String> {
	
	Optional<Usuario> findByUsername(String username);
	
	List<Usuario> findByNameLike(String name);
		
}
