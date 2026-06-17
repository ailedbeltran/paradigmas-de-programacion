/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Ailed Beltrán
 */
public class Consultas {
    public void insertar (Usuario u){
    String sql = "INSERT INTO usuario (id,nombre,email) VALUES (?,?, ?)";
    try (Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql)){
           ps.setInt(1, u.getId());
           ps.setString(2, u.getNombre());
           ps.setString(3, u.getEmail());
           ps.executeUpdate();
            
    } catch (Exception e){
        e.printStackTrace();
    }
    } 
    
    
    

    public List <Usuario> listar() {
        List <Usuario> lista = new ArrayList <> ();
        String sql = "SELECT * FROM usuario";
        try (Connection con = Conexion.getConexion();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)){
            
            while (rs.next()) {
                Usuario u = new Usuario ();
                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("nombre"));
                u.setEmail(rs.getString("email"));
                lista.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            return lista;
        }
    
    public Usuario obtenerPorId (int id){
        Usuario u = null;
        String sql = "SELECT * FROM usuario WHERE id=?";
        try (Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                u = new Usuario ();
                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("nombre"));
                u.setEmail(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
          return u;  
    }
    
    public void actualizar(Usuario u) {
    String sql = "UPDATE usuario SET nombre=?, email=? WHERE id=?";
    
    try (Connection con = Conexion.getConexion();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, u.getNombre());
        ps.setString(2, u.getEmail());
        ps.setInt(3, u.getId());

        ps.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
    // eliminar
    public void eliminar (int id){
        String sql = "DELETE FROM usuario WHERE id=?";
        try (Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    

}
