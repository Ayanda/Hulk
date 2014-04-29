/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fraudvalidation.EJB.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lebogang
 */
@Entity
@Table(name = "customerbankingdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customerbankingdetails.findAll", query = "SELECT c FROM Customerbankingdetails c"),
    @NamedQuery(name = "Customerbankingdetails.findByBankAccountNum", query = "SELECT c FROM Customerbankingdetails c WHERE c.bankAccountNum = :bankAccountNum"),
    @NamedQuery(name = "Customerbankingdetails.findByIDNumber", query = "SELECT c FROM Customerbankingdetails c WHERE c.iDNumber = :iDNumber"),
    @NamedQuery(name = "Customerbankingdetails.findByBankName", query = "SELECT c FROM Customerbankingdetails c WHERE c.bankName = :bankName"),
    @NamedQuery(name = "Customerbankingdetails.findByPaymentDate", query = "SELECT c FROM Customerbankingdetails c WHERE c.paymentDate = :paymentDate")})
public class Customerbankingdetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BankAccountNum")
    private Integer bankAccountNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNumber")
    private int iDNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "BankName")
    private String bankName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PaymentDate")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    public Customerbankingdetails() {
    }

    public Customerbankingdetails(Integer bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public Customerbankingdetails(Integer bankAccountNum, int iDNumber, String bankName, Date paymentDate) {
        this.bankAccountNum = bankAccountNum;
        this.iDNumber = iDNumber;
        this.bankName = bankName;
        this.paymentDate = paymentDate;
    }

    public Integer getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(Integer bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankAccountNum != null ? bankAccountNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customerbankingdetails)) {
            return false;
        }
        Customerbankingdetails other = (Customerbankingdetails) object;
        if ((this.bankAccountNum == null && other.bankAccountNum != null) || (this.bankAccountNum != null && !this.bankAccountNum.equals(other.bankAccountNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.fraudvalidation.EJB.Entities.Customerbankingdetails[ bankAccountNum=" + bankAccountNum + " ]";
    }
    
}
