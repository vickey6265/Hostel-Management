function rector_validation() {
	var name = document.getElementById("rec_name");
	var phone = document.getElementById("rec_num");
	var email = document.getElementById("rec_email");
	var address = document.getElementById("rec_add");
	var pass = document.getElementById("rec_pass");
	var cpass = document.getElementById("rec_cpass");

	var showname = document.getElementById("rec_name_valid");
	var showaddress = document.getElementById("rec_address_valid");
	var showphone = document.getElementById("rec_cnum_valid");
	var showemail = document.getElementById("rec_email_valid");
	var showpass = document.getElementById("rec_pass_valid");
	var showcpass = document.getElementById("rec_cpass_valid");

	var gob = false;
	if (allalpha(name)) {
		if (alphanumeric(address)) {
			if (isMobile(phone)) {
				if (isEmail(email)) {
					if (alphanumspecial(pass)) {
						if (alphanumspecial(cpass)) {
							if (isSame(pass, cpass)) {
								got = true;
							}
						} else {
							showcpass.innerHTML = "Enter confirm password ";
							cpass.focus();
							gob = false;
						}
					} else {
						showpass.innerHTML = "Enter Password Here ";
						pass.focus();
						gob = false;
					}

				} else {
					showemail.innerHTML = "Enter correct email ";
					email.focus();
					gob = false;
				}

			} else {
				showphone.innerHTML = "Mobile Number must be numbers only ";
				phone.focus();
				gob = false;
			}
		} else {
			showaddress.innerHTML = "Write Proper Address ";
			address.focus();
			gob = false;
		}
	} else {
		showname.innerHTML = "Name must be Alphabatic value ";
		name.focus();
		gob = false;
	}

	return gob;

}
function allalphabate(allalp) {
	var letters = /^[a-zA-Z]+$/;
}

function allnumeric(fname) {
	var numbers = /^[0-9]+$/;
	var flag = false;
	if (fname.value.length == 10) {
		flag = true;
		showfname.innerHTML = " ";
		if (fname.value.match(numbers)) {
			flag = true;
			showfname.innerHTML = " ";
		} else {
			showfname.innerHTML = "first Name must have numeric value ";
			fname.focus();
			flag = false;
		}
	} else {
		showfname.innerHTML = "first Name must have 10 numeric value ";
		fname.focus();
		flag = false;
	}

	return flag;
}
function allnumericm(mobile) {
	var numbers = /^[0-9]+$/;
	var flag = false;
	if (mobile.value.length == 10) {
		flag = true;
		showmobile.innerHTML = " ";

		if (mobile.value.match(numbers)) {
			flag = true;
			showmobile.innerHTML = " ";
		} else {
			// alert('Mobile No must have numeric characters only');
			showmobile.innerHTML = "Mobile No. must have numeric value ";
			mobile.focus();
			flag = false;
		}
	} else {
		// alert('Mobile No must have 10 numeric characters only');
		showmobile.innerHTML = "Mobile No. must have 10 numeric value ";
		mobile.focus();
		flag = false;
	}

	return flag;
}

function alphanumeric(lname) {
	var letters = /^[0-9a-zA-Z]+$/;
	var flag = false;
	if (lname.value.length == 12) {
		flag = true;
		showlname.innerHTML = " ";

		if (lname.value.match(letters)) {
			flag = true;
			showlname.innerHTML = " ";
		} else {
			// alert('Last Name must have alphanumeric characters only');
			showlname.innerHTML = "Last Name must have alphanumeric characters only ";
			lname.focus();
			flag = false;
		}
	} else {
		// alert('Last Name must have 12 alphanumeric characters only');
		showlname.innerHTML = "Last Name must have 12 alphanumeric characters only ";
		lname.focus();
		flag = false;
	}

	return flag;
}

function allnumeric(fname) {
	var numbers = /^[0-9]+$/;

	if (fname.match(numbers))
		return true;
	else
		return false;
}

function allalpha(alpha) {
	var letters = /^[a-zA-Z]+$/;
	if (alpha.match(letters))
		return true;
	else
		return false;
}

function alphanumeric(name) {
	var letters = /^[0-9a-zA-Z]+$/;
	if (name.match(letters))
		return true;
	else
		return false;

}

function alphanumspecial(pass) {
	var letters = /^[0-9a-zA-Z!^@#$%&*()]+$/;
	if (pass.match(letters))
		return true;
	else
		return false;

}

function isSame(pass, cpass) {
	if (pass.equals(cpass)) {
		return true;
	} else {
		return false;
	}

}

function isMobile(phone) {
	var numbers = /^[0-9]+$/;
	if (phone.length == 10) {
		if (fname.match(numbers)) {
			return true;
		} else {
			return false;
		}
	} else {
		return false;
	}
}

/*------------ Rector New Function ----------------*/
function testRector(form_rec_registration) {
	console.log("validation check");
	var name = form_rec_registration.rec_name.value;
	console.log(name);
	var email = form_rec_registration.rec_email.value;
	var dob = form_rec_registration.rec_dob.value;
	var address = form_rec_registration.rec_add.value;
	var phone = form_rec_registration.rec_num.value;
	var password = form_rec_registration.rec_pass.value;
	var photo = form_rec_registration.rec_photo.value;
	var cpassword = form_rec_registration.rec_cpass.value;

	var nameRegex = /^[a-zA-Z]+(([\'\,\.\- ][a-zA-Z ])?[a-zA-Z]*)*$/;
	var emailRegex = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;
	var messageRegex = new RegExp(
			/<\/?\w+((\s+\w+(\s*=\s*(?:".*?"|'.*?'|[^'">\s]+))?)+\s*|\s*)\/?>/gim);
	var phoneRegex = /^[0-9]+$/;
	var passwordRegex = /^[0-9a-zA-Z!^@#$%&*()]+$/;

	/*------- Name ----------*/
	if (name == "") {
		inlineMsg('rec_name', 'You must enter name.', 4);
		return false;
	}
	if (!name.match(nameRegex)) {
		inlineMsg('rec_name', 'You have entered an invalid name.', 4);
		return false;
	}

	/*------- DOB ----------*/
	if (dob == "") {
		inlineMsg('rec_dob', 'You must enter Birthdate.', 4);
		return false;
	}

	/*------- Address ----------*/
	if (address == "") {
		inlineMsg('rec_add', 'You must enter Address.', 4);
		return false;
	}
	if (address.match(messageRegex)) {
		inlineMsg('rec_add', 'You have entered an invalid message.',4);
		return false;
	}

	/*------- Contact number ----------*/

	if (phone == "") {
		inlineMsg('rec_num', 'You must enter Contact Number.', 4);
		return false;
	}
	if (phone.length != 10) {
		inlineMsg('rec_num', 'You must enter valid Contact Number.', 4);
		return false;
	}
	if (!phone.match(phoneRegex)) {
		inlineMsg('rec_num', 'You have entered an invalid contact number.', 4);
		return false;
	}

	/*------- Email ----------*/
	if (email == "") {
		inlineMsg('rec_email', 'You must enter your email.', 4);
		return false;
	}
	if (!email.match(emailRegex)) {
		inlineMsg('rec_email', 'You have entered an invalid email.', 4);
		return false;
	}

	/*------- Password ----------*/
	if (password == "") {
		inlineMsg('rec_pass', 'You must enter Password.', 4);
		return false;
	}
	if (password.length <= 6) {
		inlineMsg('rec_pass', 'Password length must be 6 to 25 character.', 4);
		return false;
	}
	if (!password.match(passwordRegex)) {
		inlineMsg('rec_pass', 'You have entered an invalid password.', 4);
		return false;
	}
	if (cpassword == "") {
		inlineMsg('rec_cpass', 'You must enter Password.', 4);
		return false;
	}
	if (cpassword.length <= 6) {
		inlineMsg('rec_cpass', 'Password length must be 6 to 25 character.', 4);
		return false;
	}
	if (!cpassword.match(passwordRegex)) {
		inlineMsg('rec_cpass', 'You have entered an invalid password.', 4);
		return false;
	}
	if (password != cpassword) {
		inlineMsg('rec_cpass', 'Password does not match.', 4);
		return false;
	}
	return true;
}

//START OF MESSAGE SCRIPT //

var MSGTIMER = 20;
var MSGSPEED = 5;
var MSGOFFSET = 3;
var MSGHIDE = 3;

/*--------------------------- Inline Function Message----------------------*/
function inlineMsg(target, string, autohide) {
	console.log(target);/*Output = "name" */
	var msg;
	var msgcontent;
	if (!document.getElementById('msg')) {
		msg = document.createElement('div');
		msg.id = 'msg';
		msgcontent = document.createElement('div');
		msgcontent.id = 'msgcontent';
		document.body.appendChild(msg);
		msg.appendChild(msgcontent);
		msg.style.filter = 'alpha(opacity=0)';
		msg.style.opacity = 0;
		msg.alpha = 0;
	} else {
		msg = document.getElementById('msg');
		msgcontent = document.getElementById('msgcontent');
	}
	msgcontent.innerHTML = string;
	msg.style.display = 'block';
	var msgheight = msg.offsetHeight;
	var targetdiv = document.getElementById(target);
	console.log(targetdiv);/*output = "null" */
	targetdiv.focus();
	var targetheight = targetdiv.offsetHeight;
	var targetwidth = targetdiv.offsetWidth;
	var topposition = topPosition(targetdiv) - ((msgheight - targetheight) / 2);
	var leftposition = leftPosition(targetdiv) + targetwidth + MSGOFFSET;
	msg.style.top = topposition + 'px';
	msg.style.left = leftposition + 'px';
	clearInterval(msg.timer);
	msg.timer = setInterval("fadeMsg(1)", MSGTIMER);
	if (!autohide) {
		autohide = MSGHIDE;
	}
	window.setTimeout("hideMsg()", (autohide * 1000));
}

// ---------------------hide the form alert---------------------- //
function hideMsg(msg) {
	var msg = document.getElementById('msg');
	if (!msg.timer) {
		msg.timer = setInterval("fadeMsg(0)", MSGTIMER);
	}
}

// ------------------- face the message box ----------------------//
function fadeMsg(flag) {
	if (flag == null) {
		flag = 1;
	}
	var msg = document.getElementById('msg');
	var value;
	if (flag == 1) {
		value = msg.alpha + MSGSPEED;
	} else {
		value = msg.alpha - MSGSPEED;
	}
	msg.alpha = value;
	msg.style.opacity = (value / 100);
	msg.style.filter = 'alpha(opacity=' + value + ')';
	if (value >= 99) {
		clearInterval(msg.timer);
		msg.timer = null;
	} else if (value <= 1) {
		msg.style.display = "none";
		clearInterval(msg.timer);
	}
}

// calculate the position of the element in relation to the left of the browser
// //
function leftPosition(target) {
	var left = 0;
	if (target.offsetParent) {
		while (1) {
			left += target.offsetLeft;
			if (!target.offsetParent) {
				break;
			}
			target = target.offsetParent;
		}
	} else if (target.x) {
		left += target.x;
	}
	return left;
}

// calculate the position of the element in relation to the top of the browser
// window //
function topPosition(target) {
	var top = 0;
	if (target.offsetParent) {
		while (1) {
			top += target.offsetTop;
			if (!target.offsetParent) {
				break;
			}
			target = target.offsetParent;
		}
	} else if (target.y) {
		top += target.y;
	}
	return top;
}
