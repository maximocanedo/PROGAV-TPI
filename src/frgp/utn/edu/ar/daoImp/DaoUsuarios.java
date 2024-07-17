package frgp.utn.edu.ar.daoImp;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.IdaoUsuario;
import frgp.utn.edu.ar.entidad.Usuario;


@Deprecated
@Repository("daoUsuarios")
public class DaoUsuarios implements IdaoUsuario {
	@Autowired
	private Conexion conexion;

	@Override
	public List<Usuario> listarUsuarios() {
		Session session = conexion.abrirConexion();
		List<Usuario> list = new LinkedList<>();
	    Query query = session.createQuery("from Usuario");
	    for(final Object o : query.list()) {
	        list.add((Usuario)o);
	    }
		return list;
	}

	@Override
	public Usuario obtenerUsuario(String username) {
		Session session = conexion.abrirConexion();
	    Query query = session.createQuery("SELECT u from Usuario u WHERE u.username = :username");
	    query.setParameter("username", username);
	    Usuario u = (Usuario) query.uniqueResult();
	    if(u == null) throw new Error("Not found. ");
		return u;
	}

	@Override
	public Usuario agregarUsuario(Usuario user) {
		Session session = conexion.abrirConexion();
		Transaction tx= session.beginTransaction();
		try {
			session.save(user); 
			tx = session.getTransaction();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Error("No se pudo agregar el usuario. ");
		}
		conexion.cerrarSession();
		return user;
	}
}
