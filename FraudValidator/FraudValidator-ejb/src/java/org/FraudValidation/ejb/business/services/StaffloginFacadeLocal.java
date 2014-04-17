/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.services;

import java.util.List;
import javax.ejb.Local;
import org.FraudValidation.ejb.business.domain.Stafflogin;

/**
 *
 * @author walker
 */
@Local
public interface StaffloginFacadeLocal {

    void create(Stafflogin stafflogin);

    void edit(Stafflogin stafflogin);

    void remove(Stafflogin stafflogin);

    Stafflogin find(Object id);

    List<Stafflogin> findAll();

    List<Stafflogin> findRange(int[] range);

    int count();
    
}
