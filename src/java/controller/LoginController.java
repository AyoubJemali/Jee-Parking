
package controller;

import beans.Login;
import beans.Section;
import com.google.gson.Gson;
import connexion.Connexion;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.LoginService;

/**
 *
 * @author Imane
 */
@WebServlet(urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    private LoginService ss = new LoginService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("op") != null) {
            System.out.println("bien ");
            if (request.getParameter("op").equals("log")) {
                // Login l=new Login();
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                // l=ss.findAlls(username, password);
                LoginService lgs = new LoginService();
                Login login = lgs.Login(username, password);

                System.out.print(login);
                if (login != null) {
                    String msg = "1";
                    response.setContentType("application/json");
                    Gson json = new Gson();
                    response.getWriter().write(json.toJson(msg));
                }

            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
    }
}
