package BaseDatos;

import java.sql.ResultSet;
import java.sql.Statement;

public class Propietario {

    public String cedula, nombre, direccion, telefono, estadoCivil, edad;

    public Propietario() {
    }

    public boolean buscar(String cedula) throws Exception {
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        rs = consulta.executeQuery("select * from propietario where cedula='"
                + cedula + "'");
        
        if (rs.next()) {
            this.cedula = cedula;
            this.nombre = rs.getString("nombre");
            this.direccion = rs.getString("direccion");
            this.telefono = rs.getString("telefono");
            this.estadoCivil = rs.getString("estadoCivil");
            this.edad = rs.getString("edad");
            return true;
        } else {
            return false;
        }
    }

    public void nuevo(String cedula, String nombre, String direccion,
            String telefono, String estadoCivil, String edad) throws Exception {
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        String sql = "insert into propietario values('"
                + cedula + "','" + nombre + "','" + direccion + "','"
                + telefono + "','" + estadoCivil + "','" + edad + "')";
        consulta.executeUpdate(sql);
    }

    public void modificar(String cedula, String nombre, String direccion,
            String telefono, String estadoCivil, String edad) throws Exception {
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        String sql = "update propietario set nombre='"
                + nombre + "',direccion='" + direccion + "',"
                + "telefono='" + telefono + "',estadoCivil='" + estadoCivil + "'"
                + " edad='" + edad + "'"
                + " where cedula='" + cedula + "'";
        consulta.executeUpdate(sql);
    }

    public ResultSet buscarTexto(String texto) throws Exception {
        Conectar con = new Conectar();
        Statement consulta = null;
        ResultSet rs = null;
        consulta = con.conn.createStatement();
        rs = consulta.executeQuery("select * from propietario where "
                + " cedula like '%" + texto + "%' or"
                + " nombre like '%" + texto + "%'");
        return rs;
    }
}
