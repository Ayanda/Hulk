/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fraudvalidation.EJB.business.services;

import java.util.List;
import javax.ejb.Local;
import org.fraudvalidation.EJB.Entities.Stafflogin;

/**
 *
 * @author Lebogang
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
    
    boolean validateLogin(String uName, String pass);
    
    List staffInformation(String uName);
    
}
