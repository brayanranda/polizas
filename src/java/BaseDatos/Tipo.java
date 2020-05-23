
package BaseDatos;

import java.io.Serializable;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class Tipo {
    public String codtipo, nombre;
    
    public boolean buscar(String codtipo) throws Exception {
        
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        rs = consulta.executeQuery("select * from tipo where codtipo='"
                + codtipo + "'");
        
        if (rs.next()) {
            this.codtipo = codtipo;
            this.nombre = rs.getString("nombre");
            return true;
        } else {
            return false;
        }
    }

    public void nuevo(String codtipo, String nombre) throws Exception {
        
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        String sql = "insert into tipo values('"
                + codtipo + "','" + nombre +  "')";
        consulta.executeUpdate(sql);
    }

    public void modificar(String codtipo, String nombre) throws Exception {
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        String sql = "update tipo set nombre='" + nombre
                + " where codtipo='" + codtipo + "'";
        consulta.executeUpdate(sql);
    }

    public ResultSet buscarTexto(String texto) throws Exception {
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        rs = consulta.executeQuery("select * from tipo where "
                + " codtipo like '%" + texto + "%' or"
                + " nombre like '%" + texto + "%'"); /* Ver que va aquí */
        return rs;
    }
}
