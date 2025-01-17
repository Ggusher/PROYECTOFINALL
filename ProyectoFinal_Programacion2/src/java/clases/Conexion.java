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
    public final String bd="bd_final";
    public final String urlConexion=String.format("jdbc:mysql://localhost:3306/%s",bd);
    public final String usuario = "usr_proyecto";
    public final String contra="proyecto@.";
    public final String jdbc="com.mysql.cj.jdbc.Driver";
    
    
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
