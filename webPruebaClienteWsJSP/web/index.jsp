<%-- 
    Document   : index
    Created on : 04/05/2015, 18:10:26
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Web Service desde Java EE</title>
    </head>
    <body>    <%-- start web service invocation --%><hr/>
          <h1>Web Service desde Java EE</h1>
     
    <%
    try {
	pruebaws.NewWebService_Service service = new pruebaws.NewWebService_Service();
	pruebaws.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	int valor1 = 123;
	int valor2 = 123;
	// TODO process result here
	int result = port.add(valor1, valor2);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

      
    </body>
</html>
