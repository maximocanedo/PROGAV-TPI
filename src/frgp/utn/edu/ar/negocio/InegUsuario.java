package frgp.utn.edu.ar.negocio;

import java.util.List;

import frgp.utn.edu.ar.entidad.Usuario;

public interface InegUsuario {
	public List<Usuario> listarUsuarios();
	public Usuario obtenerUsuario(int username);
	public boolean agregarUsuario(Usuario user);
}
