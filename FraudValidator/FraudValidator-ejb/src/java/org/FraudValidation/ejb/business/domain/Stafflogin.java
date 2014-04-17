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
@Table(name = "stafflogin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stafflogin.findAll", query = "SELECT s FROM Stafflogin s"),
    @NamedQuery(name = "Stafflogin.findByEntityNum", query = "SELECT s FROM Stafflogin s WHERE s.entityNum = :entityNum"),
    @NamedQuery(name = "Stafflogin.findByUserName", query = "SELECT s FROM Stafflogin s WHERE s.userName = :userName"),
    @NamedQuery(name = "Stafflogin.findByPassword", query = "SELECT s FROM Stafflogin s WHERE s.password = :password"),
    @NamedQuery(name = "Stafflogin.findByFirstName", query = "SELECT s FROM Stafflogin s WHERE s.firstName = :firstName"),
    @NamedQuery(name = "Stafflogin.findByLastName", query = "SELECT s FROM Stafflogin s WHERE s.lastName = :lastName"),
    @NamedQuery(name = "Stafflogin.findByEmailAddress", query = "SELECT s FROM Stafflogin s WHERE s.emailAddress = :emailAddress"),
    @NamedQuery(name = "Stafflogin.findByJobTitle", query = "SELECT s FROM Stafflogin s WHERE s.jobTitle = :jobTitle")})
public class Stafflogin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "EntityNum")
    private Integer entityNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EmailAddress")
    private String emailAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "JobTitle")
    private String jobTitle;

    public Stafflogin() {
    }

    public Stafflogin(Integer entityNum) {
        this.entityNum = entityNum;
    }

    public Stafflogin(Integer entityNum, String userName, String password, String firstName, String lastName, String emailAddress, String jobTitle) {
        this.entityNum = entityNum;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.jobTitle = jobTitle;
    }

    public Integer getEntityNum() {
        return entityNum;
    }

    public void setEntityNum(Integer entityNum) {
        this.entityNum = entityNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityNum != null ? entityNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stafflogin)) {
            return false;
        }
        Stafflogin other = (Stafflogin) object;
        if ((this.entityNum == null && other.entityNum != null) || (this.entityNum != null && !this.entityNum.equals(other.entityNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.FraudValidation.ejb.business.domain.Stafflogin[ entityNum=" + entityNum + " ]";
    }
    
}
