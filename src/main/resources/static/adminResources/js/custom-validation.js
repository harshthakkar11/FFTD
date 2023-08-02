
var regex = /^([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

/** ************** Login ******************** */
function validateLoginForm() {
	console.log("+++");
	if ($('#user').val().trim() === '') {
		$('#userErrMsg').html('Please Enter User Name');
		$('#passErrMsg').html('');
		return false;
	} else if (!regex.test($('#user').val().trim())) {
		$('#userErrMsg').html('Please Enter valid User Name');
		$('#passErrMsg').html('');
		return false;
	} else if ($('#passWord').val().trim() === '') {
		$('#userErrMsg').html('');
		$('#passErrMsg').html('Please Enter correct Password');
		return false;
	} else {
		return true;
	}
}

/** ************** Registration ******************** */

function validateRegistrationForm() {

	if ($('#fname').val().trim() === '') {
		$('#firstNameErrMsg').html('Please Enter First Name');
		$('#lastNameErrMsg').html('');
		$('#userNameErrMsg').html('');
		$('#passwordErrMsg').html('');
		return false;
	} else if ($('#lname').val().trim() === '') {
		$('#firstNameErrMsg').html('');
		$('#lastNameErrMsg').html('Please Enter Last Name');
		$('#userNameErrMsg').html('');
		$('#passwordErrMsg').html('');
		return false;
	} else if ($('#uname').val().trim() === '') {
		$('#lastNameErrMsg').html('');
		$('#userNameErrMsg').html('Please Enter User Name');
		$('#firstNameErrMsg').html('');
		$('#passwordErrMsg').html('');
		return false;
	} else if (!regex.test($('#uname').val().trim())) {
		$('#lastNameErrMsg').html('');
		$('#userNameErrMsg').html('Please Enter valid User Name');
		$('#firstNameErrMsg').html('');
		$('#passwordErrMsg').html('');
		return false;
	} else if ($('#pass').val().trim() === '') {
		$('#userNameErrMsg').html('');
		$('#passwordErrMsg').html('Please Enter Password');
		$('#firstNameErrMsg').html('');
		$('#lastNameErrMsg').html('');
		return false;
	} else {
		return true;
	}
}