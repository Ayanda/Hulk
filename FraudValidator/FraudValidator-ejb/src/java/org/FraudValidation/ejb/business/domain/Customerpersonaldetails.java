/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author walker
 */
@Entity
@Table(name = "customerpersonaldetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customerpersonaldetails.findAll", query = "SELECT c FROM Customerpersonaldetails c"),
    @NamedQuery(name = "Customerpersonaldetails.findByName", query = "SELECT c FROM Customerpersonaldetails c WHERE c.name = :name"),
    @NamedQuery(name = "Customerpersonaldetails.findBySurname", query = "SELECT c FROM Customerpersonaldetails c WHERE c.surname = :surname"),
    @NamedQuery(name = "Customerpersonaldetails.findByDateOfBirth", query = "SELECT c FROM Customerpersonaldetails c WHERE c.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "Customerpersonaldetails.findByIDNumber", query = "SELECT c FROM Customerpersonaldetails c WHERE c.iDNumber = :iDNumber"),
    @NamedQuery(name = "Customerpersonaldetails.findByContactNumber", query = "SELECT c FROM Customerpersonaldetails c WHERE c.contactNumber = :contactNumber"),
    @NamedQuery(name = "Customerpersonaldetails.findByEmployeeStatus", query = "SELECT c FROM Customerpersonaldetails c WHERE c.employeeStatus = :employeeStatus"),
    @NamedQuery(name = "Customerpersonaldetails.findByJobTitle", query = "SELECT c FROM Customerpersonaldetails c WHERE c.jobTitle = :jobTitle"),
    @NamedQuery(name = "Customerpersonaldetails.findByCompany", query = "SELECT c FROM Customerpersonaldetails c WHERE c.company = :company"),
    @NamedQuery(name = "Customerpersonaldetails.findByNationality", query = "SELECT c FROM Customerpersonaldetails c WHERE c.nationality = :nationality"),
    @NamedQuery(name = "Customerpersonaldetails.findByRace", query = "SELECT c FROM Customerpersonaldetails c WHERE c.race = :race"),
    @NamedQuery(name = "Customerpersonaldetails.findByGender", query = "SELECT c FROM Customerpersonaldetails c WHERE c.gender = :gender"),
    @NamedQuery(name = "Customerpersonaldetails.findByPostalAddress", query = "SELECT c FROM Customerpersonaldetails c WHERE c.postalAddress = :postalAddress")})
public class Customerpersonaldetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Surname")
    private String surname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateOfBirth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Number")
    private Integer iDNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ContactNumber")
    private String contactNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "EmployeeStatus")
    private String employeeStatus;
    @Size(max = 50)
    @Column(name = "JobTitle")
    private String jobTitle;
    @Size(max = 50)
    @Column(name = "Company")
    private String company;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nationality")
    private String nationality;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Race")
    private String race;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gender")
    private char gender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "PostalAddress")
    private String postalAddress;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDNo")
    private List<Customeraccountdetails> customeraccountdetailsList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "iDNumber")
    private Customerbankingdetails customerbankingdetails;

    public Customerpersonaldetails() {
    }

    public Customerpersonaldetails(Integer iDNumber) {
        this.iDNumber = iDNumber;
    }

    public Customerpersonaldetails(Integer iDNumber, String name, String surname, Date dateOfBirth, String contactNumber, String employeeStatus, String nationality, String race, char gender, String postalAddress) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.employeeStatus = employeeStatus;
        this.nationality = nationality;
        this.race = race;
        this.gender = gender;
        this.postalAddress = postalAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(Integer iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    @XmlTransient
    public List<Customeraccountdetails> getCustomeraccountdetailsList() {
        return customeraccountdetailsList;
    }

    public void setCustomeraccountdetailsList(List<Customeraccountdetails> customeraccountdetailsList) {
        this.customeraccountdetailsList = customeraccountdetailsList;
    }

    public Customerbankingdetails getCustomerbankingdetails() {
        return customerbankingdetails;
    }

    public void setCustomerbankingdetails(Customerbankingdetails customerbankingdetails) {
        this.customerbankingdetails = customerbankingdetails;
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
        if (!(object instanceof Customerpersonaldetails)) {
            return false;
        }
        Customerpersonaldetails other = (Customerpersonaldetails) object;
        if ((this.iDNumber == null && other.iDNumber != null) || (this.iDNumber != null && !this.iDNumber.equals(other.iDNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.FraudValidation.ejb.business.domain.Customerpersonaldetails[ iDNumber=" + iDNumber + " ]";
    }
    
}
