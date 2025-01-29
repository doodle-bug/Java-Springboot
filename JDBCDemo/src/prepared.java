import java.sql.*;

public class prepared {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "1512";

        int id = 9;
        String name = "Harsh";
        int marks = 69;

//        if we need to input data filled by the user ? is used provided by preparedStatement which can be replaced later.
        String sql = "insert into student values (?,?,?)";
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established.");

//        when doing create, update, always use preparedStatement
        PreparedStatement st = con.prepareStatement(sql);
//        replacing ? with values input by the user
        st.setInt(1, id);
        st.setString(2, name);
        st.setInt(3, marks);
        st.execute();

        con.close();
        System.out.println("Connection closed.");
    }
}
