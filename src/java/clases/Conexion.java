/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Josue
 */
public class Conexion {
    public Connection conexionBD;
    private final String puerto= "3306";
    private final String bd= "bd_final";
    private final String urlConexion = String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto, bd);
    private final String usuario = "usr_proyecto1";
    private final String contra = "Proyecto123";
    private final String jdbc ="com.mysql.cj.jdbc.Driver";
    
    
    public void abrir_con(){
        try{
            Class.forName(jdbc);
            conexionBD=DriverManager.getConnection(urlConexion,usuario,contra);
        }catch(HeadlessException | ClassNotFoundException | SQLException ex){
            System.out.println("Error..."+ex.getMessage());
        } 
    }
    public void cerrar_con(){
        try{
            conexionBD.close();
        }catch(SQLException ex){
            System.out.println("Error..."+ex.getMessage());
        }
    }
    
}
