//Use a declaration to the IDs for text boxes email/pass
//var x = document.getElementById("myText"); example <--
//Reference guides: https://www.w3schools.com/howto/howto_css_register_form.asp
// This javascript file will be used for the registration form
//we can also do a copy/paste with different IDs for login form

function input()
{
    var email = document.getElementById('email');
    var password = document.getElementById('pwd');
    var confirmPassword = document.getElementById('confirm-pwd');

    return email, password, confirmPassword;
}