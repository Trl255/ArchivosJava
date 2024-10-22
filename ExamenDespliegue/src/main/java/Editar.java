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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author IFCF303-2
 */
public class Editar extends HttpServlet {

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
        String url = "jdbc:mysql://localhost:3307/despliegue";
        String role = "";
        String username = "";
        String password = "";
        String id = request.getParameter("id");

        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;
        response.setContentType("text/html;charset=UTF-8");

        try ( PrintWriter out = response.getWriter()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, "root", "");
                Statement statement = connection.createStatement();

                ResultSet set = statement.executeQuery("SELECT * FROM usuarios WHERE id=" + id + "");
                PrintWriter salida = response.getWriter();

                salida.println("<html><head><title>Editar usuario</title></head>");
                salida.println("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />");

                salida.println("<body>");
                salida.println("<center><h2>Editar usuario</h2></center>");
                //salida.println("<h2>El id es: " + id + "</h2>");

                while (set.next()) {

                    username = set.getString("username");
                    password = set.getString("password");
                    role = set.getString("role");
                    id = set.getString("id");

                }
                salida.println("<div class=\"col-lg-7\">");
                salida.println("<h3>Usuarios /editar</h3>");
                salida.println(" <form  action='Editar'>");
                salida.println(" <input type='submit'  value='Editar'  class=btn btn-success>");
                salida.println(" </form>");
                salida.println("<hr/>");
                salida.println("</div>");

                salida.println("<section class=\"col-lg-7 usuario\" style=\"height:400px;overflow-y:scroll;\">");
                salida.println("<form id='' class='form-horizontal' action='Update' method='post'>");

                //       <input type="hidden" name="id" class="form-control" value="<?php echo $role->id ?>" />
                //           Nombre: <input type="text" name="nombre" class="form-control" value="<?php echo $role->nombre ?>"
                salida.println("<div class='form-group'>");
                salida.println("<label for='id' class='col-sm-3 control-label' value='id'></label>");

                salida.println("<div class='col-sm-5'>");
                salida.println("<input type='hidden' class='form-control' id='id' name='id' value=" + id + ">");
                salida.println("</div>");
                salida.println("</div>");

                salida.println("<div class='form-group'>");
                salida.println("<label for='nombre' class='col-sm-3 control-label' value='username'>Nombre</label>");

                salida.println("<div class='col-sm-5'>");
                salida.println("<input type='text' class='form-control' id='username' name='username' value=" + username + ">");
                salida.println("</div>");
                salida.println("</div>");

                salida.println("<div class='form-group'>");
                salida.println("<label for='password' class='col-sm-3 control-label' value='password'>Contraseña</label>");

                salida.println("<div class='col-sm-5'>");
                salida.println("<input type='text' class='form-control' id='password' name='password' value=" + password + ">");
                salida.println("</div>");
                salida.println("</div>");

                salida.println("<div class='form-group'>");
                salida.println("<label for='password' class='col-sm-3 control-label' value='role'>Role</label>");

                salida.println("<div class='col-sm-5'>");
                salida.println("<input type='text' class='form-control' id='role' name='role' value=" + role + ">");
                salida.println("</div>");
                salida.println("</div>");

                salida.println("<div class='form-group'>");
                salida.println("<div class='col-sm-offset-3 col-sm-5'>");
                salida.println("<input  id='#' type='submit'  class='btn btn-success' value='Aceptar' href=''url('roles', 'roles')>");

                salida.println("<input type='submit' value='Volver atras' id='cancelar' class='btn btn-danger' />");
                salida.println("</div>");
                salida.println("</div>");
                salida.println("</form>");

                salida.println(" Tabla usuarios DAW2 2023");
                salida.println(" <form  action='Bienvenida'>");
                salida.println(" </br>");
                salida.println(" <input type='submit'  value='Atras'  class=btn btn-success>");
                salida.println(" </form>");
                salida.println("</section>");
                salida.println("</body></html>");

                salida.close();

            } catch (ClassNotFoundException c) {
                System.out.println("SQLException" + c);
            }

            if (stmt.execute("SELECT * FROM usuario")) {

                rs = stmt.getResultSet();
                while (rs.next()) {

                }

            }

            String sqlUpdate = "UPDATE usuarios SET username=(username, password, role ) WHERE id=(?)";

            PreparedStatement prepredStmt = con.prepareStatement(sqlUpdate);

            prepredStmt.execute();
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
