<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="/JavaScript/PatientRegisterPage.js"></script>
 <script src= 
"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"> 
    </script>
</head>
<body>
	<h1>Welcome Patient</h1>
	<h2>This is Registration Page</h2>
<form id="myform">
	<table>
		<tr>
			<td> First Name :</td>
			<td> <input type="text" name="fname"></td>
		</tr>
		<tr>
			<td> Last Name :</td>
			<td> <input type="text" name="lname"></td>
		</tr>
		<tr>
			<td> Email : </td>
			<td> <input type="email" name="email"></td>
		</tr>
		<tr>
			<td> Password : </td>
			<td> <input type="text" name="password"></td>
		</tr>
		<tr>
			<td> Mobile : </td>
			<td> <input type="text" name="phone"></td>
		</tr>
		<tr>
			<td> Gender </td>
			<td> 
				<label><input type="radio" name="gender" value="male">Male</label> 
       		     <label><input type="radio" name="gender" value="female">Female</label>
			</td>
		</tr>
		<tr>
			<td> Birth Date </td>
			<td> <input type="date" name="birthDate"></td>
		</tr>
			<tr>
			<td> Height in feets </td>
			<td> <input type="text" name="height"></td>
		</tr>
		<tr>
			<td>Weight in Kg </td>
			<td> <input type="text" name="weight"></td>
		</tr>
		<tr>
			<td> Flat name </td>
			<td> <input type="text" name="flat"></td>
		</tr>
		<tr>
			<td> Street : </td>
			<td> <input type="text" name="street"></td>
		</tr>
		<tr>
			<td> City : </td>
			<td> <input type="text" name="city"></td>
		</tr>
		<tr>
			<td> State : </td>
			<td> <input type="text" name="state"></td>
		</tr>
		<tr>
			<td> Pincode : </td>
			<td> <input type="text" name="pincode"></td>
		</tr>
	</table>
</form>
	<td><button onclick="doRegister()">Register</button></td>
	<button><a href="/">Back</a></button>
	<div id="status" style="visibility:visible;">
		<p id="message" style="height: 5px;">Status </p>
	</div>
	
	
</body>
</html>