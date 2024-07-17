package frgp.utn.edu.ar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.model.Loan;
import frgp.utn.edu.ar.repository.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {
	
	@Autowired
	private LoanRepository repository;

	@Override
	public List<Loan> listarPrestamos() {
		return repository.findAll();
	}

}
