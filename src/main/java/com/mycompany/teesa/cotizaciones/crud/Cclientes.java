/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teesa.cotizaciones.crud;


import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JHON SANCHEZ
 */
public class Cclientes {

    String nitCedula;
    String cliente;
    String direccion;
    String ciudad;
    String telefonoFijo;
    String numeroCelular;
    String correo;
    String CorreoOpcional;
    String fechaRegistro;
    
    public String getNitCedula() {
        return nitCedula;
    }

    public void setNitCedula(String nitCedula) {
        this.nitCedula = nitCedula;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreoOpcional() {
        return CorreoOpcional;
    }

    public void setCorreoOpcional(String CorreoOpcional) {
        this.CorreoOpcional = CorreoOpcional;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public void MostrarClientes(JTable paramTablaTotalClientes){
    
    Cconexion objetoConexion = new Cconexion();
    
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql="";
        
        modelo.addColumn("NIT_CEDULA");
        modelo.addColumn("Cliente");
        modelo.addColumn("Dirección");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Telefono_fijo");
        modelo.addColumn("Número_celular");
        modelo.addColumn("Correo");
        modelo.addColumn("Correo_opcional");
        modelo.addColumn("Fecha_registro");
        
        paramTablaTotalClientes.setModel(modelo);
        
        sql ="select * from clientes;";
        
        String [] datos = new String[9];
        Statement st;

            try {
                
                st= objetoConexion.establecerConexion().createStatement();
                
                ResultSet rs = st.executeQuery(sql);
                
                while (rs.next()) {
                    
                    
                    datos[0]= rs.getString(1);
                    datos[1]= rs.getString(2);
                    datos[2]= rs.getString(3);
                    datos[3]= rs.getString(4);
                    datos[4]= rs.getString(5);
                    datos[5]= rs.getString(6);
                    datos[6]= rs.getString(7);
                    datos[7]= rs.getString(8);
                    datos[8]= rs.getString(9);
                    
                    modelo.addRow(datos);
                    
                }
              
               paramTablaTotalClientes.setModel(modelo);
                
        } catch (Exception e) {
            
                JOptionPane.showMessageDialog(null, "Error"+ e.toString());
            
        }
    }
    
}
