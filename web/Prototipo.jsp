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
        <title>Inicio|MHUW</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Sorts+Mill+Goudy" rel="stylesheet">
        <!--        bootstrap library-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/prototipo.css" rel="stylesheet" type="text/css"/>
        <link href="css/inicio.css" rel="stylesheet" type="text/css"/>
        <link href="css/principal.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div id="container">
            <div id="header">
                <div id="banner">
                    <h1 class="logo-una"><a href="http://www.una.ac.cr" target="_blank" title="logo UNA"><img src="templates/images/logo-una.png" alt="logoUNA"/></a></h1>
                    <h1 class="logo-ciemhcavi"><a href="http://www.peadep.una.ac.cr" target="_self" title="logo ciemhcavi"><img src="templates/images/logo-ciemhcavi.png" alt="logociemhcavi"/></a></h1>
                    <h1 class="linea-gris"><img src="templates/images/separador-gris.png" alt="sep-gris"/></h1>
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
                        <li><a class="nav-link" href="Paginas/Registro.jsp"><span class="glyphicon glyphicon-user"></span> Registrarse</a></li>
                        <li><a class="nav-link" href="#"><span class="glyphicon glyphicon-log-in"></span> Entrar</a></li>
                    </ul>
                </nav>
            </div>
            <div id="body">
                <div id="NavegacionSegundaria">
                    <h4>Articulos recientes</h4>

                </div>
                
                 <div id="myCarousel" class="carousel slide" data-ride="carousel">
                    <!-- Indicators--> 
                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                        <li data-target="#myCarousel" data-slide-to="3"></li>
                        <li data-target="#myCarousel" data-slide-to="4"></li>

                    </ol>

                    <!-- Wrapper for slides--> 
                    <div class="carousel-inner">
                        <div class="item active" data-toggle="modal" data-target="#add-modal">
                            <div id="articuloFormat">
                        <h6>Titulo Prueba</h6><span id="autor">Autor: A </span><span id="fecha">Fecha:16/09/2018</span>
                        <p>Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba
                            Datos de pruebaDatos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba
                            Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba...
                        </p>
                        <a href="#">Seguir Leyendo</a>
                    </div>
                        </div>

                        <div class="item" data-toggle="modal" data-target="#add-modal">
                            <div id="articuloFormat">
                        <h6>Titulo Prueba</h6><span id="autor">Autor: B </span><span id="fecha">Fecha:16/09/2018</span>
                        <p>Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba
                            Datos de pruebaDatos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba
                            Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba...
                        </p>
                        <a href="#">Seguir Leyendo</a>
                    </div>
                        </div>

                        <div class="item" data-toggle="modal" data-target="#add-modal">
                            <div id="articuloFormat">
                        <h6>Titulo Prueba</h6><span id="autor">Autor: C </span><span id="fecha">Fecha:16/09/2018</span>
                        <p>Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba
                            Datos de pruebaDatos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba
                            Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba...
                        </p>
                        <a href="#">Seguir Leyendo</a>
                    </div>
                        </div>

                        <div class="item" data-toggle="modal" data-target="#add-modal">
                            <div id="articuloFormat">
                        <h6>Titulo Prueba</h6><span id="autor">Autor: D </span><span id="fecha">Fecha:16/09/2018</span>
                        <p>Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba
                            Datos de pruebaDatos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba
                            Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba...
                        </p>
                        <a href="#">Seguir Leyendo</a>
                    </div>
                        </div>

                        <div class="item" data-toggle="modal" data-target="#add-modal">
                            <div id="articuloFormat">
                        <h6>Titulo Prueba</h6><span id="autor">Autor: E </span><span id="fecha">Fecha:16/09/2018</span>
                        <p>Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba
                            Datos de pruebaDatos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba
                            Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba Datos de prueba...
                        </p>
                        <a href="#">Seguir Leyendo</a>
                    </div>
                        </div>
                    </div>

                    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#myCarousel" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                        <span class="sr-only">Next</span>
                    </a>
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
