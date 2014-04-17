/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.FraudValidation.ejb.business.domain.Customerbankingdetails;

/**
 *
 * @author walker
 */
@Stateless
public class CustomerbankingdetailsFacade extends AbstractFacade<Customerbankingdetails> implements CustomerbankingdetailsFacadeLocal {
    @PersistenceContext(unitName = "FraudValidator-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerbankingdetailsFacade() {
        super(Customerbankingdetails.class);
    }
    
}
