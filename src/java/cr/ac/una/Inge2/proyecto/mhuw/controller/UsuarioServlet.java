/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.controller;

import cr.ac.una.Inge2.proyecto.mhuw.bl.impl.EstudianteBL;
import cr.ac.una.Inge2.proyecto.mhuw.bl.impl.UsuarioBL;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Estudiante;
import cr.ac.una.Inge2.proyecto.mhuw.domain.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author patei
 */
public class UsuarioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Usuario user = new Usuario();
            UsuarioBL ubl = new UsuarioBL();
            Estudiante clienteAux = new Estudiante();
            EstudianteBL cbl = new EstudianteBL();
            //Se hace una pausa para ver el modal
            Thread.sleep(1000);

            //**********************************************************************
            //se toman los datos de la session
            //**********************************************************************
            HttpSession session = request.getSession();

            //**********************************************************************
            //se consulta cual accion se desea realizar
            //**********************************************************************
            String accion = request.getParameter("accion");
            switch (accion) {

                case "ingresarUsuario":
                    //Se llena el objeto con los datos enviados por AJAX por el metodo post

                    clienteAux.setCedula(request.getParameter("cedula"));
                    clienteAux.setNombre(request.getParameter("nombre"));
                    clienteAux.setApellidos(request.getParameter("apellidos"));
                    clienteAux.setNacionalidad(request.getParameter("nacionalidad"));
                    user.setTipo(0);
                    user.setEstado(0);
                    user.setFechaCreacion(new Date());
                    user.setPasswordSha512(request.getParameter("sha512pass"));
                    user.setPasswordBcrypt(request.getParameter("hash"));
                    user.setUkEmail(request.getParameter("correo"));
                    user.setUsuario(request.getParameter("usuario"));
                    if (accion.equals("ingresarUsuario")) {
                        List<Usuario> list = ubl.findByQuery("FROM Usuario where UK_EMAIL='" + request.getParameter("correo") + "'");
                        if (ubl.findByNombreUsuario(request.getParameter("usuario")) == null) {
                            if (list.size() > 0) {
                                out.print("E~El correo ya esta registrado");
                            } else {
                                ubl.save(user);
                                Usuario cursor = ubl.findByNombreUsuario(request.getParameter("usuario"));
                                clienteAux.setUsuario(cursor);
                                cbl.save(clienteAux);
                                //Se imprime la respuesta con el response
                                out.print("C~El Usuario fue ingresado correctamente");
                            }
                        } else {
                            out.print("E~El nombre de usuario ya existe");
                        }

                    }

                    break;
                     case "login":
                        List<Usuario> lista=ubl.findByQuery("FROM Usuario where UK_EMAIL='"+request.getParameter("correo")+"'");
                        if (ubl.findByNombreUsuario(request.getParameter("usuario")) != null ) { //Si el usuario existe
                             if(ubl.findByClaveNombreUsuario(request.getParameter("usuario"), request.getParameter("clave"))!=null)
                             {     request.getSession(true);  
                                 out.print("C~ Correcto"); 
                               session.setAttribute("usuario", null); 
                                  session.setAttribute("loginStatus", "login"); 
                                  session.setAttribute("tipo", " "); }
                             else{    
                                 out.print("F~ error, el usuario o clave no existe"); }  }
                         else{
                              out.print("F~ error, el usuario no existe"); }
 
                    break;
                case "testPassword":
                    String sha512 = request.getParameter("sha512pass");
                    String hash = request.getParameter("hash");
                    if (BCrypt.checkpw(sha512, hash)) {
                        System.out.println("It matches");
                    } else {
                        System.out.println("It does not match");
                    }
                    break;
                default:
                    out.print("E~No se indico la acción que se desea realizare");
                    break;
            }

        } catch (NumberFormatException e) {
            out.print("E~" + e.getMessage());
        } catch (Exception e) {
            out.print("E~" + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}