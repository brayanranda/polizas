package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conectar {
    public Connection conn = null;
    public Conectar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         Class.forName("com.mysql.jdbc.Driver").newInstance();
         this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/polizaseguros?user=root&password=");
    }
    
}