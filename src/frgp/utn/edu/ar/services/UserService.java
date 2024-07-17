package frgp.utn.edu.ar.services;

import java.util.List;
import java.util.Optional;

import frgp.utn.edu.ar.model.User;


public interface UserService {
	
	public List<User> listarUsuarios();
	
	public Optional<User> obtenerUsuario(String username);
	
	public User agregarUsuario(User user);
	
}
