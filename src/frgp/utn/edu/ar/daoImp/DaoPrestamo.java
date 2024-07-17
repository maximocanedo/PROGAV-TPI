package frgp.utn.edu.ar.daoImp;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.IdaoPrestamo;
import frgp.utn.edu.ar.entidad.Prestamo;

@Deprecated
@Repository("daoPrestamo")
public class DaoPrestamo implements IdaoPrestamo {
	@Autowired
	private Conexion conexion;

	@Override
	public List<Prestamo> listarPrestamos() {
		Session session = conexion.abrirConexion();
		List<Prestamo> list = new LinkedList<>();
	    Query query = session.createQuery("from Prestamo");
	    for(final Object o : query.list()) {
	        list.add((Prestamo)o);
	    }
		return list;
	}

}
