/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fraudvalidation.EJB.business.services;

import java.util.List;
import javax.ejb.Local;
import org.fraudvalidation.EJB.Entities.Customerbankingdetails;

/**
 *
 * @author Lebogang
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
