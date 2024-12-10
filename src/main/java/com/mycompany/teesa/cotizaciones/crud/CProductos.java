/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teesa.cotizaciones.crud;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhonn
 * Para hacer el crud de los productos
 */
public class CProductos {
    
    int codigo;
    String nombre;
    String referencia ;
    String marcar ;
    String descripcion ;
    Float precio_hora; 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarcar() {
        return marcar;
    }

    public void setMarcar(String marcar) {
        this.marcar = marcar;
    }

    public Float getPrecio_hora() {
        return precio_hora;
    }

    public void setPrecio_hora(Float precio_hora) {
        this.precio_hora = precio_hora;
    }
    
     public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    public void MostrarProductos(JTable paramTablaTotalProductos){
        CConexion objetoConexion = new CConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "";
        
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Referencia");
        modelo.addColumn("Marca");
        modelo.addColumn("Valor/hora");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Foto");
        
        sql= "select * from Productos";
                
        //String[] datos = new String[5];
        
        Statement st;
        
            try {
            st= objetoConexion.establecerConexion().createStatement();
            ResultSet rs= st.executeQuery(sql);
            
                while (rs.next()) {
                    //datos[0]=rs.getString(1);
                    //datos[1]=rs.getString(2);
                    //datos[2]=rs.getString(3);
                    //datos[3]=rs.getString(4);
                    //datos[4]=rs.getString(5);
                    String id =rs.getString("id");
                    String nombre =rs.getString("nombre");
                    String referencia =rs.getString("referencia");
                    String marcar =rs.getString("marcar");
                    String precioHora =rs.getString("precio_hora");
                    String descripcion=rs.getString("descripcion");
                    
                    byte [] imageBytes = rs.getBytes("foto");
                    Image foto = null;
                    
                    if(imageBytes!=null){
                        try {
                            ImageIcon imageIcon = new ImageIcon(imageBytes);
                            foto= imageIcon.getImage();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
                        }
                        modelo.addRow(new Object[]{id,nombre,referencia,marcar,precioHora,descripcion,foto} );
                    }else{
                        modelo.addRow(new Object[]{id,nombre,referencia,marcar,precioHora,descripcion,""} );
                    }
                    //modelo.addRow(datos);
                    paramTablaTotalProductos.setModel(modelo);
                }
            //paramTablaTotalProductos.setModel(modelo);
            
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void InsertarProducto(JTextField paramNombre, JTextField paramReferencia, JTextField paramMarca, JTextField paramPrecioHora, File foto,JTextArea paramDescripcion){
        
        setNombre(paramNombre.getText());
        setReferencia(paramReferencia.getText());
        setMarcar(paramMarca.getText());
        setPrecio_hora(Float.parseFloat(paramPrecioHora.getText()));
        setDescripcion(paramDescripcion.getText());
        
        CConexion objetoConexion = new CConexion();
        String consulta= "insert into Productos(nombre,referencia,marcar,precio_hora,foto,descripcion) values(?,?,?,?,?,?);";
        
        try {
            FileInputStream fis = new FileInputStream(foto);
            
            CallableStatement cs= objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombre());
            cs.setString(2, getReferencia());
            cs.setString(3, getMarcar());
            cs.setFloat(4, getPrecio_hora());
            cs.setBinaryStream(5, fis, (int)foto.length());
            cs.setString(6, getDescripcion());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se guardó el producto");
        } catch (HeadlessException | FileNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void SeleccionarProduct(JTable paramTablaProducto, JTextField paramId, JTextField paramNombre, JTextField paramReferencia, JTextField paramMarca, JTextField paramValorHora, JLabel paramFoto ,JTextArea paramDescripcion){
        
        try {
            int fila = paramTablaProducto.getSelectedRow();
            
            if(fila>=0){
                
                paramId.setText(paramTablaProducto.getValueAt(fila, 0).toString());
                paramNombre.setText(paramTablaProducto.getValueAt(fila, 1).toString());
                paramReferencia.setText(paramTablaProducto.getValueAt(fila, 2).toString());
                paramMarca.setText(paramTablaProducto.getValueAt(fila, 3).toString());
                paramValorHora.setText(paramTablaProducto.getValueAt(fila, 4).toString());
                paramDescripcion.setText(paramTablaProducto.getValueAt(fila,5).toString());
                
                String valor_imagen=  paramTablaProducto.getValueAt(fila, 6).toString();
               
                
                if(valor_imagen!=null && !"".equals(valor_imagen)){
                    Image imagen= (Image) paramTablaProducto.getValueAt(fila, 6);
                    ImageIcon originalIcon= new ImageIcon(imagen);
                    int lbl_width= paramFoto.getWidth();
                    int lbl_height= paramFoto.getHeight();
                    Image scaledImage= originalIcon.getImage().getScaledInstance(lbl_width, lbl_height, Image.SCALE_SMOOTH);
                    paramFoto.setIcon(new ImageIcon(scaledImage) );
                }else{
                    paramFoto.setIcon(null);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (HeadlessException e) {
            
                JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }

    public void ModificarProducto(JTextField paramId, JTextField paramNombre, JTextField paramReferencia, JTextField paramMarca, JTextField paramPrecioHora, File foto,JTextArea paramDescripcion) {
        
        setCodigo(Integer.parseInt(paramId.getText()) );
        setNombre(paramNombre.getText());
        setReferencia(paramReferencia.getText());
        setMarcar(paramMarca.getText());
        setPrecio_hora(Float.parseFloat(paramPrecioHora.getText()));
        setDescripcion(paramDescripcion.getText());
        
        CConexion objetoConexion = new CConexion();
        String consulta= "update Productos SET nombre=?, referencia=?, marcar=?, precio_hora=?,foto=?, descripcion=? where Productos.id =?;";
        
        try {
            
             FileInputStream fis = new FileInputStream(foto);
             
            CallableStatement cs= objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombre());
            cs.setString(2, getReferencia());
            cs.setString(3, getMarcar());
            cs.setFloat(4, getPrecio_hora());
            cs.setBinaryStream(5, fis, (int)foto.length());
            cs.setString(6, getDescripcion());
            cs.setInt(7, getCodigo());
          
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se modificó el producto");
        } catch (HeadlessException | FileNotFoundException | SQLException e ) {
             JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
        
       
    }
    
     public void EliminarProducto(JTextField paramId){
        
        setCodigo(Integer.parseInt(paramId.getText()) );

        CConexion objetoConexion = new CConexion();
        String consulta= "delete from Productos where Productos.id=?;";
        
        try {
            CallableStatement cs= objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, getCodigo());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se eliminó el producto");
        } catch (HeadlessException | SQLException e) {
             JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
     
     public void BuscarProductos(JTable paramTablaTotalProductos, String palabraClave) {
    CConexion objetoConexion = new CConexion();

    DefaultTableModel modelo = new DefaultTableModel();

    // Definir las columnas de la tabla
    modelo.addColumn("Id");
    modelo.addColumn("Nombre");
    modelo.addColumn("Referencia");
    modelo.addColumn("Marca");
    modelo.addColumn("Valor/hora");
    modelo.addColumn("Descripcion");
    modelo.addColumn("Foto");

    // Consulta SQL con filtro
    String sql = "SELECT * FROM Productos WHERE nombre LIKE ? OR referencia LIKE ? OR marcar LIKE ?";

    try {
        PreparedStatement ps = objetoConexion.establecerConexion().prepareStatement(sql);
        String filtro = "%" + palabraClave + "%";
        ps.setString(1, filtro);
        ps.setString(2, filtro);
        ps.setString(3, filtro);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String id = rs.getString("id");
            String nombre = rs.getString("nombre");
            String referencia = rs.getString("referencia");
            String marca = rs.getString("marcar");
            String precioHora = rs.getString("precio_hora");
            String descripcion = rs.getString("descripcion");

            byte[] imageBytes = rs.getBytes("foto");
            Image foto = null;

            if (imageBytes != null) {
                try {
                    ImageIcon imageIcon = new ImageIcon(imageBytes);
                    foto = imageIcon.getImage();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.toString());
                }
                modelo.addRow(new Object[]{id, nombre, referencia, marca, precioHora, descripcion, foto});
            } else {
                modelo.addRow(new Object[]{id, nombre, referencia, marca, precioHora, descripcion, ""});
            }
        }

        // Actualizar el modelo de la tabla
        paramTablaTotalProductos.setModel(modelo);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    }
}
}
