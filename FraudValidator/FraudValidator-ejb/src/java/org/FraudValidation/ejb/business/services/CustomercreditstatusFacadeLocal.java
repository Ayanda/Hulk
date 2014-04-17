/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.services;

import java.util.List;
import javax.ejb.Local;
import org.FraudValidation.ejb.business.domain.Customercreditstatus;

/**
 *
 * @author walker
 */
@Local
public interface CustomercreditstatusFacadeLocal {

    void create(Customercreditstatus customercreditstatus);

    void edit(Customercreditstatus customercreditstatus);

    void remove(Customercreditstatus customercreditstatus);

    Customercreditstatus find(Object id);

    List<Customercreditstatus> findAll();

    List<Customercreditstatus> findRange(int[] range);

    int count();
    
}
