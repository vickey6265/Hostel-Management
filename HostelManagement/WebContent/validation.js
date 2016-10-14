function formValidation() {
	var name=document.getElementById("rec_name");
	var phone=document.getElementById("rec_num");
	var mobile=document.getElementById("rec_email");
	var showfname=document.registration.showfname;
	var showlname=document.registration.showlname;
	var showmobile=document.registration.showmobile;
	
	var gob=false;
		if (allnumeric(fname)) {
			
				if (alphanumeric(lname)) {
					
					if(allnumericm(mobile)){
						gob=true;
						
					}
				}
			
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