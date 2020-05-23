package BaseDatos;

import java.io.Serializable;
import java.util.Date;

import java.sql.ResultSet;
import java.sql.Statement;


public class Vehiculo implements Serializable {
    
    public String placa, modelo, marca, anio, serialCarrocerira, valorComercial; 
    
    
    public Propietario propietario;
    
    public Vehiculo() {
    }
    
    public Propietario getPropietario() {
            return this.propietario;
    }
    
    public void setPropietario(Propietario propietario) {
            this.propietario = propietario;
    }

    public boolean buscar(String placa) throws Exception {
        
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        rs = consulta.executeQuery("select * from vehiculo where placa='"
                + placa + "'");
        
        if (rs.next()) {
            this.placa = placa;
            this.modelo = rs.getString("modelo");
            this.marca = rs.getString("marca");
            this.anio = rs.getString("anio");
            this.serialCarrocerira = rs.getString("serialCarrocerira");
            this.valorComercial = rs.getString("valorComercial");
            this.propietario.cedula = rs.getString("propietario");
            return true;
        } else {
            return false;
        }
    }

    public void nuevo(String placa, String modelo, String marca,
            String anio, String serialCarrocerira, String valorComercial, 
            String propietario) throws Exception {
        
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        String sql = "insert into vehiculo values('"
                + placa + "','" + modelo + "','" + marca + "','"
                + anio + "','" + serialCarrocerira + "','" + 
                valorComercial + "','" + propietario + "')";
        consulta.executeUpdate(sql);
    }

    public void modificar(String placa, String modelo, String marca,
            String anio, String serialCarrocerira, String valorComercial, 
            String propietario) throws Exception {
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        String sql = "update vehiculo set modelo='"
                + modelo + "',marca='" + marca + "',"
                + "anio='" + anio + "',serialCarrocerira='" + serialCarrocerira + "'"
                + " valorComercial='" + valorComercial + "'"
                + " propietario='" + propietario + "'"
                + " where placa='" + placa + "'";
        consulta.executeUpdate(sql);
    }

    public ResultSet buscarTexto(String texto) throws Exception {
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        rs = consulta.executeQuery("select * from vehiculo where "
                + " placa like '%" + texto + "%' or"
                + " modelo like '%" + texto + "%'"); /* Ver que va aquí */
        return rs;
    }
}
