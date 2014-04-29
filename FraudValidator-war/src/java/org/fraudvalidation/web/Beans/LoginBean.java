/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fraudvalidation.web.Beans;

/**
 *
 * @author Lebogang
 */
public class LoginBean {

    private int entityNumber;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String jobTitle;

    public LoginBean(int entityNumber, String username, String password, String firstName, String lastName, String emailAddress, String jobTitle) {
        this.entityNumber = entityNumber;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.jobTitle = jobTitle;
    }

    public LoginBean() {
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getEntityNumber() {
        return entityNumber;
    }

    public void setEntityNumber(int entityNumber) {
        this.entityNumber = entityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "LoginBean{" + "entityNumber=" + entityNumber + ", username=" + username + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress + ", jobTitle=" + jobTitle + '}';
    }
}
