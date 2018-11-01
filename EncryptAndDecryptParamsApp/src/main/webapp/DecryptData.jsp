<%-- 
    Document   : DecryptData
    Created on : Nov 1, 2018, 3:03:28 PM
    Author     : PHANI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.encryptanddecrypt.samples.DecryptionUtility"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Decrypt Data</title>
    </head>
    <body>
        <h2>Decrypt Data</h2>
        <%
	// Read parameter
	String userId = request.getParameter("userId");
%>

Incoming data : <%=userId%><br/>
Decrypted Data : <%=DecryptionUtility.decryptData("Secret12",userId)%><br/>
<br/>
<br/>
<a href='EncryptData.jsp'>back</a>
    </body>
</html>
