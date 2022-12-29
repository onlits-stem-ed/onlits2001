import java.sql.*;
class DatabaseExample {
    public static void main(String[] args) {
        try {
<<<<<<< HEAD
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school","test","test");


        }
        catch(SQLException e) {
            System.out.println(e.toString());
=======
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School","fred","fred");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Classes");
            while(rs.next())
            {
                System.out.println(rs.getString(1) + "\t" + rs.getString("classname"));
            }
        }
        catch(SQLException e) {
            System.out.println(e.toString());
            System.out.println(e.getStackTrace());
>>>>>>> 7240f7f92c913961611acfc6298459d3bb1fd8db
        }

        System.out.println("Aal is well!");
    }
}