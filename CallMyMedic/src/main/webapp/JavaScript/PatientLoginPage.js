console.log("Pateint Login JS");

function doRegister(){
var data1 = $("form").serializeArray(); 
console.log(data1);

try{
		var User = {
		"email":data1[0].value,
		"password":data1[1].value,
	}
	
	if(User.email == "")
		throw error;
	else if(User.password == "")
		throw error;
	else
		console.log(User);

}catch(error){
	document.getElementById("message").innerHTML = "Please Enter All Details";
	document.getElementById("message").style.color="orange";
	var isInvalid = true;
	
}

var xhttp = new XMLHttpRequest();

xhttp.onprogress = function() {
     document.getElementById("message").innerHTML = "We are Conecting with server";
	 document.getElementById("message").style.color="orange";
    };

xhttp.onload = function() {
	
	var flag = xhttp.responseText;
	console.log(flag + "response text");

	if(flag==="true" && this.readyState == 4 && this.status == 200)
	{
	document.getElementById("message").style.visibility="visible";
    document.getElementById("message").innerHTML = "Successfully Register";
	document.getElementById("message").style.color="green";
	document.location.href = "/patient/index";
    }
	else
	{
	 document.getElementById("message").style.visibility="visible";
	 document.getElementById("message").innerHTML = "Wrong Credential Please Enter Valid Details";
	 document.getElementById("message").style.color="Red";
	}
    };



  xhttp.open("POST", "/patient/find", true);
  xhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
	
  if(!isInvalid){
	xhttp.send(JSON.stringify(User));
}
  

  console.log("Function end")
}


