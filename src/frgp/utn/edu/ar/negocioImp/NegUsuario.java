package frgp.utn.edu.ar.negocioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.IdaoUsuario;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocio.InegUsuario;

@Deprecated
@Service("servicioUsuario")
public class NegUsuario implements InegUsuario {
	
	@Autowired
	private IdaoUsuario daoUsuarios;
	
	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return daoUsuarios.listarUsuarios();
	}

	@Override
	public Usuario obtenerUsuario(String username) {
		// TODO Auto-generated method stub
		return daoUsuarios.obtenerUsuario(username);
	}

	@Override
	public Usuario agregarUsuario(Usuario user) {
		// TODO Auto-generated method stub
		return daoUsuarios.agregarUsuario(user);
	}

}
