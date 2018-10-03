/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function () {
    $("#ingresar").click(function () {
        iniciarSesion();
    });
});


function iniciarSesion() {
    if (validarLogin()) {

        swal({
            title: "Espere por favor..",
            text: "Ingresando........",
            icon: "info",
            buttons: false
        });


        var pass = $("#passwordLogin").val();
        var sha512pass = sha512(pass);

        $.ajax({
            url: '../UsuarioServlet',
            data: {
                accion: "login",
                usuario: $("#usuarioLogin").val(),
                sha512pass: sha512pass
            },
            error: function () { //si existe un error en la respuesta del ajax
                swal("Error!", "Se genero un error, contacte al administrador (Error del ajax)", "error");
            },
            success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
                var respuestaTxt = data.substring(2);
                var tipoRespuesta = data.substring(0, 2);
                if (tipoRespuesta === "C~") {
                    swal("Ingresando...", respuestaTxt, "success");
                    //se redirecciona en JavaScript
                    setTimeout(function () {
                        window.location = "../Prototipo.jsp";
                    }, 2000);
                } else {       
                    if (tipoRespuesta === "E~") {
                        swal("Error!", respuestaTxt, "error");
                    } else {
                        swal("Error!", "Se genero un error, contacte al administrador", "error");
                    }
                }

            },
            type: 'POST'
        });
    } else {
        swal("Error!", "Debe digitar los datos del formulario", "error");
    }
}

function validarLogin() {
    var validacion = true;
    if ($("#usuarioLogin").val().length < 1) {
        validacion = false;
    }

    if ($("#passwordLogin").val().length < 1) {
        validacion = false;
    }


    return validacion;
}


function limpiarForm() {
//setea el focus del formulario
    $('#usuario').focus();
    $('#formUsuarios').trigger("reset");
}