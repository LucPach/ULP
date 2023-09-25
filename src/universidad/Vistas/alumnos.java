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

        jLabelBaner = new javax.swing.JLabel();
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
        jLabelID = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabelBaner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/Vistas/banerulp.png"))); // NOI18N
        jLabelBaner.setText("jLabel7");

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

        jBuscarALumno.setBackground(new java.awt.Color(255, 153, 0));
        jBuscarALumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBuscarALumno.setForeground(new java.awt.Color(255, 255, 255));
        jBuscarALumno.setText("Buscar");
        jBuscarALumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarALumnoActionPerformed(evt);
            }
        });

        jNuevo.setBackground(new java.awt.Color(255, 153, 0));
        jNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jEliminar.setBackground(new java.awt.Color(255, 153, 0));
        jEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jGuardar_alumnos.setBackground(new java.awt.Color(255, 153, 0));
        jGuardar_alumnos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jGuardar_alumnos.setForeground(new java.awt.Color(255, 255, 255));
        jGuardar_alumnos.setText("Guardar");
        jGuardar_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardar_alumnosActionPerformed(evt);
            }
        });

        jSalir_alumnos.setBackground(new java.awt.Color(255, 153, 0));
        jSalir_alumnos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSalir_alumnos.setForeground(new java.awt.Color(255, 255, 255));
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

        jModificar.setBackground(new java.awt.Color(255, 153, 0));
        jModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jModificar.setForeground(new java.awt.Color(255, 255, 255));
        jModificar.setText("Modificar");
        jModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNuevo)
                    .addComponent(jGuardar_alumnos)
                    .addComponent(jModificar)
                    .addComponent(jBuscarALumno)
                    .addComponent(jEliminar)))
            .addComponent(jLabelBaner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jEstado)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSalir_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscarALumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jGuardar_alumnos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jModificar)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jEliminar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jEstado)))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSalir_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabelBaner, javax.swing.GroupLayout.PREFERRED_SIZE, 123, Short.MAX_VALUE))
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
       
        jLabelID.setText("" + Integer.toString(al.getIdAlumno()));
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
        jLabelID.setText("");
        
       
        
        
    }//GEN-LAST:event_jNuevoActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
       
        
      
       
       AlumnoData ad= new AlumnoData();
      
       int dni=Integer.parseInt(jTextDni.getText());
       String apellido=jTextApellido.getText();
       String nombre=jTextNombre.getText();
       boolean estado=jEstado.isSelected();
       LocalDate fecha=jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       int ID=Integer.parseInt(jLabelID.getText());
       
       Alumnos al1=new Alumnos(ID,dni,apellido,nombre,fecha,estado);
              
       ad.modificarAlumno(al1);
        
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBaner;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JButton jModificar;
    private javax.swing.JButton jNuevo;
    private javax.swing.JButton jSalir_alumnos;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
