/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fraudvalidation.EJB.Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lebogang
 */
@Entity
@Table(name = "customeraccountdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customeraccountdetails.findAll", query = "SELECT c FROM Customeraccountdetails c"),
    @NamedQuery(name = "Customeraccountdetails.findByAccountNumber", query = "SELECT c FROM Customeraccountdetails c WHERE c.accountNumber = :accountNumber"),
    @NamedQuery(name = "Customeraccountdetails.findByIDNo", query = "SELECT c FROM Customeraccountdetails c WHERE c.iDNo = :iDNo"),
    @NamedQuery(name = "Customeraccountdetails.findByBalance", query = "SELECT c FROM Customeraccountdetails c WHERE c.balance = :balance"),
    @NamedQuery(name = "Customeraccountdetails.findByAmountDue", query = "SELECT c FROM Customeraccountdetails c WHERE c.amountDue = :amountDue"),
    @NamedQuery(name = "Customeraccountdetails.findByPaymentStatus", query = "SELECT c FROM Customeraccountdetails c WHERE c.paymentStatus = :paymentStatus")})
public class Customeraccountdetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AccountNumber")
    private Integer accountNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNo")
    private int iDNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Balance")
    private double balance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmountDue")
    private double amountDue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "PaymentStatus")
    private String paymentStatus;

    public Customeraccountdetails() {
    }

    public Customeraccountdetails(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customeraccountdetails(Integer accountNumber, int iDNo, double balance, double amountDue, String paymentStatus) {
        this.accountNumber = accountNumber;
        this.iDNo = iDNo;
        this.balance = balance;
        this.amountDue = amountDue;
        this.paymentStatus = paymentStatus;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getIDNo() {
        return iDNo;
    }

    public void setIDNo(int iDNo) {
        this.iDNo = iDNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountNumber != null ? accountNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customeraccountdetails)) {
            return false;
        }
        Customeraccountdetails other = (Customeraccountdetails) object;
        if ((this.accountNumber == null && other.accountNumber != null) || (this.accountNumber != null && !this.accountNumber.equals(other.accountNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.fraudvalidation.EJB.Entities.Customeraccountdetails[ accountNumber=" + accountNumber + " ]";
    }
    
}
