/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupofcase.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author craftlnx
 */
public class DataBase {
    
    public static Connection Conexion(){
        Connection conexion = null;
        //VARIABLES DE CONEXION
        String servidor = "localhost";
        String database = "LogUserDB";
        String usuario = "mpolo";
        String puerto = "3306";
        String password = "C4puch1n00r30";
        String url = "";
        
         String email, pass, query, fname = null, passDb = null;
        String Surl, Suser, Spass;
        Surl = "jdbc:MySQL://localhost:3306/LogUserDB";
        Suser = "mpolo";
        Spass = "C4puch1n00r30";
        
        System.out.println("---------------------------------------------------------");
        try {
            //Endica al interprete de Java que en tiempo real mande a cargar la libreria jdbc
            Class.forName("com.mysql.jdbc.Driver");
            
            //cadena con datos de servidor
            url = "jdbc:mysql://" + servidor + ":" + puerto + "/" + database;
            //variable de conexion obteniendo el servidor , usuario y password
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println(" Conexion a Base de Datos: " + url + " --> Ok ");
        } //mandamos mensaje de error por url o error de conexion
        catch (SQLException ex) {
            System.out.println("Error Cadena: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error Clase Conexion: " + ex);
        }
        return conexion;
        
    }
    
}
