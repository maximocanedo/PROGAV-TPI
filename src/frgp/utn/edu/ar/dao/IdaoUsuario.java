package frgp.utn.edu.ar.dao;

import java.util.List;

import frgp.utn.edu.ar.entidad.Usuario;

public interface IdaoUsuario {
	public List<Usuario> listarUsuarios();
	public Usuario obtenerUsuario(String username);
	public Usuario agregarUsuario(Usuario user);
}
