/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validateEmail(correo) {

    var email = $("#" + correo);
    if (/^([^\x00-\x20\x22\x28\x29\x2c\x2e\x3a-\x3c\x3e\x40\x5b-\x5d\x7f-\xff]+|\x22([^\x0d\x22\x5c\x80-\xff]|\x5c[\x00-\x7f])*\x22)(\x2e([^\x00-\x20\x22\x28\x29\x2c\x2e\x3a-\x3c\x3e\x40\x5b-\x5d\x7f-\xff]+|\x22([^\x0d\x22\x5c\x80-\xff]|\x5c[\x00-\x7f])*\x22))*\x40([^\x00-\x20\x22\x28\x29\x2c\x2e\x3a-\x3c\x3e\x40\x5b-\x5d\x7f-\xff]+|\x5b([^\x0d\x5b-\x5d\x80-\xff]|\x5c[\x00-\x7f])*\x5d)(\x2e([^\x00-\x20\x22\x28\x29\x2c\x2e\x3a-\x3c\x3e\x40\x5b-\x5d\x7f-\xff]+|\x5b([^\x0d\x5b-\x5d\x80-\xff]|\x5c[\x00-\x7f])*\x5d))*$/.test(email.val())) {
        email.removeClass("is-invalid");
        email.addClass("is-valid");
        return true;
    } else {
        email.removeClass("is-valid");
        email.addClass("is-invalid");
        return false;
    }
}
function validatePassword(id)
{
    var password = $("#" + id);
    var regexp = /\s\w*/;
    if (regexp.test(password.val())) {
        password.removeClass("is-valid");
        password.addClass("is-invalid");
        return false;
    } else {
        if (/^\S*(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})/.test(password.val())) {
            password.removeClass("is-invalid");
            password.addClass("is-valid");
            return true;
        } else {
            password.removeClass("is-valid");
            password.addClass("is-invalid");
            return false;
        }
    }

}
function validateUser(id)
{
    var user = $("#" + id);
    var regexp = /\s\w*/;
    if (regexp.test(user.val())) {
        user.removeClass("is-valid");
        user.addClass("is-invalid");
        return false;
    } else {
        if (/(?=.{3,})/.test(user.val())) {
            user.removeClass("is-invalid");
            user.addClass("is-valid");
            return true;
        } else {
            user.removeClass("is-valid");
            user.addClass("is-invalid");
            return false;
        }
    }

}
function validateTelephone(id)
{
    var telephone = $("#" + id);
    var regexp = /\s\w*/;
    if (regexp.test(telephone.val())) {
        telephone.removeClass("is-valid");
        telephone.addClass("is-invalid");
        return false;
    } else {
        if (/(?=.*[0-9])(?=.{8,})/.test(telephone.val())) {
            telephone.removeClass("is-invalid");
            telephone.addClass("is-valid");
            return true;
        } else {
            telephone.removeClass("is-valid");
            telephone.addClass("is-invalid");
            return false;
        }
    }

}
function validateCedula(id)
{
    var cedula = $("#" + id);
    var regexp = /\s\w*/;
    if (regexp.test(cedula.val())) {
        cedula.removeClass("is-valid");
        cedula.addClass("is-invalid");
        return false;
    } else {
        if (/(?=.*[0-9])(?=.{9,})/.test(cedula.val())) {
            cedula.removeClass("is-invalid");
            cedula.addClass("is-valid");
            return true;
        } else {
            cedula.removeClass("is-valid");
            cedula.addClass("is-invalid");
            return false;
        }
    }

}
$(document).ready(function () {
    $("#show_hide_password a").on('click', function (event) {
        event.preventDefault();
        if ($('#show_hide_password input').attr("type") == "text") {
            $('#show_hide_password input').attr('type', 'password');
            $('#show_hide_password i').addClass("fa-eye-slash");
            $('#show_hide_password i').removeClass("fa-eye");
        } else if ($('#show_hide_password input').attr("type") == "password") {
            $('#show_hide_password input').attr('type', 'text');
            $('#show_hide_password i').removeClass("fa-eye-slash");
            $('#show_hide_password i').addClass("fa-eye");
        }
    });
});
