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
	public Usuario obtenerUsuario(int username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarUsuario(Usuario user) {
		Session session = conexion.abrirConexion();
		Transaction tx= session.beginTransaction();
		boolean aux = true;
		try
		{
			session.save(user); 
			tx = session.getTransaction();
			tx.commit();
		}
		catch (Exception e) {
			aux=false;
			tx.rollback();
		}
		conexion.cerrarSession();
		return true;
	}
}
