/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author walker
 */
@Entity
@Table(name = "customerbankingdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customerbankingdetails.findAll", query = "SELECT c FROM Customerbankingdetails c"),
    @NamedQuery(name = "Customerbankingdetails.findByBankAccountNum", query = "SELECT c FROM Customerbankingdetails c WHERE c.bankAccountNum = :bankAccountNum"),
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
    @Size(min = 1, max = 50)
    @Column(name = "BankName")
    private String bankName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PaymentDate")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;
    @JoinColumn(name = "IDNumber", referencedColumnName = "ID_Number")
    @OneToOne(optional = false)
    private Customerpersonaldetails iDNumber;

    public Customerbankingdetails() {
    }

    public Customerbankingdetails(Integer bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public Customerbankingdetails(Integer bankAccountNum, String bankName, Date paymentDate) {
        this.bankAccountNum = bankAccountNum;
        this.bankName = bankName;
        this.paymentDate = paymentDate;
    }

    public Integer getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(Integer bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
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

    public Customerpersonaldetails getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(Customerpersonaldetails iDNumber) {
        this.iDNumber = iDNumber;
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
        return "org.FraudValidation.ejb.business.domain.Customerbankingdetails[ bankAccountNum=" + bankAccountNum + " ]";
    }
    
}
