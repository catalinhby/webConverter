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
@WebServlet(name = "webConverterServlet", urlPatterns = {"/convert_Mile"})
public class webConverterServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        float mile = Float.parseFloat(request.getParameter("mile"));
        float km = mile * 1.6f;
        
        request.setAttribute("mile", mile);
        request.setAttribute("km", km);
        
        
        
        String paginaRaspuns = "rezultatMile.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(paginaRaspuns);
        dispatcher.forward(request, response);
    }

}
