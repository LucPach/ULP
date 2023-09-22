/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.Vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidad.Acceso.AlumnoData;
import universidad.Entidades.Alumnos;

/**
 *
 * @author Exon
 */
public class alumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form alumnos
     */
    public alumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextDni = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jEstado = new javax.swing.JRadioButton();
        jBuscarALumno = new javax.swing.JButton();
        jNuevo = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jGuardar_alumnos = new javax.swing.JButton();
        jSalir_alumnos = new javax.swing.JButton();
        jDate = new com.toedter.calendar.JDateChooser();
        jModificar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");

        jEstado.setText("jRadioButton1");

        jBuscarALumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBuscarALumno.setText("Buscar");
        jBuscarALumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarALumnoActionPerformed(evt);
            }
        });

        jNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jGuardar_alumnos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jGuardar_alumnos.setText("Guardar");
        jGuardar_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardar_alumnosActionPerformed(evt);
            }
        });

        jSalir_alumnos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSalir_alumnos.setText("Salir");
        jSalir_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalir_alumnosActionPerformed(evt);
            }
        });

        jDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDatePropertyChange(evt);
            }
        });

        jModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jNuevo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jGuardar_alumnos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jModificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jEliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSalir_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(12, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(39, 39, 39)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEstado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDni)
                            .addComponent(jTextApellido)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addComponent(jBuscarALumno)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscarALumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNuevo)
                    .addComponent(jGuardar_alumnos)
                    .addComponent(jSalir_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jModificar)
                    .addComponent(jEliminar))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalir_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalir_alumnosActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jSalir_alumnosActionPerformed

    private void jGuardar_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardar_alumnosActionPerformed
       //boton para guardar en base a los 3 campos de texto el alumno en la base de datos
       
       int dni=Integer.parseInt(jTextDni.getText());
       String apellido=jTextApellido.getText();
       String nombre=jTextNombre.getText();
       boolean estado=jEstado.isSelected();
       LocalDate fecha=jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       
       Alumnos al1= new Alumnos(dni,apellido,nombre,fecha,estado);
       AlumnoData ad= new AlumnoData();
       
       ad.guardarAlumno(al1);
      
       
       
       
       
       
    }//GEN-LAST:event_jGuardar_alumnosActionPerformed

    private void jDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDatePropertyChange
        // TODO add your handling code here:
        if(jDate.getDate()!=null){
        
        LocalDate fecha=jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        
        }
    }//GEN-LAST:event_jDatePropertyChange

    private void jBuscarALumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarALumnoActionPerformed
      
        
        int dni=Integer.parseInt(jTextDni.getText());
         AlumnoData ad= new AlumnoData();
        
         
        Alumnos al= ad.buscarAlumnoPorDni(dni);
        if(al!=null){
        jTextApellido.setText(al.getApellido());
        jTextNombre.setText(al.getNombre());
        jEstado.setSelected(al.isEstado());
        jDate.setDate(Date.valueOf(al.getFecha()));
        }
       
               
                
                               
                        
                        
        
        
        
        
    }//GEN-LAST:event_jBuscarALumnoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        
        int dni=Integer.parseInt(jTextDni.getText());
         AlumnoData ad= new AlumnoData();
        
         
        Alumnos al= ad.buscarAlumnoPorDni(dni);
        if(al!=null){
        jTextApellido.setText(al.getApellido());
        jTextNombre.setText(al.getNombre());
        jEstado.setSelected(al.isEstado());
        jDate.setDate(Date.valueOf(al.getFecha()));
        
        int xx=al.getIdAlumno();
        ad.eliminarAlumno(xx);
        
        
    }//GEN-LAST:event_jEliminarActionPerformed
    }
    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
     
        jTextDni.setText("");
        jTextApellido.setText("");
        jTextNombre.setText("");
        jEstado.setSelected(false);  
        jDate.setDate(Date.valueOf(LocalDate.now()));
        
       
        
        
    }//GEN-LAST:event_jNuevoActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
       
        
       int dni=Integer.parseInt(jTextDni.getText());
       String apellido=jTextApellido.getText();
       String nombre=jTextNombre.getText();
       boolean estado=jEstado.isSelected();
       LocalDate fecha=jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       
       Alumnos al1= new Alumnos();
       AlumnoData ad= new AlumnoData();
       
       al1=ad.buscarAlumno(al1.getIdAlumno());
       
       
       ad.modificarAlumno(al1,estado);
        
    }//GEN-LAST:event_jModificarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscarALumno;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JButton jEliminar;
    private javax.swing.JRadioButton jEstado;
    private javax.swing.JButton jGuardar_alumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jModificar;
    private javax.swing.JButton jNuevo;
    private javax.swing.JButton jSalir_alumnos;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
