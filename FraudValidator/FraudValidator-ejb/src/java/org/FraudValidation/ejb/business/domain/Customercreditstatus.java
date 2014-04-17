/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.domain;

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
 * @author walker
 */
@Entity
@Table(name = "customercreditstatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customercreditstatus.findAll", query = "SELECT c FROM Customercreditstatus c"),
    @NamedQuery(name = "Customercreditstatus.findByCurrentSalary", query = "SELECT c FROM Customercreditstatus c WHERE c.currentSalary = :currentSalary"),
    @NamedQuery(name = "Customercreditstatus.findByIDNumber", query = "SELECT c FROM Customercreditstatus c WHERE c.iDNumber = :iDNumber"),
    @NamedQuery(name = "Customercreditstatus.findByHighestEducation", query = "SELECT c FROM Customercreditstatus c WHERE c.highestEducation = :highestEducation"),
    @NamedQuery(name = "Customercreditstatus.findByEducationalInstitition", query = "SELECT c FROM Customercreditstatus c WHERE c.educationalInstitition = :educationalInstitition"),
    @NamedQuery(name = "Customercreditstatus.findByQualification", query = "SELECT c FROM Customercreditstatus c WHERE c.qualification = :qualification"),
    @NamedQuery(name = "Customercreditstatus.findByMissedPayments", query = "SELECT c FROM Customercreditstatus c WHERE c.missedPayments = :missedPayments"),
    @NamedQuery(name = "Customercreditstatus.findByPenalties", query = "SELECT c FROM Customercreditstatus c WHERE c.penalties = :penalties"),
    @NamedQuery(name = "Customercreditstatus.findByLastestDismisal", query = "SELECT c FROM Customercreditstatus c WHERE c.lastestDismisal = :lastestDismisal"),
    @NamedQuery(name = "Customercreditstatus.findByMonthlyInstallments", query = "SELECT c FROM Customercreditstatus c WHERE c.monthlyInstallments = :monthlyInstallments")})
public class Customercreditstatus implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CurrentSalary")
    private Float currentSalary;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Number")
    private Integer iDNumber;
    @Size(max = 50)
    @Column(name = "HighestEducation")
    private String highestEducation;
    @Size(max = 50)
    @Column(name = "EducationalInstitition")
    private String educationalInstitition;
    @Size(max = 50)
    @Column(name = "Qualification")
    private String qualification;
    @Column(name = "MissedPayments")
    private Integer missedPayments;
    @Size(max = 50)
    @Column(name = "Penalties")
    private String penalties;
    @Size(max = 100)
    @Column(name = "LastestDismisal")
    private String lastestDismisal;
    @Column(name = "MonthlyInstallments")
    private Float monthlyInstallments;

    public Customercreditstatus() {
    }

    public Customercreditstatus(Integer iDNumber) {
        this.iDNumber = iDNumber;
    }

    public Float getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Float currentSalary) {
        this.currentSalary = currentSalary;
    }

    public Integer getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(Integer iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getEducationalInstitition() {
        return educationalInstitition;
    }

    public void setEducationalInstitition(String educationalInstitition) {
        this.educationalInstitition = educationalInstitition;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Integer getMissedPayments() {
        return missedPayments;
    }

    public void setMissedPayments(Integer missedPayments) {
        this.missedPayments = missedPayments;
    }

    public String getPenalties() {
        return penalties;
    }

    public void setPenalties(String penalties) {
        this.penalties = penalties;
    }

    public String getLastestDismisal() {
        return lastestDismisal;
    }

    public void setLastestDismisal(String lastestDismisal) {
        this.lastestDismisal = lastestDismisal;
    }

    public Float getMonthlyInstallments() {
        return monthlyInstallments;
    }

    public void setMonthlyInstallments(Float monthlyInstallments) {
        this.monthlyInstallments = monthlyInstallments;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDNumber != null ? iDNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customercreditstatus)) {
            return false;
        }
        Customercreditstatus other = (Customercreditstatus) object;
        if ((this.iDNumber == null && other.iDNumber != null) || (this.iDNumber != null && !this.iDNumber.equals(other.iDNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.FraudValidation.ejb.business.domain.Customercreditstatus[ iDNumber=" + iDNumber + " ]";
    }
    
}
