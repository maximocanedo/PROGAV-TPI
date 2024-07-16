package frgp.utn.edu.ar.negocioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.IdaoUsuario;
import frgp.utn.edu.ar.dao.UsuarioRepository;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocio.InegUsuario;

@Service("servicioUsuario")
public class NegUsuario implements InegUsuario {
	
	@Autowired
	private IdaoUsuario usuarioRepository;
	
	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return usuarioRepository.listarUsuarios();
	}

	@Override
	public Usuario obtenerUsuario(int username) {
		// TODO Auto-generated method stub
		return usuarioRepository.obtenerUsuario(username);
	}

	@Override
	public boolean agregarUsuario(Usuario user) {
		// TODO Auto-generated method stub
		return usuarioRepository.agregarUsuario(user);
	}

    @Override
    public Usuario obtenerUsuarioPorId(int id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public void eliminarUsuario(int id) {
        usuarioRepository.deleteById(id);
    }

	@Override
    public List<Usuario> buscarUsuarios(String nombre, String apellido) {
        return usuarioRepository.buscarUsuarios(nombre, apellido);
    }


}
