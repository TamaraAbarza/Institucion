/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.view;

import institucion.controlador.AlumnoData;
import institucion.controlador.Conexion;
import institucion.modelo.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormularioAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form CargaMateria
     */
    private Conexion conexion;
    private AlumnoData alumData;

    public FormularioAlumno() throws ClassNotFoundException {
        initComponents();
        conexion = new Conexion();
        alumData = new AlumnoData(conexion);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jcbEstado = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        bntBuscar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel1.setText("FORMULARIO  DE  ALUMNOS");

        jLabel2.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel2.setText("NÚMERO DE LEGAJO");

        jtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtCodigo.setForeground(new java.awt.Color(51, 51, 51));
        jtCodigo.setText("Ingrese el número del alumno que desea buscar");
        jtCodigo.setBorder(null);
        jtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCodigoMouseClicked(evt);
            }
        });
        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCodigoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel3.setText("APELLIDO DEL ALUMNO");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(51, 51, 51));
        jtNombre.setText("Ingrese el nombre del alumno que desea agregar");
        jtNombre.setBorder(null);
        jtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtNombreMouseClicked(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel4.setText("NOMBRE DEL ALUMNO");

        jtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtApellido.setForeground(new java.awt.Color(51, 51, 51));
        jtApellido.setText("Ingrese el apellido del alumno que desea agregar");
        jtApellido.setBorder(null);
        jtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtApellidoMouseClicked(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        btnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(51, 51, 51));
        btnBorrar.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jcbEstado.setBackground(new java.awt.Color(255, 255, 255));
        jcbEstado.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jcbEstado.setText("ESTADO");

        jLabel5.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel5.setText("FECHA DE NACIMIENTO");

        bntBuscar.setBackground(new java.awt.Color(51, 51, 51));
        bntBuscar.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        bntBuscar.setForeground(new java.awt.Color(255, 255, 255));
        bntBuscar.setText("BUSCAR");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(bntBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnModificar)
                        .addGap(15, 15, 15)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bntBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        if (!"".equals(jtCodigo.getText())) {
            //cancelar=2 , no =1 , si=0
            int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro de darle de baja al alumno?");
            if (confirmar == 0) {
                int idAlumno = Integer.parseInt(jtCodigo.getText());
                boolean aux = alumData.borrarAlumno(idAlumno);
                if (aux) {
                    JOptionPane.showMessageDialog(this, "Se dio de baja correctamente al alumno " + jtNombre.getText());
                } else {
                    JOptionPane.showMessageDialog(this, "Error, no se pudo darle de baja al alumno " + jtNombre.getText());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al intentar modificar al alumno. No ha ingresado un número de legajo");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCodigoMouseClicked

        if (jtCodigo.getText().equals("Ingrese el número del alumno que desea buscar")) {
            jtCodigo.setText("");
        }
//        if (jtCodigo.getText() != null) {
//            btnGuardar.setEnabled(false);
//            btnLimpiar.setEnabled(false);
//            btnActualizar.setEnabled(false);
//            jtNombre.setVisible(false);
//            jtAnio.setVisible(false);
//        }
    }//GEN-LAST:event_jtCodigoMouseClicked

    private void jtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyTyped

        //permite solo ingresar numeros
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtCodigoKeyTyped

    private void jtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombreMouseClicked
        if (jtNombre.getText().equals("Ingrese el nombre del alumno que desea agregar")) {
            jtNombre.setText("");
        }
        //ocultar();
    }//GEN-LAST:event_jtNombreMouseClicked

    private void jtApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtApellidoMouseClicked
        if (jtApellido.getText().equals("Ingrese el apellido del alumno que desea agregar")) {
            jtApellido.setText("");
        }
    }//GEN-LAST:event_jtApellidoMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String apellido = jtApellido.getText();
        String nombre = jtNombre.getText();
        Date fecha = jDate.getDate();
        boolean estado = jcbEstado.isSelected();
        //convierto el date del formulario en localDate para ingresarlo en la clase alumno
        LocalDate fechaN = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Alumno alumnoN = new Alumno(nombre, apellido, fechaN, estado);
        boolean aux = alumData.insertarAlumno(alumnoN);
        if (aux) {
            JOptionPane.showMessageDialog(this, "Se agregó correctamente al alumno " + nombre);
            jtCodigo.setText(alumnoN.getIdAlumno() + "");
        } else {
            JOptionPane.showMessageDialog(this, "Error, al intertar agregar al alumno " + nombre);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed

        if (!"".equals(jtCodigo.getText())) {
            int idAlumno = Integer.parseInt(jtCodigo.getText());

            Alumno alumnoB = alumData.buscarAlumno(idAlumno);

            if (alumnoB != null) {
                jtApellido.setText(alumnoB.getApellido());
                jtNombre.setText(alumnoB.getNombre());
                jcbEstado.setSelected(alumnoB.isActivo());
                //Convierto el tipo LocalDate de alumno en Date
                LocalDate fecha = alumnoB.getFechaNac();
                ZoneId zona = ZoneId.systemDefault();
                Date fechaN = Date.from(fecha.atStartOfDay(zona).toInstant());
                jDate.setDate(fechaN);
                btnGuardar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "Error, el codigo que ingresó no corresponde a ningún alumno activo");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al intentar modificar al alumno. No ha ingresado un número de legajo");
        }
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        try {
            int idAlumno = Integer.parseInt(jtCodigo.getText());
            if (alumData.buscarAlumno(idAlumno) != null) {
                String apellido = jtApellido.getText();
                String nombre = jtNombre.getText();
                Date fecha = jDate.getDate();
                boolean estado = jcbEstado.isSelected();
                //convierto el date del formulario en localDate para ingresarlo en la clase alumno
                LocalDate fechaN = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Alumno alumnoN = new Alumno(idAlumno, nombre, apellido, fechaN, estado);
                boolean aux = alumData.modificarAlumno(alumnoN);
                if (aux) {
                    JOptionPane.showMessageDialog(this, "Se modificó correctamente al alumno " + nombre);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al intentar modificar al alumno " + nombre);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error al intentar modificar al alumno. El numero de legajo es incorrecto");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar el numero de legajo, intente nuevamente");
        }
    }//GEN-LAST:event_btnModificarActionPerformed
    private void limpiar() {
        jtNombre.setText("Ingrese el nombre del alumno que desea agregar");
        jtApellido.setText("Ingrese el apellido del alumno que desea agregar");
        jcbEstado.setSelected(false);
        jDate.setDate(null);
        jtCodigo.setText("Ingrese el número del alumno que desea buscar");
    }
    /*
    private void ocultar(){
        String s1="Ingrese el nombre del alumno que desea agregar", s2="Ingrese el apellido del alumno que desea agregar",s3="Ingrese el número del alumno que desea buscar",s4="";
        String s5=jtNombre.getText();
        if(!(s5.equals(s1) || s5.equals(s4)) ){
            bntBuscar.setEnabled(false);
        }
    }
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    private int ParseInt(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
