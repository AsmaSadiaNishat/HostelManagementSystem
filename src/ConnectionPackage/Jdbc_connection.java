package ConnectionPackage;
import java.sql.*;
public class Jdbc_connection {

    public static Connection connectionMethod() {
        Connection c = null;
        Statement s = null;
        ResultSet r = null;
        String reg, url, user, pass;
        reg = "oracle.jdbc.driver.OracleDriver";
        url = "jdbc:oracle:thin:@localhost:1521:orcl";
        user = "nishat_3";
        pass = "Oracle_1";
        try {
            Class.forName(reg);
            c = DriverManager.getConnection(url, user, pass);


        } catch (Exception e) {

        }


        return c;
    }


}
