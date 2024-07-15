package frgp.utn.edu.ar.dao;

import java.util.List;

import frgp.utn.edu.ar.entidad.Usuario;

public interface IdaoUsuario {
	public List<Usuario> listarUsuarios();
	public Usuario obtenerUsuario(int username);
	public boolean agregarUsuario(Usuario user);
}
