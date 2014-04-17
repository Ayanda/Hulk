/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.services;

import java.util.List;
import javax.ejb.Local;
import org.FraudValidation.ejb.business.domain.Customerpersonaldetails;

/**
 *
 * @author walker
 */
@Local
public interface CustomerpersonaldetailsFacadeLocal {

    void create(Customerpersonaldetails customerpersonaldetails);

    void edit(Customerpersonaldetails customerpersonaldetails);

    void remove(Customerpersonaldetails customerpersonaldetails);

    Customerpersonaldetails find(Object id);

    List<Customerpersonaldetails> findAll();

    List<Customerpersonaldetails> findRange(int[] range);

    int count();
    
}
