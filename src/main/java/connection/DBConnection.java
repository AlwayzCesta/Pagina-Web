package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    Connection connection;
    static String db = "keymaker";
    static String port = "3306";
    static String login = "root";
    static String password = "Admin";
    
    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:"+this.port+"/"+this.db;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Conexión establecida");
        } catch (Exception ex) {
            System.out.println("Error en la conexión "+ex);
            
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public void desconectar() {
        connection = null;
    }     
    
}
