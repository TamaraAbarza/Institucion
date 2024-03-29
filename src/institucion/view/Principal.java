/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.view;

import institucion.controlador.AlumnoData;
import institucion.controlador.Conexion;
import institucion.controlador.MateriaData;
import institucion.modelo.Alumno;
import institucion.modelo.Materia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Conexion conexion;
    AlumnoData alumData;
    MateriaData matData;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            conexion = new Conexion();
            alumData = new AlumnoData(conexion);
            matData = new MateriaData(conexion);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmAlumno = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmInscripciones = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmNota = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));

        jmArchivo.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmArchivo.add(jMenuItem1);

        jMenuBar1.add(jmArchivo);

        jmMateria.setText("Materias");

        jMenuItem2.setText("Formulario de materias");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmMateria.add(jMenuItem2);

        jMenuBar1.add(jmMateria);

        jmAlumno.setText("Alumnos");
        jmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Formulario de alumnos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmAlumno.add(jMenuItem3);

        jMenuBar1.add(jmAlumno);

        jmInscripciones.setText("Inscripciones");

        jMenuItem4.setText("Manejo de inscripciones");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmInscripciones.add(jMenuItem4);

        jMenuBar1.add(jmInscripciones);

        jmNota.setText("Carga de notas");

        jMenuItem5.setText("Manipulacion de notas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmNota.add(jMenuItem5);

        jMenuBar1.add(jmNota);

        jmConsulta.setText("Consultas");

        jMenuItem6.setText("Listado de alumnos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jmConsulta.add(jMenuItem6);

        jMenuBar1.add(jmConsulta);

        jMenu1.setText("Estado");

        jMenuItem8.setText("Formulario de alta");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        fondo.removeAll();
        FormularioMateria agregarM;
        agregarM = new FormularioMateria();
        agregarM.setVisible(true);
        fondo.add(agregarM);
        fondo.repaint();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        fondo.removeAll();
        FormularioAlumno agregarA;
        try {
            agregarA = new FormularioAlumno();
            agregarA.setVisible(true);
            fondo.add(agregarA);
            fondo.repaint();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmAlumnoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        List<Alumno> alumnos;
        alumnos = alumData.obtenerAlumnos();
        fondo.removeAll();
        FormularioInscripcion agregarI = new FormularioInscripcion(alumnos);
        agregarI.setVisible(true);
        fondo.add(agregarI);
        fondo.repaint();

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        List<Alumno> alumnos;
        alumnos = alumData.obtenerAlumnos();
        fondo.removeAll();
        FormularioNotas agregarN = new FormularioNotas(alumnos);
        agregarN.setVisible(true);
        fondo.add(agregarN);
        fondo.repaint();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        List<Materia> materias;
        try {
            Conexion conexion = new Conexion();
            MateriaData matData = new MateriaData(conexion);
            materias = matData.obtenerMaterias();
            fondo.removeAll();
            FormularioAlXMateria agregar = new FormularioAlXMateria(materias);
            agregar.setVisible(true);
            fondo.add(agregar);
            fondo.repaint();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormularioAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        List<Alumno> alumnos;
        List<Materia> materias;
        alumnos = alumData.alumnosInactivos();
        materias = matData.materiasInactivas();
        FormularioAlta agregar = new FormularioAlta(alumnos, materias);
        fondo.removeAll();
        agregar.setVisible(true);
        fondo.add(agregar);
        fondo.repaint();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane fondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmConsulta;
    private javax.swing.JMenu jmInscripciones;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenu jmNota;
    // End of variables declaration//GEN-END:variables
}
