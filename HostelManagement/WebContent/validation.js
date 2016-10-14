function formValidation() {
	var name=document.getElementById("rec_name");
	var phone=document.getElementById("rec_num");
	var email=document.getElementById("rec_email");
	var address=document.getElementById("rec_add");
	var pass=document.getElementById("rec_pass");
	var cpass=document.getElementById("rec_cpass");
	
	var showname=document.getElementById("rec_name_valid");
	var showlname=document.registration.showlname;
	var showmobile=document.registration.showmobile;
	
	var gob=false;
		if (allalpha(name)) {
			
				if (alphanumeric(address)) {
					
					if(allnumericm(phone)){
						if(isEmail(email)){
							if(alphanumspecial(pass)){
								if(alphanumspecial(cpass)){
									got=true;
								}
							}
							
						}
						
						
					}
				}
			
		}else{
			showname.innerHTML="Name must be Alphabatic value ";
			name.focus();
			gob=false;
		}
	
	return gob;

}

function allnumeric(fname) {
	var numbers = /^[0-9]+$/;
		var flag=false;
	if (fname.value.length == 10) {
		flag=true;
		showfname.innerHTML=" ";
		if(fname.value.match(numbers)) {
			flag=true;
			showfname.innerHTML=" ";
		}else{
			showfname.innerHTML="first Name must have numeric value ";
			fname.focus();
			flag=false;
		}
	} else {
		showfname.innerHTML="first Name must have 10 numeric value ";
		fname.focus();
		flag=false;
	}
		
	return flag;
}
function allnumericm(mobile) {
	var numbers = /^[0-9]+$/;
	var flag=false;
	if (mobile.value.length == 10) {
		flag=true;
		showmobile.innerHTML=" ";
		
		if (mobile.value.match(numbers)) {
			flag=true;
			showmobile.innerHTML=" ";
		} else {
			//alert('Mobile No must have numeric characters only');
			showmobile.innerHTML="Mobile No. must have numeric value ";
			mobile.focus();
			flag=false;
		}
	} else {
		//alert('Mobile No must have 10 numeric characters only');
		showmobile.innerHTML="Mobile No. must have 10 numeric value ";
		mobile.focus();
		flag=false;
	}
	
	return flag;
}

function alphanumeric(lname) {
	var letters = /^[0-9a-zA-Z]+$/;
	var flag=false;
	if (lname.value.length == 12) {
		flag=true;
		showlname.innerHTML=" ";
		
		if (lname.value.match(letters)) {
			flag=true;
			showlname.innerHTML=" ";
		} else {
			//alert('Last Name must have alphanumeric characters only');
			showlname.innerHTML="Last Name must have alphanumeric characters only ";
			lname.focus();
			flag=false;
		}
	} else {
		//alert('Last Name must have 12 alphanumeric characters only');
		showlname.innerHTML="Last Name must have 12 alphanumeric characters only ";
		lname.focus();
		flag=false;
	}
	
	return flag;
}


function allnumeric(fname) {
	var numbers = /^[0-9]+$/;
	
	if(fname.match(numbers))
		return true;
	else
		return false;	
}

function allalpha(alpha){
	var letters = /^[a-zA-Z]+$/;
	if(alpha.match(letters))
		return true;
	else
		return false;	
}

function alphanumeric(name) {
	var letters = /^[0-9a-zA-Z]+$/;
	if(name.match(letters))
		return true;
	else
		return false;	
	
}

function alphanumspecial(pass) {
	var letters = /^[0-9a-zA-Z@#$%&*()]+$/;
	if(pass.match(letters))
		return true;
	else
		return false;	
	
}
