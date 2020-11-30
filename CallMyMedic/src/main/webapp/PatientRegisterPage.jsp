<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="/PatientRegisterPage.js"></script>
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
			<td> <input type="text" id="flat"></td>
		</tr>
		<tr>
			<td> Street : </td>
			<td> <input type="text" id="street"></td>
		</tr>
		<tr>
			<td> City : </td>
			<td> <input type="text" id="city"></td>
		</tr>
		<tr>
			<td> State : </td>
			<td> <input type="text" id="state"></td>
		</tr>
		<tr>
			<td> Pincode : </td>
			<td> <input type="text" id="pincode"></td>
		</tr>
		<tr>
			<td><button onclick="doRegister()">Register</button></td>
			<td> Back </td>
		</tr>
	</table>
</form>
	<button onclick="doRegister()">Register</button>
	<p id="message" style="height: 5px">message</p>
	
</body>
</html>