import java.sql.*;

public class demoJdbc {
    public static void main(String[] args) throws SQLException {

        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close
         */
        /*
        jdbc = type of connection
        postgresql is database (if using mysql then mysql will be in the place)
        database is in local system that's why localhost otherwise it would be ip address
        5432 is port no., different for different database
         */
        //this username and password is of the database
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "1512";
        String sql = "SELECT * FROM student";

        //loading driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //creating connection and connection here is an interface
        //DriverManager is a utility class which provides getConnection() and it returns the object of connection
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, uname, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connection established.");

        //Statement is an interface which executes the given SQL statement, and returns a single ResultSet object.
        Statement st = null;
        try {
            st = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //createStatement() makes a object for sending parameterized SQL statements to the database.

        ResultSet rs = null;
        try {
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //ResultSet object maintains a cursor pointed before the first row.

//        rs.next();
//        //aligning cursor before the first row
//
//        //helps to get the string under the column label
//        String name = rs.getString("s_name");
//        System.out.println(name);

        //System.out.println(rs.next());
        //next() method returns a boolean value.

        while (rs.next()){
//            here next() will check whether there is data in the next column or not
/*
 String id = rs.getString("s_id");
 String name = rs.getString("s_name");
 String marks = rs.getString("s_marks");
 System.out.println(id +" - "+ name+" - "+marks);
*/
            System.out.print(rs.getInt(1)+" - ");
            System.out.print(rs.getString(2)+" - ");
            System.out.println(rs.getInt(3));

        }

        con.close();
        //close() is used to close the connection with the database.
    }
}
