/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author catal
 */
@WebServlet(urlPatterns = {"/convert_km"})
public class webConv_km extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        float km = Float.parseFloat(request.getParameter("km"));
        float mile = km * 0.62f;
        
        request.setAttribute("km", km);
        request.setAttribute("mile", mile);
        
        
        
        String paginaRaspuns = "rezultatKM.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(paginaRaspuns);
        dispatcher.forward(request, response);
    }

}
