import java.sql.*;

public class prepared {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "1512";

        int id = 9;
        String name = "Harsh";
        int marks = 69;

        String sql = "insert into student values (?,?,?)";
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established.");

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, id);
        st.setString(2, name);
        st.setInt(3, marks);
        st.execute();

        con.close();
        System.out.println("Connection closed.");
    }
}
