<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login JSP</title>
</head>
<% java.util.Date date = new java.util.Date(); %>
<body>
First JSP Page
<div>Current date is <%=date%></div>

${errorMessage}
<form action = "/login" method = "POST">
  UserName:
  <input type="text" name="name"><br><br>
   Password: 
   <input type="password" name="password"><br>
  <input type = "submit" value="Login">
   
</form>
</body>

</html>