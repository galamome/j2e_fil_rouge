<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test des expressions EL</title>
    </head>
    <body>
      <p>
         Récupération du bean :
         	${bean_client.prenomClient}
         	${bean_client.nomClient}
			${bean_client.adresseClient}  
			${bean_client.emailClient}
			${bean_client.telephoneClient}       
     </p>
 
    </body>
</html>
