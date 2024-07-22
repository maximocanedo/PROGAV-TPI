package frgp.utn.edu.ar.model;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Loan {
	
    private int id;
    private Date date;
    private User user;
    private double amount;
    private int totalInstallments;
    
    
    
    public Loan(int id, Date date, User user, double amount) {
		super();
		this.id = id;
		this.date = date;
		this.user = user;
		this.amount = amount;
	}

	public Loan() { }  
    
	@Id
	public int getId() {
        return id;
    }
	
	public void setUser(User user) {
		this.user = user;
	}

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    @ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="username")
    public User getUser() {
		return user;
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
