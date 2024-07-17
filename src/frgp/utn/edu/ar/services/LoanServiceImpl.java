package frgp.utn.edu.ar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.entidad.Prestamo;
import frgp.utn.edu.ar.repositories.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {
	
	@Autowired
	private LoanRepository repository;

	@Override
	public List<Prestamo> listarPrestamos() {
		return repository.findAll();
	}

}
