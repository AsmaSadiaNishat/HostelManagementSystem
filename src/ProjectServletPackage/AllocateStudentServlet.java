package ProjectServletPackage;

import ConnectionPackage.Jdbc_connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "AllocateStudentServlet", urlPatterns = "/allocating")
public class AllocateStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter w = response.getWriter();

        Connection c = Jdbc_connection.connectionMethod();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql;


        try {

            sql = "UPDATE ROOM SET STATUS='Filled', STUDENT_NAME= '" +request.getParameter("student")+"'"
            +" WHERE SEAT_NO=" +request.getParameter("seat");

            ps = c.prepareStatement(sql);
            ps.executeUpdate();

            w.println("<html>\n" +
                    "<head>\n" +
                    "  <style>\n" +
                    "    body{\n" +
                    "      margin: 0;\n" +
                    "      background-color:orange;\n" +
                    "    }\n" +
                    "    .header{\n" +
                    "\n" +
                    "      width: 1500px;\n" +
                    "      height: 120px;\n" +
                    "      margin: auto;\n" +
                    "    }\n" +
                    "    .nav{\n" +
                    "      width: 1500px;\n" +
                    "      background-color: purple;\n" +
                    "      margin: auto;\n" +
                    "      overflow: auto;\n" +
                    "    }\n" +
                    "    ul{\n" +
                    "      margin: 0;\n" +
                    "      padding: 0;\n" +
                    "      list-style: none;\n" +
                    "    }\n" +
                    "    li{\n" +
                    "      float: left;\n" +
                    "\n" +
                    "    }\n" +
                    "    a:link{\n" +
                    "      color: goldenrod;\n" +
                    "      width: 125px;\n" +
                    "      text-decoration: none;\n" +
                    "      display: block;\n" +
                    "      text-align: center;\n" +
                    "      padding: 15px;\n" +
                    "      text-transform: uppercase;\n" +
                    "      font-size: 18px;\n" +
                    "      font-family: Verdana;\n" +
                    "\n" +
                    "    }\n" +
                    "    a:hover{\n" +
                    "      background-color: black;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "  </style>\n" +
                    "\n" +
                    "  <style>\n" +
                    "    body{\n" +
                    "      margin: 0;\n" +
                    "      background-color: chartreuse;\n" +
                    "    }\n" +
                    "    .footer{\n" +
                    "\n" +
                    "      width: 1500px;\n" +
                    "      height: 120px;\n" +
                    "      margin: auto;\n" +
                    "    }\n" +
                    "    .nav{\n" +
                    "      width: 1500px;\n" +
                    "      background-color:white;\n" +
                    "      margin: auto;\n" +
                    "      overflow: auto;\n" +
                    "    }\n" +
                    "    ul{\n" +
                    "      margin: 0;\n" +
                    "      padding: 0;\n" +
                    "      list-style: none;\n" +
                    "    }\n" +
                    "    li{\n" +
                    "      float: left;\n" +
                    "\n" +
                    "    }\n" +
                    "    a:link{\n" +
                    "      color: goldenrod;\n" +
                    "      width: 125px;\n" +
                    "      text-decoration: none;\n" +
                    "      display: block;\n" +
                    "      text-align: center;\n" +
                    "      padding: 15px;\n" +
                    "      text-transform: uppercase;\n" +
                    "      font-size: 18px;\n" +
                    "      font-family: Verdana;\n" +
                    "\n" +
                    "    }\n" +
                    "    a:hover{\n" +
                    "      background-color: black;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "  </style>\n" +
                    "</head>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "<body>\n" +
                    "<div class=\"header\">\n" +
                    "  <img src=\"images.jpg\" width=\"1500px\" height=\"120px\">\n" +
                    "</div>\n" +
                    "\n" +
                    "<div class=\"nav\">\n" +
                    "  <ul>\n" +
                    "    <li><a href=\"#\">Home</a></li>\n" +
                    "    <li><a href=\"/menuServlet\">Menu</a></li>\n" +
                    "    <li><a href=\"layout_with_img.jsp\">Room</a></li>\n" +
                    "\n" +
                    "  </ul>\n" +
                    "</div>\n" +
                    "\n" +
                    "<nav>\n" +
                    "  <style>\n" +
                    "    text {\n" +
                    "      background-color: blueviolet;\n" +
                    "      color: white;\n" +
                    "      padding: 10px;\n" +
                    "    }\n" +
                    "  </style>\n" +
                    "</nav>\n" +
                    "\n" +
                    "<div class=\"footer\">\n" +
                    "  <img src=\"images.jpg\" width=\"1500px\" height=\"120px\">\n" +
                    "</div>");


            w.println("<h1 align=\"center\"> Congratulations to ");
            w.println(request.getParameter("student"));
            w.println("</h1>");


            w.println(
                    "<div class=\"nav\">\n" +
                            "  <ul>\n" +
                            "    <li><a href=\"#\">Contuct us</a></li>\n" +
                            "    <li><a href=\"#\">previous</a></li>\n" +
                            "    <li><a href=\"#\">Next</a></li>\n" +
                            "    <li><a href=\"#\">Exit</a></li>\n" +
                            "\n" +
                            "  </ul>\n" +
                            "</div>"
            );


            w.println("  </body>\n" +
                    "</html>");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
