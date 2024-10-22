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
        response.setContentType("text/html;charset=UTF-8");
        String url = "jdbc:mysql://localhost:3306/despliegue";
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        Boolean subido=false;
        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            //String sqlInsert = "INSERT INTO usuarios(username, password, role) VALUES (?,?,?)";
            //String sqlUpdate = "UPDATE usuarios SET username, password, role) WHERE id=(?)";
            String sql = "UPDATE usuarios SET username=?, password=?, role=? WHERE id=?";

            PreparedStatement prest = con.prepareStatement(sql);

            prest.setString(1, username);
            prest.setString(2, password);
            prest.setString(3, role);
            prest.setString(4, id);
           

            prest.executeUpdate();
            prest.close();
            con.close();
            subido=true;

        } catch (ClassNotFoundException c) {
            System.out.println("SQLException" + c);
        } catch (SQLException ex) {
            System.out.println("El error ha sido " + ex.getMessage());
        }

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        
            /*out.println("<p>id:  " + id + "</p>");
            out.println("<p>username:  " + username + "</p>");
            out.println("<p>role: " + role + "</p>");
            out.println("<p>password: " + password + "</p>");*/
           

            if (subido) {
                out.println("1");
                
            } else {
                out.println("0");
            }
            

               
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
