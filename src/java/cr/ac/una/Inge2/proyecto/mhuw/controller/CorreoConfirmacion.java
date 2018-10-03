/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.Inge2.proyecto.mhuw.controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CorreoConfirmacion", urlPatterns = {"/CorreoConfirmacion"})
public class CorreoConfirmacion extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public static String aleatoria = "";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CorreoConfirmacion() {
        System.out.println("ENTRA");

        // TODO Auto-generated constructor stub
    }

    public String getCadenaAlfanumAleatoria(int longitud) {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud) {
            char c = (char) r.nextInt(255);
            //System.out.println("char:"+c);
            if ((c >= '0' && c <= 9) || (c >= 'A' && c <= 'Z')) {
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");
        switch (accion) {

            case "confirmar":
                if (request.getParameter("cod").equals("aabbb")) {
                    System.out.print("CuentaActivada");
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/CodigoConfirmacion.jsp");
                    rd.forward(request, response);
                }
                break;
            case "enviarCorreo":
                try {
                    // Propiedades de la conexión
                    Properties props = new Properties();
                    props.setProperty("mail.smtp.host", "smtp.gmail.com");
                    props.setProperty("mail.smtp.starttls.enable", "true");
                    props.setProperty("mail.smtp.port", "587");
                    props.setProperty("mail.smtp.user", "ingenieriasistemasg10@gmail.com");
                    props.setProperty("mail.smtp.auth", "true");

                    // Preparamos la sesion
                    Session session = Session.getDefaultInstance(props);

                    // Construimos el mensaje
                    MimeMessage message = new MimeMessage(session);
                    //la persona k tiene k verificar
                    message.setFrom(new InternetAddress("ingenieriasistemasg10@gmail.com"));
                    message.addRecipient(
                            Message.RecipientType.TO,
                            new InternetAddress("pateixo@gmail.com"));
                    message.addHeader("Disposition-Notification-To", "ingenieriasistemasg10@gmail.com");
                    message.setSubject("Correo de verificacion, por favor no responder");
                    message.setText(
                            "Para confirmar su cuenta"
                            + "Haga click en el siguiente link:\nhttp://localhost:8080/IngeII/CorreoConfirmacion?accion=confirmar&&cod=aabbb");

                    // Lo enviamos.
                    Transport t = session.getTransport("smtp");
                    t.connect("ingenieriasistemasg10@gmail.com", "INgenieria10");
                    t.sendMessage(message, message.getAllRecipients());

                    // Cierre.
                    t.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                out.print("E~No se indico la acción que se desea realizare");
                break;
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
    }// </editor-fold>n
}
