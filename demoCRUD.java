import java.sql.*;

public class demoCRUD {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "1512";
//        String sql = "insert into student values (6, 'Shiv', 52)";
//        String sql = "update student set s_name = 'Tony' where s_id = 6";
        String sql = "delete from student where s_name = 'Harsh'";
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established.");

        Statement st = con.createStatement();
        st.execute(sql);

        con.close();
        System.out.println("Connection closed.");
    }
}
