package frgp.utn.edu.ar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.entidad.Usuario;

@Service
public interface UserService {
	
	public List<Usuario> listarUsuarios();
	
	public Optional<Usuario> obtenerUsuario(String username);
	
	public Usuario agregarUsuario(Usuario user);
	
}
