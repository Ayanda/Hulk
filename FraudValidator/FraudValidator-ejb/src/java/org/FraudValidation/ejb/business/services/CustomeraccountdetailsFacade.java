/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.FraudValidation.ejb.business.domain.Customeraccountdetails;

/**
 *
 * @author walker
 */
@Stateless
public class CustomeraccountdetailsFacade extends AbstractFacade<Customeraccountdetails> implements CustomeraccountdetailsFacadeLocal {
    @PersistenceContext(unitName = "FraudValidator-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomeraccountdetailsFacade() {
        super(Customeraccountdetails.class);
    }
    
}
