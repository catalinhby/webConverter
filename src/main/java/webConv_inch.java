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
@WebServlet(name = "webConv_inch", urlPatterns = {"/convert_inch"})
public class webConv_inch extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        float inch = Float.parseFloat(request.getParameter("inch"));
        float cm = inch * 2.54f;
        
        request.setAttribute("cm", cm);
        request.setAttribute("inch", inch);
        
        
        
        String paginaRaspuns = "rezultatINCH.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(paginaRaspuns);
        dispatcher.forward(request, response);
    }

}
