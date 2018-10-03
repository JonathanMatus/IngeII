<%-- 
    Document   : Principal
    Created on : 05-sep-2018, 6:57:13
    Author     : patei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login|MHUW</title>

        <link href="https://fonts.googleapis.com/css?family=Sorts+Mill+Goudy" rel="stylesheet">
        <!--        bootstrap library-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <!-- Script's de sweet alert -->
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <!-- Script's de jquery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <!-- Script's  js -->
        <script src="../js/Api/sha512.min.js" type="text/javascript"></script>
        <script src="../js/Api/bcrypt.min.js" type="text/javascript"></script>
        <script src="../js/Login.js" type="text/javascript"></script>
        <script src="../js/verificarCampos.js" type="text/javascript"></script>
        <script src="../js/password.js" type="text/javascript"></script>
        <!-- Archivos css -->
        <link href="../css/prototipo.css" rel="stylesheet" type="text/css"/>
        <link href="../css/registro.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="container">
            <div id="header">
                <div id="banner">
                    <h1 class="logo-una"><a href="http://www.una.ac.cr" target="_blank" title="logo UNA"><img src="../templates/images/logo-una.png" alt="logoUNA"/></a></h1>
                    <h1 class="logo-ciemhcavi"><a href="http://www.peadep.una.ac.cr" target="_self" title="logo ciemhcavi"><img src="../templates/images/logo-ciemhcavi.png" alt="logociemhcavi"/></a></h1>
                    <h1 class="linea-gris"><img src="../templates/images/separador-gris.png" alt="sep-gris"/></h1>
                    <div><h1 class="nombre-entidad"> ESCUELA DE CIENCIAS DEL MOVIMIENTO HUMANO Y CALIDAD DE VIDA</h1></div>
                    <div><h1 class="abreviatura-entidad"> CIEMHCAVI</h1></div>
                </div> 
                <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Matricular</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Citas</a>
                        </li>

                    </ul>
                    <form class="navbar-form navbar-left" action="/action_page.php">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Buscar" name="buscar">
                            <div class="input-group-btn">
                                <button class="btn btn-default" type="submit">
                                    <i class="fas fa-search"></i>
                                </button>
                            </div>
                        </div>

                    </form>
                    <ul class="nav navbar-nav ml-auto">
                        <li><a class="nav-link" href="Registro.jsp"><span class="glyphicon glyphicon-user"></span> Registrarse</a></li>
                        <li><a class="nav-link" href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Entrar</a></li>
                    </ul>
                </nav>
            </div>
            <div id="body">
                <div class="row">
                    <div class="col-sm-12">
                        <form class="container" id="formLogin">

                            <h1 class="well" id="titulo">Login</h1>

                            <div class="row">
                                <div class="col-sm-4 form-group" id="groupUsuario">
                                    <label>Usuario</label>
                                    <input type="text" placeholder="" class="form-control" required="" id="usuarioLogin" maxlength="25">
                                    <small id="userHelpBlock" class="form-text text-muted">
                                    </small>
                                </div>
                                <div class="col-sm-4 form-group" id="groupPassword">
                                    <label >Contraseña</label>
                                    <div class="input-group" id="show_hide_password">
                                        <input type="password" placeholder="" class="form-control" id="passwordLogin" maxlength="30" minlength="8">
                                        <div class="input-group-addon" id="mostrarPassword">
                                            <a href="" ><i class="fa fa-eye-slash"  aria-hidden="true"></i></a>

                                        </div>
                                        <div id="passwordHelpBlock"><small id="passwordHelpBlock" class="form-text text-muted">
                                            </small></div>

                                    </div>

                                </div>




                            </div>
                            <div class="row">
                                <div class=" form-group col-sm-4">

                                    <button type="button" id="ingresar" class="btn btn-lg btn-info">Ingresar</button>
                                </div>
                            </div>

                        </form> 

                    </div>

                </div>
            </div>


            <div id="footer">
                <div class="row col-sm-12" >
                    <div class="col-sm-6"> 
                        <div class="copyright"  >
                            <p style="color: #ccc;">Copyright © 2018 Ciencia del Movimiento Humano y Calidad de Vida. Todos los derechos reservados.
                                <br />
                                <a style="color: #eee;" title="UNA" href="http://www.una.ac.cr" target="_blank">Universidad Nacional</a>.</p>
                        </div>
                    </div>
                    <div class="col-sm-6">              
                        <div class="contact"  >
                            <p style="color: #fff;"><strong>Información de Contacto:</strong></p>
                            <p style="color: #ccc;">Correo electrónico: <a title="corre de CIEMHCAVI" href="mailto:ciemhcavi@una.cr">ciemhcavi@una.cr</a> ,Telfs: 2261-0032 / 2237-5849</p></div>       
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
