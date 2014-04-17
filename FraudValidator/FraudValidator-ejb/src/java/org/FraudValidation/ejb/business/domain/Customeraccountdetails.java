/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author walker
 */
@Entity
@Table(name = "customeraccountdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customeraccountdetails.findAll", query = "SELECT c FROM Customeraccountdetails c"),
    @NamedQuery(name = "Customeraccountdetails.findByAccountNumber", query = "SELECT c FROM Customeraccountdetails c WHERE c.accountNumber = :accountNumber"),
    @NamedQuery(name = "Customeraccountdetails.findByBalance", query = "SELECT c FROM Customeraccountdetails c WHERE c.balance = :balance"),
    @NamedQuery(name = "Customeraccountdetails.findByAmountDue", query = "SELECT c FROM Customeraccountdetails c WHERE c.amountDue = :amountDue"),
    @NamedQuery(name = "Customeraccountdetails.findByPaymentStatus", query = "SELECT c FROM Customeraccountdetails c WHERE c.paymentStatus = :paymentStatus")})
public class Customeraccountdetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "AccountNumber")
    private Integer accountNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Balance")
    private float balance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmountDue")
    private float amountDue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "PaymentStatus")
    private String paymentStatus;
    @JoinColumn(name = "IDNo", referencedColumnName = "ID_Number")
    @ManyToOne(optional = false)
    private Customerpersonaldetails iDNo;

    public Customeraccountdetails() {
    }

    public Customeraccountdetails(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customeraccountdetails(Integer accountNumber, float balance, float amountDue, String paymentStatus) {
        this.accountNumber = accountNumber;
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

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(float amountDue) {
        this.amountDue = amountDue;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Customerpersonaldetails getIDNo() {
        return iDNo;
    }

    public void setIDNo(Customerpersonaldetails iDNo) {
        this.iDNo = iDNo;
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
        return "org.FraudValidation.ejb.business.domain.Customeraccountdetails[ accountNumber=" + accountNumber + " ]";
    }
    
}
