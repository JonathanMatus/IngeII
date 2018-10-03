/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {

    $("#registrar").click(function () {
        enviar();
    });

    $("#ingresar").click(function () {
        ingresar();
    });
});
function ingresar() {
//    if (validar()) {
//Se envia la información por ajax
        swal({
            title: "Espere por favor..",
            text: "Ingresando la información del usuario en la base de datos",
            icon: "info",
            buttons: false
        });
//        var bcrypt = dcodeIO.bcrypt;
//        var pass = $("#password").val();
//        var sha512pass = sha512(pass);
//        bcrypt.genSalt(10, function (err, salt) {
//            bcrypt.hash(sha512pass, salt, function (err, hash) {
//                $.ajax({
//                    url: '../UsuarioServlet',
//                    data: {
//                        accion: "ingresarUsuario",
//                        usuario: $("#usuario").val(),
//                        cedula: $("#cedula").val(),
//                        nombre: $("#nombre").val(),
//                        telefono: $("#telefono").val(),
//                        apellidos: $("#apellidos").val(),
//                        nacionalidad: $( "#nacionalidad option:selected" ).text(),
//                        correo: $("#correo").val(),
//                        sha512pass:sha512pass,
//                        hash:hash
//                    },
//                    error: function () { //si existe un error en la respuesta del ajax
//                        swal("Error!", "Se genero un error, contacte al administrador (Error del ajax)", "error");
//                    },
//                    success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
//                        var respuestaTxt = data.substring(2);
//                        var tipoRespuesta = data.substring(0, 2);
//                        if (tipoRespuesta === "C~") {
//                            swal("Correcto!", respuestaTxt, "success");
//                        } else {
//                            if (tipoRespuesta === "E~") {
//                                swal("Error!", respuestaTxt, "error");
//                            } else {
//                                swal("Error!", "Se genero un error, contacte al administrador", "error");
//                            }
//                        }
//
//                    },
//                    type: 'POST'
//                });
//            });
//
//        });
        swal("Correcto!", "Ha ingresado correctamente al sistema", "success");
//    } else {
//        swal("Error!", "Debe digitar los datos del formulario", "error");
//    }
}
function enviar() {
    if (validar()) {
//Se envia la información por ajax
        swal({
            title: "Espere por favor..",
            text: "Ingresando la información del usuario en la base de datos",
            icon: "info",
            buttons: false
        });
        var bcrypt = dcodeIO.bcrypt;
        var pass = $("#password").val();
        var sha512pass = sha512(pass);
        bcrypt.genSalt(10, function (err, salt) {
            bcrypt.hash(sha512pass, salt, function (err, hash) {
                $.ajax({
                    url: '../UsuarioServlet',
                    data: {
                        accion: "ingresarUsuario",
                        usuario: $("#usuario").val(),
                        cedula: $("#cedula").val(),
                        nombre: $("#nombre").val(),
                        telefono: $("#celular").val(),
                        apellidos: $("#apellidos").val(),
                        nacionalidad: $("#nacionalidad option:selected").text(),
                        correo: $("#correo").val(),
                        sha512pass: sha512pass,
                        hash: hash
                    },
                    error: function () { //si existe un error en la respuesta del ajax
                        swal("Error!", "Se genero un error, contacte al administrador (Error del ajax)", "error");
                    },
                    success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
                        var respuestaTxt = data.substring(2);
                        var tipoRespuesta = data.substring(0, 2);
                        if (tipoRespuesta === "C~") {
                            swal("Correcto!", respuestaTxt, "success");
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
            });

        });

    } else {
        swal("Error!", "Debe digitar los datos del formulario", "error");
    }
}

function validar() {
    var validacion = true;
    if (!validateUser("usuario")) {
        $("#userHelpBlock").show();
        validacion = false;
    } else {
        $("#userHelpBlock").hide();

    }

    if (!validatePassword("password")) {
        $("#passwordHelpBlock").show();
        validacion = false;
    } else {
        $("#passwordHelpBlock").hide();
    }
    if (!validateCedula("cedula")) {
        $("#cedulaHelpBlock").show();
        validacion = false;
    } else {
        $("#cedulaHelpBlock").hide();
    }
    if ($("#nombre").val() === "") {
        $("#nombre").removeClass("is-valid");
        $("#nombre").addClass("is-invalid");
        validacion = false;
    } else {
        $("#nombre").removeClass("is-invalid");
        $("#nombre").addClass("is-valid");

    }
    if ($("#apellidos").val() === "") {
        $("#apellidos").removeClass("is-valid");
        $("#apellidos").addClass("is-invalid");
        validacion = false;
    } else {
        $("#apellidos").removeClass("is-invalid");
        $("#apellidos").addClass("is-valid");

    }
    if (!validateTelephone("celular")) {
        $("#telefonoHelpBlock").show();

        validacion = false;
    } else {
        $("#telefonoHelpBlock").hide();
    }

    if (validateEmail("correo") === true) {
        $("#emailHelpBlock").hide();
    } else {
        $("#emailHelpBlock").show();
        validacion = false;
    }
    return validacion;
}


function limpiarForm() {
//setea el focus del formulario
    $('#cedula').focus();
    $('#formUsuario').trigger("reset");
}