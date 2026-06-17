/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ailed Beltrán
 */




public class ConsultasMateria {

    // insertar
    public void insertar(Materia m) {

        String sql = "INSERT INTO materia(nombre, cicloEsc, clave_materia, total_horas) VALUES (?, ?, ?, ?)";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getCicloEsc());
            ps.setString(3, m.getClaveMateria());
            ps.setDouble(4, m.getTotalHoras());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // listar
    public List<Materia> listar() {

        List<Materia> lista = new ArrayList<>();

        String sql = "SELECT * FROM materia";

        try (Connection con = Conexion.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                Materia m = new Materia();

                m.setIdMateria(rs.getInt("id_materia"));
                m.setNombre(rs.getString("nombre"));
                m.setCicloEsc(rs.getInt("cicloEsc"));
                m.setClaveMateria(rs.getString("clave_materia"));
                m.setTotalHoras(rs.getInt("total_horas"));

                lista.add(m);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    // obtener por id
    public Materia obtenerPorId(int idMateria) {

        Materia m = null;

        String sql = "SELECT * FROM materia WHERE id_materia=?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idMateria);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                m = new Materia();

                m.setIdMateria(rs.getInt("id_materia"));
                m.setNombre(rs.getString("nombre"));
                m.setCicloEsc(rs.getInt("cicloEsc"));
                m.setClaveMateria(rs.getString("clave_materia"));
                m.setTotalHoras(rs.getInt("total_horas"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return m;
    }

    // actualizar
    public void actualizar(Materia m) {

        String sql = "UPDATE materia SET nombre=?, cicloEsc=?, clave_materia=?, total_horas=? WHERE id_materia=?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getCicloEsc());
            ps.setString(3, m.getClaveMateria());
            ps.setDouble(4, m.getTotalHoras());
            ps.setInt(5, m.getIdMateria());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // eliminar
    public void eliminar(int idMateria) {

        String sql = "DELETE FROM materia WHERE id_materia=?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idMateria);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

