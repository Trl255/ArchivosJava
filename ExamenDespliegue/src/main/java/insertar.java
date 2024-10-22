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
public class insertar extends HttpServlet {

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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;
        boolean subido = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            String sqlInsert = "INSERT INTO usuarios(username, password, role) VALUES (?,?,?)";

            if (username == ""|| role=="") {
                sqlInsert = "";
            } else {

            }
            PreparedStatement prepredStmt = con.prepareStatement(sqlInsert);
            prepredStmt.setString(3, role);
            prepredStmt.setString(1, username);
            prepredStmt.setString(2, password);

            prepredStmt.executeUpdate();
            prepredStmt.close();
            con.close();

        } catch (ClassNotFoundException c) {
            System.out.println("SQLException" + c);
        } catch (SQLException ex) {
            System.out.println("El error ha sido " + ex.getMessage());
        }

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet insertar</title>");
            out.println("</head>");
            out.println("<body>");
if (username == ""|| role==""){
            out.println("<h1>NO SE HA PODIDO INGRESAR EL USUARIO</h1>");
}       else{  
    out.println("<h1>USUARIO INTRODUCIDO A LA BASE DE DATOS</h1>");
}
            out.println("<p>" + username + "</p>");
            out.println("<p>" + role + "</p>");
            out.println("<p>" + password + "</p>");

            out.println("<h1><A href='Bienvenida'>VOLVER</A> </h1>");
            out.println("</body>");
            out.println("</html>");
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
