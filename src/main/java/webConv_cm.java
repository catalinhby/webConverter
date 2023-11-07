/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webconverter;

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
@WebServlet(name = "webConv_cm", urlPatterns = {"/convert_cm"})
public class webConv_cm extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        float cm = Float.parseFloat(request.getParameter("cm"));
        float inch = cm * 0.39f;
        
        
        request.setAttribute("inch", inch);
        request.setAttribute("cm", cm);
        
        
        
        String paginaRaspuns = "rezultatCM.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(paginaRaspuns);
        dispatcher.forward(request, response);
    }

}
