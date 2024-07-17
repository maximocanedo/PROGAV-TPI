package frgp.utn.edu.ar.negocio;

import java.util.List;

import frgp.utn.edu.ar.entidad.Usuario;

@Deprecated
public interface InegUsuario {
	public List<Usuario> listarUsuarios();
	public Usuario obtenerUsuario(String username);
	public Usuario agregarUsuario(Usuario user);
}
