/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fraudvalidation.web.webservices;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.fraudvalidation.EJB.Entities.Stafflogin;
import org.fraudvalidation.EJB.business.services.StaffloginFacadeLocal;

/**
 *
 * @author Lebogang
 */
@WebService(serviceName = "LoginStaffWebService")
public class LoginStaffWebService {
    @EJB
    private StaffloginFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "stafflogin") Stafflogin stafflogin) {
        ejbRef.create(stafflogin);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "stafflogin") Stafflogin stafflogin) {
        ejbRef.edit(stafflogin);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "stafflogin") Stafflogin stafflogin) {
        ejbRef.remove(stafflogin);
    }

    @WebMethod(operationName = "find")
    public Stafflogin find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Stafflogin> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Stafflogin> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "validateLogin")
    public boolean validateLogin(@WebParam(name = "uName") String uName, @WebParam(name = "pass") String pass) {
        return ejbRef.validateLogin(uName, pass);
    }

    @WebMethod(operationName = "staffInformation")
    public List staffInformation(@WebParam(name = "uName") String uName) {
        return ejbRef.staffInformation(uName);
    }
    
}
