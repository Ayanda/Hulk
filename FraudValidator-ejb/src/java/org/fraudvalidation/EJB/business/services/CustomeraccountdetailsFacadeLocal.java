/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fraudvalidation.EJB.business.services;

import java.util.List;
import javax.ejb.Local;
import org.fraudvalidation.EJB.Entities.Customeraccountdetails;

/**
 *
 * @author Lebogang
 */
@Local
public interface CustomeraccountdetailsFacadeLocal {

    void create(Customeraccountdetails customeraccountdetails);

    void edit(Customeraccountdetails customeraccountdetails);

    void remove(Customeraccountdetails customeraccountdetails);

    Customeraccountdetails find(Object id);

    List<Customeraccountdetails> findAll();

    List<Customeraccountdetails> findRange(int[] range);

    int count();
    
}
