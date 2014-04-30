/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fraudvalidation.EJB.business.services;

import java.util.List;
import javax.ejb.Local;
import org.fraudvalidation.EJB.Entities.Customerpersonaldetails;

/**
 *
 * @author Lebogang
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
