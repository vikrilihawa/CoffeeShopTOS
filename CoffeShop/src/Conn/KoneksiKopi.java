package Conn;
import java.sql.*;
public class KoneksiKopi {
    private static Connection conn;
    public static Connection koneksiDB() throws SQLException{
        if(conn==null){
            try{
                String database = "jdbc:mysql://localhost:3306/coffee_shop";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(database,username,password);
                System.out.println("Koneksi Berhasil");
                
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return conn;
    }
}
