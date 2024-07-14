package frgp.utn.edu.ar.entidad;
import java.util.Date;

public class Prestamo {
    private int prestamoNumber;
    private Date date;
    private String clientDNI;
    private String clientName;
    private double amount;
    private int totalInstallments;

    public Prestamo(int prestamoNumber, Date date, String clientDNI, String clientName, double amount, int totalInstallments) {
        this.prestamoNumber = prestamoNumber;
        this.date = date;
        this.clientDNI = clientDNI;
        this.clientName = clientName;
        this.amount = amount;
        this.totalInstallments = totalInstallments;
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

    public String getClientDNI() {
        return clientDNI;
    }

    public void setClientDNI(String clientDNI) {
        this.clientDNI = clientDNI;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
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
