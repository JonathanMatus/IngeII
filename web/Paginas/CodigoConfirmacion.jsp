<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Activacion de Cuenta|MHUW</title>

        <link href="https://fonts.googleapis.com/css?family=Sorts+Mill+Goudy" rel="stylesheet">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

        <!--        bootstrap library-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <link href="../css/prototipo.css" rel="stylesheet" type="text/css"/>
        <link href="../css/correoConfirmacion.css" rel="stylesheet" type="text/css"/>

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
                <div id="NavegacionSegundaria">
                    <h4>Cuenta Activada</h4>
                    <div class="row" >
                        <div class="col-sm-2" id="paginacionNav1"> <a href="../Principal.jsp">Página principal</a></div>
                        <div class="col-sm-3" id="paginacionNav1"> <h6>/ Activación de Cuenta</h6></div>

                    </div>
                </div>
                <div id="contenido">


                    <div id="mensaje">
                        <div id="msjCuenta">
                            <label id="msjCuenta1">Tu cuenta ha sido activada</label><br><br>
                        </div>
                        <span id="msjCuenta1">Tu cuenta ha sido activada correctamente. Ahora podras 

                            <a href="login.jsp">acceder </a>
                            con el nombre de
                            <br> usuario y contraseñas provistas en el formulario de registro
                        </span>
                    </div>
                    <br><br>
                    <button type="button" id="regresar" class="btn-success btn">Regresar</button> 
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