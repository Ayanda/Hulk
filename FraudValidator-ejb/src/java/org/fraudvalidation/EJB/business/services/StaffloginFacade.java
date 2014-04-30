/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fraudvalidation.EJB.business.services;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.fraudvalidation.EJB.Entities.Stafflogin;

/**
 *
 * @author Lebogang
 */
@Stateless
public class StaffloginFacade extends AbstractFacade<Stafflogin> implements StaffloginFacadeLocal {
    @PersistenceContext(unitName = "FraudValidatorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StaffloginFacade() {
        super(Stafflogin.class);
    }
    
     @Override
    public boolean validateLogin(String uName, String pass){
         Query query = em.createNamedQuery("Stafflogin.findAll");
       boolean isLogin = false;
       if(query.getMaxResults() != 0){
           if (uName.equalsIgnoreCase(query.getParameter("UserName").toString()) && pass.equals(query.getParameter("Password").toString())){
            isLogin = true;
            System.out.println("true");
        }
       }
       return isLogin;  
    }
    
    @Override
    public List staffInformation(String uName){
        List staffInfoList = null;
        Query query = em.createNamedQuery("Stafflogin.findByUserName");
        if(query.getMaxResults() != 0){
            staffInfoList.add(query.getParameter("EntityNum"));
            staffInfoList.add(query.getParameter("FirstName"));
            staffInfoList.add(query.getParameter("LastName"));
            staffInfoList.add(query.getParameter("EmailAddress"));
            staffInfoList.add(query.getParameter("JobTitle"));
        }
        return staffInfoList;
    }
}
