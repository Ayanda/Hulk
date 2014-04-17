/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.FraudValidation.ejb.business.domain.Customerpersonaldetails;

/**
 *
 * @author walker
 */
@Stateless
public class CustomerpersonaldetailsFacade extends AbstractFacade<Customerpersonaldetails> implements CustomerpersonaldetailsFacadeLocal {
    @PersistenceContext(unitName = "FraudValidator-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerpersonaldetailsFacade() {
        super(Customerpersonaldetails.class);
    }
    
}
