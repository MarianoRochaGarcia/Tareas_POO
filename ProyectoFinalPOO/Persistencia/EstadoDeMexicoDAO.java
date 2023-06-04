package ProyectoFinalPOO.Persistencia;

import ProyectoFinalPOO.Model.EstadoDeMexico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EstadoDeMexicoDAO implements InterfazDAO {

    public EstadoDeMexicoDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO estadosDeMexico(nombre,url,comida_tipica,millones_habitantes,num_municipios) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.get_instance("estadosDeMexicoDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((EstadoDeMexico) obj).getNombre());
        pstm.setString(2, ((EstadoDeMexico) obj).getUrl());
        pstm.setString(3, ((EstadoDeMexico) obj).getComidaTipica());
        pstm.setDouble(4, ((EstadoDeMexico) obj).getMillonesHabitantes());
        pstm.setInt(5, ((EstadoDeMexico) obj).getNumMunicipios());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE estadosDeMexico SET nombre = ?, url = ?, comida_tipica = ?, millones_habitantes = ?, num_municipios = ? WHERE id = ?; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.get_instance("estadosDeMexicoDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((EstadoDeMexico) obj).getNombre());
        pstm.setString(2, ((EstadoDeMexico) obj).getUrl());
        pstm.setString(3, ((EstadoDeMexico) obj).getComidaTipica());
        pstm.setDouble(4, ((EstadoDeMexico) obj).getMillonesHabitantes());
        pstm.setInt(5, ((EstadoDeMexico) obj).getNumMunicipios());
        pstm.setInt(6, ((EstadoDeMexico) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM estadosDeMexico WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.get_instance("estadosDeMexicoDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM estadosDeMexico";
        ArrayList<EstadoDeMexico> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.get_instance("estadosDeMexicoDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            resultado.add(new EstadoDeMexico(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5), rst.getInt(6)));
        }

        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM estadosDeMexico WHERE id = ? ;";
        EstadoDeMexico estadoDeMexico = null;

        PreparedStatement pstm = ConexionSingleton.get_instance("estadosDeMexicoDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            estadoDeMexico = new EstadoDeMexico(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5), rst.getInt(6));
            return estadoDeMexico;
        }
        return null;
    }
}
