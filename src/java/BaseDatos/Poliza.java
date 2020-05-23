package BaseDatos;

import java.sql.ResultSet;
import java.sql.Statement;

public class Poliza {

    public String codpoliza, tipopoliza;

    public Poliza() {
    }

    public boolean buscar(String codpoliza) throws Exception {
        
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        rs = consulta.executeQuery("select * from poliza where codpoliza='"
                + codpoliza + "'");
        
        if (rs.next()) {
            this.codpoliza = codpoliza;
            this.tipopoliza = rs.getString("tipopoliza");
            return true;
        } else {
            return false;
        }
    }

    public void nuevo(String codpoliza, String tipopoliza) throws Exception {
        
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        String sql = "insert into poliza values('"
                + codpoliza + "','" + tipopoliza + "')";
        consulta.executeUpdate(sql);
    }

    public void modificar(String codpoliza, String tipopoliza) throws Exception {
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        String sql = "update poliza set tipopoliza='"
                + tipopoliza + " where codpoliza='" + codpoliza + "'";
        consulta.executeUpdate(sql);
    }

    public ResultSet buscarTexto(String texto) throws Exception {
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        rs = consulta.executeQuery("select * from poliza where "
                + " codpoliza like '%" + texto + "%' or"
                + " tipopoliza like '%" + texto + "%'"); /* Ver que va aquí */
        return rs;
    }
}