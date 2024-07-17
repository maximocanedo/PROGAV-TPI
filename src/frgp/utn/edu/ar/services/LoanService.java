package frgp.utn.edu.ar.services;

import java.util.List;

import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.entidad.Prestamo;

@Service
public interface LoanService {
	
	public List<Prestamo> listarPrestamos();
	
}
