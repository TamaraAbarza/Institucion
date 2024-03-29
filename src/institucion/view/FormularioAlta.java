/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.view;

import institucion.controlador.AlumnoData;
import institucion.controlador.Conexion;
import institucion.controlador.InscripcionData;
import institucion.controlador.MateriaData;
import institucion.modelo.Alumno;
import institucion.modelo.Materia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormularioAlta extends javax.swing.JInternalFrame {

    /**
     * Creates new form CargaMateria
     */
    private List<Alumno> alumnos;
    private List<Materia> materias;
    private Conexion conexion;
    private InscripcionData inscData;
    private AlumnoData alumData;
    private MateriaData matData;

    public FormularioAlta(List<Alumno> alumnos, List<Materia> materias) {
        initComponents();
        try {
            conexion = new Conexion();
            inscData = new InscripcionData(conexion);
            alumData = new AlumnoData(conexion);
            matData = new MateriaData(conexion);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormularioAlta.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.alumnos = alumnos;
        this.materias = materias;
        agregarAlumnos();
        agregarMaterias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAltaAlumno = new javax.swing.JButton();
        btnAltaMateria = new javax.swing.JButton();
        jcbAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbMateria = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel1.setText("ALTA  DE  ALUMNOS  Y  MATERIAS");

        jLabel2.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel2.setText("ALUMNOS INACTIVOS");

        btnAltaAlumno.setBackground(new java.awt.Color(51, 51, 51));
        btnAltaAlumno.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnAltaAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btnAltaAlumno.setText("DAR ALTA");
        btnAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaAlumnoActionPerformed(evt);
            }
        });

        btnAltaMateria.setBackground(new java.awt.Color(51, 51, 51));
        btnAltaMateria.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnAltaMateria.setForeground(new java.awt.Color(255, 255, 255));
        btnAltaMateria.setText("DAR ALTA");
        btnAltaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaMateriaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel3.setText("MATERIAS INACTIVAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbAlumno, 0, 385, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAltaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAltaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaAlumnoActionPerformed

        //cancelar=2 , no =1 , si=0
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro de darle de alta al alumno " + (Alumno) jcbAlumno.getSelectedItem() + " ?");
        if (confirmar == 0) {
            Alumno selecAlumno = (Alumno) jcbAlumno.getSelectedItem();
            alumData.activarAlumno(selecAlumno.getIdAlumno());
            int posicion = jcbAlumno.getSelectedIndex();
            jcbAlumno.removeItemAt(posicion);
        }
    }//GEN-LAST:event_btnAltaAlumnoActionPerformed

    private void btnAltaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaMateriaActionPerformed
        // TODO add your handling code here:
        //cancelar=2 , no =1 , si=0
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro de darle de alta a la materia " + (Materia) jcbMateria.getSelectedItem() + " ?");
        if (confirmar == 0) {
            Materia selecMateria = (Materia) jcbMateria.getSelectedItem();
            matData.activarMateria(selecMateria.getIdMateria());
            int posicion = jcbMateria.getSelectedIndex();
            jcbMateria.removeItemAt(posicion);
        }
    }//GEN-LAST:event_btnAltaMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaAlumno;
    private javax.swing.JButton btnAltaMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JComboBox<Materia> jcbMateria;
    // End of variables declaration//GEN-END:variables

    private void agregarAlumnos() {
        for (Alumno it : alumnos) {
            jcbAlumno.addItem(it);
        }
    }

    private void agregarMaterias() {
        for (Materia it : materias) {
            jcbMateria.addItem(it);
        }
    }
}
