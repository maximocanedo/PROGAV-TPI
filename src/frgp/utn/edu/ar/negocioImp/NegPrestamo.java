package frgp.utn.edu.ar.negocioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.IdaoPrestamo;
import frgp.utn.edu.ar.entidad.Prestamo;
import frgp.utn.edu.ar.negocio.InegPrestamo;

@Deprecated
@Service("servicioPrestamo")
public class NegPrestamo implements InegPrestamo{
	
	@Autowired
	private IdaoPrestamo daoPrestamos;
	
	@Override
	public List<Prestamo> listarPrestamos() {
		return daoPrestamos.listarPrestamos();
	}

}
