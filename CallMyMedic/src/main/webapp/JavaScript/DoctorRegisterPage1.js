/**
 * 
 */console.log("Welcome Doctor Register Page");

function doRegister(){
var data1 = $("form").serializeArray(); 


try{
		var User = {
		
		"fName":data1[0].value,
		"lName":data1[1].value,
		"email":data1[2].value,
		"password":data1[3].value,
		"phone":data1[4].value,
		"gender":data1[5].value,
		"birthDate":data1[6].value,
		"fee":data1[7].value,
		"experiance":data1[8].value,
		"accountno":data1[9].value,
		"status":"Active",
		"street":data1[10].value,
		"city":data1[11].value,
		"state":data1[12].value,
		"pinCode":data1[13].value
		
		
	}
	console.log(User);
}catch(error){
	console.log(User);
	document.getElementById("status").style.visibility="visible";
	document.getElementById("message").innerHTML = "Please Enter All Details";
	document.getElementById("message").style.color="orange";
	var isInvalid = true;
	
}

var xhttp = new XMLHttpRequest();

xhttp.onprogress = function() {
	document.getElementById("message").style.visibility="visible";
     document.getElementById("message").innerHTML = "We are Conecting with server";
	 document.getElementById("message").style.color="orange";
    };

xhttp.onload = function() {
	if (this.readyState == 4 && this.status == 200) {
	document.getElementById("message").style.visibility="visible";
    document.getElementById("message").innerHTML = "Succesffuly Register";
	document.getElementById("message").style.color="green";
    }
	else{
	 document.getElementById("message").style.visibility="visible";
	 document.getElementById("message").innerHTML = "Wrong Credentential Please Enter Valid Details";
	 document.getElementById("message").style.color="Red";
	}
    };
	


  xhttp.open("POST", "doctor/insert", true);
  xhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
	
  if(!isInvalid){
	xhttp.send(JSON.stringify(User));
}

console.log("Ended Function")
}

  
