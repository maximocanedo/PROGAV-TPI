package frgp.utn.edu.ar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;
	
	private String hash(String clear) {
		return BCrypt.hashpw(clear, BCrypt.gensalt());
	}

	@Override
	public List<Usuario> listarUsuarios() {
		return repository.findAll();
	}

	@Override
	public Optional<Usuario> obtenerUsuario(String username) {
		return repository.findById(username);
	}

	@Override
	public Usuario agregarUsuario(Usuario user) {
		String plainPassword = user.getPassword();
		user.setPassword(hash(plainPassword));
		return repository.saveAndFlush(user);
	}
	
	/**
	 * �nicamente valida usuario y clave. NO incluye ning�n tipo de tokens. 
	 * @param username Nombre de usuario.
	 * @param password Contrase�a. 
	 * @return Usuario en cuesti�n, si el usuario y clave son correctos.
	 */
	public Usuario login(String username, String password) {
		Optional<Usuario> user = repository.findById(username);
		if(!user.isPresent()) throw new Error("Invalid credentials");
		if(!BCrypt.checkpw(password, user.get().getPassword())) 
			throw new Error("Invalid credentials");
		return user.get();
	}

}
