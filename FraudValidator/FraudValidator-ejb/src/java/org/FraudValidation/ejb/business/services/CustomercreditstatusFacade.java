/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.FraudValidation.ejb.business.domain.Customercreditstatus;

/**
 *
 * @author walker
 */
@Stateless
public class CustomercreditstatusFacade extends AbstractFacade<Customercreditstatus> implements CustomercreditstatusFacadeLocal {
    @PersistenceContext(unitName = "FraudValidator-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomercreditstatusFacade() {
        super(Customercreditstatus.class);
    }
    
}
