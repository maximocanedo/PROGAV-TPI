<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
    #form-login{
        display: grid;
        gap: 5px;
        width: 400px;
    }
</style>
</head>
<body>
    <form action="loginUser.html" method="get" id="form-login">
        <h1>Login</h1>
        <label for="txtUser">Usuario: <input type="text" name="txtUser" id="txtUser"></label>
        <label for="txtPassword">Contrasenia: <input type="text" name="txtPassword" id="txtPassword"></label>
        <button type="submit" id="btnLogin" name="btnLogin">Ingresar</button>
    </form>
</body>
</html>