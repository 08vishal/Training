package vjs180000;

import java.sql.*;
import java.util.Scanner;

public class jdbcScanner {
    public static void main(String[] args) throws Exception {
        final  String url="jdbc:mysql://localhost:3306/abc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=America/Chicago";
        final String userName="root";
        final String passWord="123@dhonI";
        String q = "insert into jdbc1 "
                + " (id,name)" + " values (?, ?)";
        Class.forName ("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection (url,userName,passWord);
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your id ");
        Integer id = Integer.valueOf (scanner.nextLine());

        System.out.print("Enter your name: ");
        String firstName = scanner.nextLine();

        PreparedStatement st= conn.prepareStatement (q);
        st.setInt(1,id);
        st.setString (2,firstName);
        try {
            int i = st.executeUpdate ();
        }catch (Exception e){
            System.out.println (e.getMessage ());
        }
        System.out.println (" records inserted");

        st.close ();
        conn.close ();
    }
}
