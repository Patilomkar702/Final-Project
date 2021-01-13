
console.log("PateintedPageLoaded");

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
		"height":data1[7].value,
		"weight":data1[8].value,
		"status":"Active",
		"flat":document.getElementById("flat").value,
		"street":document.getElementById("street").value,
		"city":document.getElementById("city").value,
		"state":document.getElementById("state").value,
		"pinCode":document.getElementById("pincode").value
	}
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
	if (this.readyState == 4 && this.status == 200) {
       document.getElementById("message").innerHTML = "Succesffuly Register";
	  document.getElementById("message").style.color="green";
    }
	else{
	 document.getElementById("message").innerHTML = "Wrong Credentential Please Enter VAlid Details";
	 document.getElementById("message").style.color="Red";
	}
    };



  xhttp.open("POST", "patient/insert", true);
  xhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
	
  if(!isInvalid){
	xhttp.send(JSON.stringify(User));
}
  

  console.log("Function end")
}