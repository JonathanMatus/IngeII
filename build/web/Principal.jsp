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

        <link href="https://fonts.googleapis.com/css?family=Sorts+Mill+Goudy" rel="stylesheet">
        <!--        bootstrap library-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <link href="css/prototipo.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div id="container">
            <div id="header">
                <div>
                    <h1 class="logo-una"><a href="http://www.una.ac.cr" target="_blank" title="logo UNA"><img src="templates/images/logo-una.png" alt="logoUNA"/></a></h1>
                    <h1 class="logo-ciemhcavi"><a href="http://www.peadep.una.ac.cr" target="_self" title="logo ciemhcavi"><img src="templates/images/logo-ciemhcavi.png" alt="logociemhcavi"/></a></h1>
                    <h1 class="linea-gris"><img src="templates/images/separador-gris.png" alt="sep-gris"/></h1>
                    <div><h1 class="nombre-entidad"> ESCUELA DE CIENCIAS DEL MOVIMIENTO HUMANO Y CALIDAD DE VIDA</h1></div>

                </div> 

            </div>
            
            <div id="body">
                <form action="CorreoConfirmacion" method="post">
                    <input type="submit" value="Enviar">
                </form>
            </div>
            </form>

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
