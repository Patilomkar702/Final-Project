<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <script src= 
"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"> 
    </script>
<script type="text/javascript" src="/JavaScript/PatientLoginPage.js"></script>
</head>
<body>
	<h1>Welcome Patient</h1>
	<h2>This is Login Page</h2>
	<form>
		<table>
			<tr>
				<td><label>Username</label></td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
	</form>
	<button onclick="doRegister()">Register</button>
	<button><a href="/">Back</a></button>
	<div id="status" style="visibility:visible;">
		<p id="message" style="height: 5px;">Status </p>
	</div>
	
	
</body>
</html>