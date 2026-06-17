/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ailed Beltrán
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/escuela?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "mysqlailed2804";
    
    public static Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection(URL,USER, PASSWORD);
            
        } catch (ClassNotFoundException e){
            System.out.println("Error: Driver no encontrado ");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error de conexion ");
            e.printStackTrace();
            
        }
        return con;
    }
    
    
    
}
