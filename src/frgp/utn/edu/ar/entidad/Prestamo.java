package frgp.utn.edu.ar.entidad;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Prestamo {
	@Id
    private int prestamoNumber;
    private Date date;
    @ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="username")
    private Usuario usuario;
    private double amount;
    private int totalInstallments;
    
    public Prestamo() {
		// TODO Auto-generated constructor stub
	}
    
    public Prestamo(int prestamoNumber, Date date, Usuario usuario, double amount, int totalInstallments) {
        this.prestamoNumber = prestamoNumber;
        this.date = date;
        this.usuario = usuario;
        this.amount = amount;
        this.totalInstallments = totalInstallments;
    }
    
    

    public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getPrestamoNumber() {
        return prestamoNumber;
    }

    public void setPrestamoNumber(int prestamoNumber) {
        this.prestamoNumber = prestamoNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTotalInstallments() {
        return totalInstallments;
    }

    public void setTotalInstallments(int totalInstallments) {
        this.totalInstallments = totalInstallments;
    }
}
