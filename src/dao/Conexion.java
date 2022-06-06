package dao;


import javax.swing.*;
import java.sql.*;

public class Conexion {
    private static final String DRIVER= "com.mysql.cj.jdbc.Driver";
    private static final String USER= "root";
    private static final String PASSWORD= "root";
    private static final String URL= "jdbc:mysql://localhost:3306/banco";
    private Connection CN;

    public Conexion(){
        CN=null;
    }

    public Connection getConnection(){
        try {
            Class.forName(DRIVER);
            CN= DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (ClassNotFoundException | SQLException ex){

            System.out.println("Error en conexionj "+ex.getMessage());
        }
        return CN;

    }


    public void close(){
        try {
            CN.close();

        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Error al cerrar conexion con la base de datos",JOptionPane.ERROR_MESSAGE);

        }

    }



}