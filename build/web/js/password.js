/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function test() {
    var bcrypt = dcodeIO.bcrypt;
    var pass = "contraseña";
    var sha512pass = sha512(pass);
    bcrypt.genSalt(10, function (err, salt) {
        bcrypt.hash(sha512pass, salt, function (err, hash) {
            $.ajax({
                url: 'UsuarioServlet',
                data: {
                    accion: "testPassword",
                    sha512pass: sha512pass,
                    hash: hash
                },
                error: function () { //si existe un error en la respuesta del ajax
                   alert("Error!", "Se genero un error, contacte al administrador (Error del ajax)", "error");
                },
                success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data

                },
                type: 'POST'
            });
        });

    });
}
;