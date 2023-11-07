<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
        </form>
        <form action="convert_cm" method="post">
            Cm: <input type="number" name="cm" required />
            <input type="submit" value="transforma in inch" />
        </div>
        </form>
        
        <div class="info"> 1 centimetru = 0.393700787 inch</div>
    </body>
</html>
