/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author IFCF303-2
 */
@WebServlet(urlPatterns = {"/Bienvenida"})

public class Bienvenida extends HttpServlet {

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

        String url = "jdbc:mysql://localhost:3306/despliegue";
        String role = "";
        String username = "";
        String password = "";
        String id = "";

        response.setContentType("text/html;charset=UTF-8");

        try ( PrintWriter out = response.getWriter()) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, "root", "");
                Statement statement = connection.createStatement();

                ResultSet set = statement.executeQuery("SELECT * FROM usuarios WHERE 1");
                PrintWriter salida = response.getWriter();

                salida.println("<html><head><title>Pagina de bienvenida</title></head>");
                salida.println("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />");

                salida.println("<body>");
                salida.println("<center><h2>Bienvenido-AJAX!!</h2></center>");

                salida.println("<div class=\"col-lg-7\">");
                salida.println("<h3>Usuarios</h3>");

                salida.println("<left><a href='index.html'class='btn btn-warning'>Volver</a></left>");
                salida.println("<a href='nuevo.jsp'class='btn btn-info'><h7>+</h7> Nuevo</a>");

                salida.println("<hr/>");
                salida.println("</div>");
                salida.println("<section class=\"col-lg-7 usuario\" style=\"height:400px;overflow-y:scroll;\">");

                while (set.next()) {

                    username = set.getString("username");
                    password = set.getString("password");
                    role = set.getString("role");
                    id = set.getString("id");

                    salida.println("<td><strong>ID</strong>:    " + id + "</td><br>");
                    salida.println("<td><strong>Usuario:</strong>   " + username + "</td></br>");
                    salida.println("<td><strong>Contraseña</strong> " + password + "</td></br>");
                    salida.println("<td><strong>Role:</strong>  " + role + "</td>");

                    salida.println("<div class=right>");

                    salida.println(" <a  id='btnDelCliente_" + id + "' class='btn btn-danger'>Borrar</a>");

                    salida.println("<script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script> \n"
                            + "<script>\n"
                            + "\n"
                            + "            $(document).ready(function () {\n"
                            + "\n"
                            + "\n"
                            + "\n"
                            + "                $(\"#btnDelCliente_" + id + "\").click(function () {\n"
                            + "                   //alert(\"estamos dentro\");\n"
                            + "                    let id = $(\"#id\").val();\n"
                            + "\n"
                            + "                    //alert(\"entro\");\n"
                            + "                    $.ajax({\n"
                            + "                        data: {id:" + id + "},\n"
                            + "                        url: 'borrar',\n"
                            + "\n"
                            + "                        type: 'POST',\n"
                            + "                        // dataType : 'html',\n"
                            + "\n"
                            + "                        enctype: 'multipart/form-data'\n"
                            + "                    })\n"
                            + "\n"
                            + "                            .done(function (data, textStatus, jqXHR) {\n"
                            + "                                //alert(data);\n"
                            + "                                    if(data==1){\n"
                            + "                                alert('Usuario eliminado correctamente');\n"
                            + "                                 location.href=\"Bienvenida\";\n"
                            + "                                 }else{\n"
                            + "                                 alert(\"No se ha podido eliminar el usuario\");\n"
                            + "                                 }\n"
                            + "\n"
                            + "                            })\n"
                            + "                            .fail(function (jqXHR, textStatus, errorThrown) {\n"
                            + "                                alert('Disculpe, existió un problema');\n"
                            + "                            });\n"
                            + "\n"
                            + "\n"
                            + "\n"
                            + "\n"
                            + "                });\n"
                            + "\n"
                            + "\n"
                            + "            });\n"
                            + "        </script>");

                    salida.println("<a href='editar.jsp?id=" + id + "&username=" + username + "&password=" + password + "&role=" + role + "' class='btn btn-info'>EditarJSP</a>");

                    //salida.println(" <a  href='Editar?id=" + id + "' class='btn btn-success'>Editar</a>");
                    salida.println("</div>");
                    salida.println("<hr/>");
                }
                /// salida.println("</table>");

                salida.println(" Tabla usuarios DAW2 2023");

                salida.println("</section>");

                salida.println("</body></html>");

                salida.close();

            } catch (SQLException e) {
                out.println(e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Nuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
            /* TODO output your page here. You may use following sample code. */

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
