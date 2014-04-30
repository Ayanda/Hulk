/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fraudvalidation.EJB.business.services;

import java.util.List;
import javax.ejb.Local;
import org.fraudvalidation.EJB.Entities.Customercreditstatus;

/**
 *
 * @author Lebogang
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
