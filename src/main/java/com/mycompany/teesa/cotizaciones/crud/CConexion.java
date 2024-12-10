/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teesa.cotizaciones.crud;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhonn
 * Para conectar con la BDD postgresql
 */
public class CConexion {
    Connection conectar= null;
    
    String usuario="postgres";
    String contrasena="admin";
    String bd="teesa-cotizaciones";
    String ip="localhost";
    String puerto="5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasena);
            // JOptionPane.showMessageDialog(null,"Se conecto correctamente a la base de datos");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.toString());
        }
        return conectar;
    }
}

