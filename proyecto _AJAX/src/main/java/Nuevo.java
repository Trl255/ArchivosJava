/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author IFCF303-2
 */
public class Nuevo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        String url = "jdbc:mysql://localhost:3306/despliegue";
        String username = "";
        String password = "";
        String role = "";
        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;

        try ( PrintWriter out = response.getWriter()) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, "root", "");
                Statement statement = connection.createStatement();
                PrintWriter salida = response.getWriter();

                salida.println("<html><head><title>Alta usuario</title></head>");
                salida.println("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />"
                        + "<script\n"
                        + "  src=\"https://code.jquery.com/jquery-3.6.3.js\"\n"
                        + "  integrity=\"sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=\"\n"
                        + "  crossorigin=\"anonymous\"></script>");

                salida.println("<body>");
                salida.println("<center><h2>Nuevo usuario</h2></center>");

                salida.println("<div class=\"col-lg-7\">");
                salida.println("<h3>Usuarios /nuevo</h3>");

                salida.println("<hr/>");
                salida.println("</div>");

                salida.println("<section class=\"col-lg-7 usuario\" style=\"height:400px;overflow-y:scroll;\">");
                salida.println("<form id='formClienteNew' class='form-horizontal' action='#' method='post' enctype='multipart/form-data'>");

                salida.println("<div class='form-group'>");
                salida.println("<label for='nombre' class='col-sm-3 control-label'>Introduzca el nombre</label>");

                salida.println("<div class='col-sm-5'>");
                salida.println("<input type='text' class='form-control' id='username' name='username' placeholder='Nombre'>");
                salida.println("</div>");
                salida.println("</div>");

                salida.println("<div class='form-group'>");
                salida.println("<label for='password' class='col-sm-3 control-label'>Introduzca el password</label>");

                salida.println("<div class='col-sm-5'>");
                salida.println("<input type='text' class='form-control' id='password' name='password' placeholder='password'>");
                salida.println("</div>");
                salida.println("</div>");

                salida.println("<div class='form-group'>");
                salida.println("<label for='role' class='col-sm-3 control-label'>Introduzca el role</label>");
                salida.println("<div class='col-sm-5'>");
                salida.println("<input type='text' class='form-control' id='role' name='role' placeholder='role'>");
                salida.println("</div>");
                salida.println("</div>");

                salida.println("<div class='form-group'>");
                salida.println("<div class='col-sm-offset-3 col-sm-5'>");
                salida.println("<input type='button'  class='btn btn-success' id='btnNuevoCliente' value='Crear' />");

                salida.println("<input type='submit' value='Volver atras' id='cancelar' class='btn btn-danger' />");
                //salida.println( "<button type='button' class='btn btn-default' id='btnNuevoCliente'>Crear</button>");
                salida.println("</div>");
                salida.println("</div>");
                salida.println("</form>");

                salida.println("	    <script>\n"
                        + "    \n"
                        + "    $( document ).ready(function() {\n"
                        + "   \n"
                        + "       \n"
                        + "        \n"
                        + "        $(\"#btnNuevoCliente\").click(function(){\n"
                        + "            \n"
                        + "            let username=$(\"#username\").val();\n"
                        + "            let password=$(\"#password\").val();\n"
                        + "            let role=$(\"#role\").val();\n"
                        + "            \n"
                        + "           \n"
                        + "            \n"
                        + "            \n"
                        + "            \n"
                        + "            var formData=new FormData();\n"
                        + "            \n"
                        + "            formData.append(\"username\",username);\n"
                        + "            formData.append(\"password\",password);\n"
                        + "            formData.append(\"role\",role);\n"
                        + "            \n"
                        + "             \n"
             
                        + "            \n"
                        + "        \n"
                 
                        + "                $.ajax({\n"
                        + "                    data:formData,\n"
                        + "                    url : 'insertar',\n"
                        
                        + "                    \n"
                        + "                    type : 'POST',\n"
                        + "                   // dataType : 'html',\n"
                        + "                    contentType:false,\n"
                        + "                    cache:false,\n"
                        + "                    processData:false,\n"
                        + "                    enctype: 'multipart/form-data',\n"
                        + "                })\n"
               
                        + "                    .fail(function(jqXHR, textStatus,errorThrown) {\n"
                        + "                        alert('Disculpe, existió un problema');\n"
                        + "                    });\n"
                        + "\n"
                        + "                \n"
                        + "                \n"
                        + "\n"
                        + "        });\n"
                        + "        \n"
                        + "        \n"
                        + "    });\n"
                        + "    </script>");

                salida.println("</body></html>");

                salida.close();

            } catch (ClassNotFoundException c) {
                System.out.println("SQLException" + c);
            }

            con.close();

            System.out.println("conexion correcta");
        } catch (SQLException ex) {
            System.out.println("El error ha sido " + ex.getMessage());
        }
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("1");

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
        try {
            processRequest(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(Nuevo.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(Nuevo.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
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
