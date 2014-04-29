<%-- 
    Document   : index
    Created on : Apr 16, 2014, 2:45:10 AM
    Author     : Lebogang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome, Debtor Daddy!</title>
    </head>
    <body>
        <h1>Welcome, Debtor Daddy!</h1>
        <img src="images\Debtor-Daddy-Logo.png" alt="logo" border="2"/>
        </br>
        <form name="actionForm" method="POST" action="LoginServlet">
            <label><strong>Username:</strong>
                <input type="text" id="username" name="username"></label>
            <p>
                <label><strong>Password:  </strong>
                    <input type="password" id="password" name="password"></label>
            <p>
                <label><input type="submit" name="submit" value="Login"/></label>   
        </form>
    </body>
</html>
