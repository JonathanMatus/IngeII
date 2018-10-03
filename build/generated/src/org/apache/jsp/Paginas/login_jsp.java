package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login|MHUW</title>\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Sorts+Mill+Goudy\" rel=\"stylesheet\">\n");
      out.write("        <!--        bootstrap library-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Script's de sweet alert -->\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <!-- Script's de jquery -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Script's  js -->\n");
      out.write("        <script src=\"../js/Api/sha512.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/Api/bcrypt.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/Login.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/verificarCampos.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!-- Archivos css -->\n");
      out.write("        <link href=\"../css/prototipo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/registro.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"banner\">\n");
      out.write("                    <h1 class=\"logo-una\"><a href=\"http://www.una.ac.cr\" target=\"_blank\" title=\"logo UNA\"><img src=\"../templates/images/logo-una.png\" alt=\"logoUNA\"/></a></h1>\n");
      out.write("                    <h1 class=\"logo-ciemhcavi\"><a href=\"http://www.peadep.una.ac.cr\" target=\"_self\" title=\"logo ciemhcavi\"><img src=\"../templates/images/logo-ciemhcavi.png\" alt=\"logociemhcavi\"/></a></h1>\n");
      out.write("                    <h1 class=\"linea-gris\"><img src=\"../templates/images/separador-gris.png\" alt=\"sep-gris\"/></h1>\n");
      out.write("                    <div><h1 class=\"nombre-entidad\"> ESCUELA DE CIENCIAS DEL MOVIMIENTO HUMANO Y CALIDAD DE VIDA</h1></div>\n");
      out.write("                    <div><h1 class=\"abreviatura-entidad\"> CIEMHCAVI</h1></div>\n");
      out.write("                </div> \n");
      out.write("                <nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Matricular</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Citas</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"navbar-form navbar-left\" action=\"/action_page.php\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Buscar\" name=\"buscar\">\n");
      out.write("                            <div class=\"input-group-btn\">\n");
      out.write("                                <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("                                    <i class=\"fas fa-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                        <li><a class=\"nav-link\" href=\"Registro.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Registrarse</a></li>\n");
      out.write("                        <li><a class=\"nav-link\" href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Entrar</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"body\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <form class=\"container\" id=\"formLogin\">\n");
      out.write("\n");
      out.write("                            <h1 class=\"well\" id=\"titulo\">Login</h1>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-4 form-group\" id=\"groupUsuario\">\n");
      out.write("                                    <label>Usuario</label>\n");
      out.write("                                    <input type=\"text\" placeholder=\"\" class=\"form-control\" required=\"\" id=\"usuarioLogin\" maxlength=\"25\">\n");
      out.write("                                    <small id=\"userHelpBlock\" class=\"form-text text-muted\">\n");
      out.write("                                    </small>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4 form-group\" id=\"groupPassword\">\n");
      out.write("                                    <label >Contraseña</label>\n");
      out.write("                                    <div class=\"input-group\" id=\"show_hide_password\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"\" class=\"form-control\" id=\"passwordLogin\" maxlength=\"30\" minlength=\"8\">\n");
      out.write("                                        <div class=\"input-group-addon\" id=\"mostrarPassword\">\n");
      out.write("                                            <a href=\"\" ><i class=\"fa fa-eye-slash\"  aria-hidden=\"true\"></i></a>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div id=\"passwordHelpBlock\"><small id=\"passwordHelpBlock\" class=\"form-text text-muted\">\n");
      out.write("                                            </small></div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\" form-group col-sm-4\">\n");
      out.write("\n");
      out.write("                                    <button type=\"button\" id=\"ingresar\" class=\"btn btn-lg btn-info\">Ingresar</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form> \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <div class=\"row col-sm-12\" >\n");
      out.write("                    <div class=\"col-sm-6\"> \n");
      out.write("                        <div class=\"copyright\"  >\n");
      out.write("                            <p style=\"color: #ccc;\">Copyright © 2018 Ciencia del Movimiento Humano y Calidad de Vida. Todos los derechos reservados.\n");
      out.write("                                <br />\n");
      out.write("                                <a style=\"color: #eee;\" title=\"UNA\" href=\"http://www.una.ac.cr\" target=\"_blank\">Universidad Nacional</a>.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6\">              \n");
      out.write("                        <div class=\"contact\"  >\n");
      out.write("                            <p style=\"color: #fff;\"><strong>Información de Contacto:</strong></p>\n");
      out.write("                            <p style=\"color: #ccc;\">Correo electrónico: <a title=\"corre de CIEMHCAVI\" href=\"mailto:ciemhcavi@una.cr\">ciemhcavi@una.cr</a> ,Telfs: 2261-0032 / 2237-5849</p></div>       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
