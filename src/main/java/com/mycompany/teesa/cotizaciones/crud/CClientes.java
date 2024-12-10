/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teesa.cotizaciones.crud;


import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JHON SANCHEZ
 */
public class CClientes {
    
    int codigo;
    String nitCedula;
    String cliente;
    String direccion;
    String ciudad;
    String telefonoFijo;
    String numeroCelular;
    String correo;
    String CorreoOpcional;
    String fechaRegistro;

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    String encargado;
    String cargo;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    } 
    
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
    
    CConexion objetoConexion = new CConexion();
    
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql="";
        
        modelo.addColumn("ID_Cliente");
        modelo.addColumn("NIT_CEDULA");
        modelo.addColumn("Cliente");
        modelo.addColumn("Dirección");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Telefono_fijo");
        modelo.addColumn("Número_celular");
        modelo.addColumn("Correo");
        modelo.addColumn("Correo_opcional");
        modelo.addColumn("Fecha_registro");
        modelo.addColumn("Encargado");
        modelo.addColumn("Cargo");
        
        paramTablaTotalClientes.setModel(modelo);
        
        sql ="select * from clientes;";
        
        String [] datos = new String[12];
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
                    datos[9]= rs.getString(10);
                    datos[10]= rs.getString(11);
                    datos[11]= rs.getString(12);
                    
                    modelo.addRow(datos);
                    
                }
              
               paramTablaTotalClientes.setModel(modelo);
                
        } catch (SQLException e) {
            
                JOptionPane.showMessageDialog(null, "Error"+ e.toString());
            
        }
    }
    
    public void insertarCliente(JTextField paramNitCedula, JTextField paramCliente, JTextField paramDirrecion, JTextField paramCiudad, JTextField paramTelefonoFijo, JTextField paramNumeroCelular, JTextField paramCorreo, JTextField paramCorreoOpcional, JTextField paramFechaRegistro,JTextField paramEncargado, JTextField paramCargo ){
        
        setNitCedula(paramNitCedula.getText());
        setCliente(paramCliente.getText());
        setDireccion(paramDirrecion.getText());
        setCiudad(paramCiudad.getText());
        setTelefonoFijo(paramTelefonoFijo.getText());
        setNumeroCelular(paramNumeroCelular.getText());
        setCorreo(paramCorreo.getText());
        setCorreoOpcional(paramCorreoOpcional.getText());
        setFechaRegistro(paramFechaRegistro.getText());
        setEncargado(paramEncargado.getText());
        setCargo(paramCargo.getText());
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "INSERT INTO clientes  (NIT_CEDULA,Cliente,Dirección,Ciudad,Telefono_fijo,Numero_celular,Correo,Corre_opcional,Fecha_registro,encargado,Cargo) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
        
        try {
            
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate parsedFechaRegistro = LocalDate.parse(getFechaRegistro(), formatter);
            
            cs.setString(1, getNitCedula());
            cs.setString(2, getCliente());
            cs.setString(3, getDireccion());
            cs.setString(4, getCiudad());
            cs.setString(5, getTelefonoFijo());
            cs.setString(6, getNumeroCelular());
            cs.setString(7, getCorreo());
            cs.setString(8, getCorreoOpcional());
            cs.setObject(9, parsedFechaRegistro);
            cs.setObject(10, getEncargado());
            cs.setObject(11, getCargo());
            
            cs.execute();
                   
           JOptionPane.showMessageDialog(null,"Se inertó correctamente");
            
        } catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error:" + e.toString());
        }
        
    }    
        public void seleccionarCliente(JTable paramTablaClientes, JTextField paramId, JTextField paramNitCedula, JTextField paramCliente, JTextField paramDireccion, JTextField paramCiudad, JTextField paramTelefonoFijo, JTextField paramNumeroCelular, JTextField paramCorreo, JTextField paramCorreoOpcional, JTextField paramFechaRegistro,JTextField paramEncargado, JTextField paramCargo){
            
            try {
                
                int fila=paramTablaClientes.getSelectedRow();
                
                if (fila>=0) {
                    paramId.setText(paramTablaClientes.getValueAt(fila, 0).toString());
                    paramNitCedula.setText(paramTablaClientes.getValueAt(fila, 1).toString());
                    paramCliente.setText(paramTablaClientes.getValueAt(fila, 2).toString());
                    paramDireccion.setText(paramTablaClientes.getValueAt(fila, 3).toString());
                    paramCiudad.setText(paramTablaClientes.getValueAt(fila, 4).toString());
                    paramTelefonoFijo.setText(paramTablaClientes.getValueAt(fila, 5).toString());
                    paramNumeroCelular.setText(paramTablaClientes.getValueAt(fila, 6).toString());
                    paramCorreo.setText(paramTablaClientes.getValueAt(fila, 7).toString());
                    paramCorreoOpcional.setText(paramTablaClientes.getValueAt(fila, 8).toString());
                    paramFechaRegistro.setText(paramTablaClientes.getValueAt(fila, 9).toString());
                    paramEncargado.setText(paramTablaClientes.getValueAt(fila, 10).toString());
                    paramCargo.setText(paramTablaClientes.getValueAt(fila, 11).toString());
                }
                
                else
                {
                JOptionPane.showMessageDialog(null,"Fila no seleccionada");    
                }    
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null,"Error:" + e.toString());
                
            }
            
        }
         public void ModificarClientes(JTextField paramId, JTextField paramNitCedula, JTextField paramCliente, JTextField paramDirrecion, JTextField paramCiudad, JTextField paramTelefonoFijo, JTextField paramNumeroCelular, JTextField paramCorreo, JTextField paramCorreoOpcional, JTextField paramFechaRegistro,JTextField paramEncargado, JTextField paramCargo){
        
        setCodigo(Integer.parseInt(paramId.getText()));
        setNitCedula(paramNitCedula.getText());
        setCliente(paramCliente.getText());
        setDireccion(paramDirrecion.getText());
        setCiudad(paramCiudad.getText());
        setTelefonoFijo(paramTelefonoFijo.getText());
        setNumeroCelular(paramNumeroCelular.getText());
        setCorreo(paramCorreo.getText());
        setCorreoOpcional(paramCorreoOpcional.getText());
        setFechaRegistro(paramFechaRegistro.getText());
        setEncargado(paramEncargado.getText());
        setCargo(paramCargo.getText());
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "UPDATE clientes SET NIT_CEDULA=?, Cliente=?, Dirección=?, Ciudad=?, Telefono_fijo=?, Numero_celular=?, Correo=?, Corre_opcional=?, Fecha_registro=?, encargado=?, Cargo=? where clientes.id =?";
        
        try {
            
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate parsedFechaRegistro = LocalDate.parse(getFechaRegistro(), formatter);
            
            cs.setString(1, getNitCedula());
            cs.setString(2, getCliente());
            cs.setString(3, getDireccion());
            cs.setString(4, getCiudad());
            cs.setString(5, getTelefonoFijo());
            cs.setString(6, getNumeroCelular());
            cs.setString(7, getCorreo());
            cs.setString(8, getCorreoOpcional());
            cs.setObject(9, parsedFechaRegistro);
            cs.setInt(10, getCodigo());
            cs.setString(11, getEncargado());
            cs.setString(12, getCargo());
            
            cs.execute();
                   
           JOptionPane.showMessageDialog(null,"Se modificó correctamente");
            
        } catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error:" + e.toString());
        }
    }   
         public void EliminarCliente(JTextField paramId){
        
        setCodigo(Integer.parseInt(paramId.getText()) );

        CConexion objetoConexion = new CConexion();
        String consulta= "delete from clientes where clientes.id=?";
        
        try {
            CallableStatement cs= objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, getCodigo());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se eliminó el cliente");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }    
        
    }    
         
    public void BuscarClientes(JTable paramTablaClientes, String palabraClave) {
    // Crear una conexión con la base de datos
    CConexion objetoConexion = new CConexion();

    // Crear el modelo de tabla
    DefaultTableModel modelo = new DefaultTableModel();

    // Definir las columnas
    modelo.addColumn("ID_Cliente");
    modelo.addColumn("NIT_CEDULA");
    modelo.addColumn("Cliente");
    modelo.addColumn("Dirección");
    modelo.addColumn("Ciudad");
    modelo.addColumn("Telefono_fijo");
    modelo.addColumn("Número_celular");
    modelo.addColumn("Correo");
    modelo.addColumn("Correo_opcional");
    modelo.addColumn("Fecha_registro");

    // Asignar el modelo a la tabla
    paramTablaClientes.setModel(modelo);

    // Consulta SQL con filtro de búsqueda
    String sql = "SELECT * FROM clientes WHERE " +
                 "Cliente LIKE ? OR " +
                 "Dirección LIKE ? OR " +
                 "Correo LIKE ? OR " +
                 "NIT_CEDULA LIKE ? OR " +
                 "Ciudad LIKE ?";

    String[] datos = new String[10];

    try (PreparedStatement pst = objetoConexion.establecerConexion().prepareStatement(sql)) {
        // Configurar los parámetros para la búsqueda
        String filtro = "%" + palabraClave + "%";
        pst.setString(1, filtro);
        pst.setString(2, filtro);
        pst.setString(3, filtro);
        pst.setString(4, filtro);
        pst.setString(5, filtro);

        // Ejecutar la consulta
        ResultSet rs = pst.executeQuery();

        // Procesar los resultados
        while (rs.next()) {
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            datos[4] = rs.getString(5);
            datos[5] = rs.getString(6);
            datos[6] = rs.getString(7);
            datos[7] = rs.getString(8);
            datos[8] = rs.getString(9);
            datos[9] = rs.getString(10);

            modelo.addRow(datos);
        }

        // Actualizar la tabla con el modelo
        paramTablaClientes.setModel(modelo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
  }
         
}
