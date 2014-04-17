/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.services;

import java.util.List;
import javax.ejb.Local;
import org.FraudValidation.ejb.business.domain.Customeraccountdetails;

/**
 *
 * @author walker
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
