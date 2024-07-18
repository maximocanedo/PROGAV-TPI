package frgp.utn.edu.ar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
	
}
