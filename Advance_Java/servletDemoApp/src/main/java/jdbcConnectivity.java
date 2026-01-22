import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/jdbcConnectivity")
public class jdbcConnectivity extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "Admin@3006";

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(url, user, password);
            out.println("connection established");
            String sql = "SELECT * FROM stud";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
    out.println("results...");
            out.println("<html><body>");
            out.println("<h2>Student List</h2>");

            while (rs.next()) {
                out.println(
                        rs.getInt("sid") + " " +
                                rs.getString("name") + "<br>"
                );
            }

            out.println("</body></html>");

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error occurred</h3>");
        }
    }
}
