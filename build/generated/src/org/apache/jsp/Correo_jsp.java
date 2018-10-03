package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Correo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Correo|MHUW</title>\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Sorts+Mill+Goudy\" rel=\"stylesheet\">\n");
      out.write("        <!--        bootstrap library-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"css/prototipo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div>\n");
      out.write("                    <h1 class=\"logo-una\"><a href=\"http://www.una.ac.cr\" target=\"_blank\" title=\"logo UNA\"><img src=\"templates/images/logo-una.png\" alt=\"logoUNA\"/></a></h1>\n");
      out.write("                    <h1 class=\"logo-ciemhcavi\"><a href=\"http://www.peadep.una.ac.cr\" target=\"_self\" title=\"logo ciemhcavi\"><img src=\"templates/images/logo-ciemhcavi.png\" alt=\"logociemhcavi\"/></a></h1>\n");
      out.write("                    <h1 class=\"linea-gris\"><img src=\"templates/images/separador-gris.png\" alt=\"sep-gris\"/></h1>\n");
      out.write("                    <div><h1 class=\"nombre-entidad\"> ESCUELA DE CIENCIAS DEL MOVIMIENTO HUMANO Y CALIDAD DE VIDA</h1></div>\n");
      out.write("\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"body\">\n");
      out.write("                <h1>Correo</h1>\n");
      out.write("                <hr color=\"black\" size=\"3\">\n");
      out.write("                <label class=\"control-label col-sm-3\">E-mail:</label>\n");
      out.write("                <input type=\"text\" name=\"correo\" placeholder=\"'abc@mail.com'\" required>\n");
      out.write("                <br>\n");
      out.write("                <textarea name=\"comentarios\" rows=\"15\" cols=\"60\" maxlength=\"1500\" required></textarea>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"button\" value=\"Enviar\" style=\"position: absolute; left: 460px; width:90px\">\n");
      out.write("            </div>\n");
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
      out.write("</html>");
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
