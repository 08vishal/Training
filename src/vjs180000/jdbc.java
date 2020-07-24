package vjs180000;
import java.sql.*;

public class jdbc {
    public static void main(String[] args) throws Exception {
        final String url="jdbc:mysql://localhost:3306/abc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=America/Chicago";
        final String userName="root";
        final String passWord="123@dhonI";
        String query= "select name from jdbc1 where id=3";
        Class.forName ("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection (url,userName,passWord);
        Statement st= conn.createStatement ();
        ResultSet rs=st.executeQuery (query);
        rs.next ();
        String name=rs.getString ("name");
        System.out.println (name);
        st.close ();
        conn.close ();
       // jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    }
}
