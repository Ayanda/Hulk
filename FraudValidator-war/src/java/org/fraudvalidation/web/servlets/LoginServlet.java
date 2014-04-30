/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fraudvalidation.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.fraudvalidation.EJB.business.services.StaffloginFacadeLocal;
import org.fraudvalidation.web.Beans.LoginBean;
import org.fraudvalidation.web.webservices.LoginStaffWebService;

/**
 *
 * @author Lebogang
 */
public class LoginServlet extends HttpServlet {
    @EJB
    private StaffloginFacadeLocal staffloginFacade;
    LoginStaffWebService loginStaffWebService = new LoginStaffWebService();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.InterruptedException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, InterruptedException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        LoginBean loginBean = new LoginBean();
        try {
            loginBean.setUsername(request.getParameter("username"));
            loginBean.setPassword(request.getParameter("password"));
            boolean isValid = staffloginFacade.validateLogin(loginBean.getUsername(), loginBean.getPassword());
            if (isValid) {
                HttpSession session = request.getSession(true);
                
                session.setAttribute(loginBean.getUsername(), loginBean);
                System.out.println("LOgin Sucess");
                request.getRequestDispatcher("/LoginSucessful.jsp").forward(request, response);
            } else {
                System.out.println("LOgin Bad");
                request.getRequestDispatcher("/LoginFailure.jsp").forward(request, response);
                //wait(5000000);
                //request.getRequestDispatcher("/index.jsp").forward(request, response);
            }

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
