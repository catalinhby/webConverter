<%-- 
    Document   : rezultat
    Created on : Jan 19, 2022, 3:15:44 PM
    Author     : catal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Convertor web</title>        
    </head>
    
    
    
    <body>
        <header> 
            
        <h1><a class="titlu" href="index.jsp">Convertor</a></h1>
        
        <div class="nav">
            
            <nav>
                <ul>
                    <li><a href="convMile.jsp">mile in km</a></li>
                    <li><a href="convKM.jsp">km in mile</a></li>
                    <li><a href="convCM.jsp">cm in inch</a></li>
                    <li><a href="convINCH.jsp">inch in cm</a></li>
                </ul>
            </nav>
        

        </div>
        </header>
    
        <div align="center">
        <h1>Rezoltat conversie</h1>
        <p>
            <p> ${mile} mile = ${km} kilometri</p>
        </p>
        
        </div>
    </body>
</html>
