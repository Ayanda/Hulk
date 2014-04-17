/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.services;

import java.util.List;
import javax.ejb.Local;
import org.FraudValidation.ejb.business.domain.Customerbankingdetails;

/**
 *
 * @author walker
 */
@Local
public interface CustomerbankingdetailsFacadeLocal {

    void create(Customerbankingdetails customerbankingdetails);

    void edit(Customerbankingdetails customerbankingdetails);

    void remove(Customerbankingdetails customerbankingdetails);

    Customerbankingdetails find(Object id);

    List<Customerbankingdetails> findAll();

    List<Customerbankingdetails> findRange(int[] range);

    int count();
    
}
