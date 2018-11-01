<%-- 
    Document   : EncryptData
    Created on : Nov 1, 2018, 2:59:41 PM
    Author     : PHANI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.encryptanddecrypt.samples.EncryptionUtility"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>EncryptAndDecryptParamsApp</title>
    </head>
    <body>
        <h1>Cipher Encrypt Data Using DES</h1>
        Sending Parameter User Id :8596741 <a href='DecryptData.jsp?userId=<%=EncryptionUtility.encryptData("Secret12","85967")%>'>:8596741</a>
    </body>
</html>

