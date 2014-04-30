/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fraudvalidation.EJB.business.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.fraudvalidation.EJB.Entities.Customeraccountdetails;

/**
 *
 * @author Lebogang
 */
@Stateless
public class CustomeraccountdetailsFacade extends AbstractFacade<Customeraccountdetails> implements CustomeraccountdetailsFacadeLocal {
    @PersistenceContext(unitName ="FraudValidatorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomeraccountdetailsFacade() {
        super(Customeraccountdetails.class);
    }
    
}
