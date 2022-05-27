package institucion.controlador;

import institucion.modelo.Alumno;
import institucion.modelo.Inscripcion;
import institucion.modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con = null;
    private Conexion conexion;

    public InscripcionData(Conexion conexion) {
        try {
            this.conexion = conexion;
            this.con = conexion.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir al obtener la conexion");
        }
    }

    public boolean  guardarInscripcion(Inscripcion inscripcion) {
        boolean insc=false;
        try {
            String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES ( ? , ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setDouble(3, inscripcion.getNota());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt(1));
               // JOptionPane.showMessageDialog(null, "Se inscribió al alumno correctamente");
               insc=true;
            } else {
                //JOptionPane.showMessageDialog(null, "No se pudo obtener el id luego de insertar un alumno");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al inscribir al alumno: " + ex.getMessage());
        }
        return insc;
    }
    

    public boolean actualizarNotainscripcion(int idAlumno, int idMateria, double nota) {

        boolean act=false;
        try {
            String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno =? and idMateria =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            ps.executeUpdate();
            ps.close();
            //JOptionPane.showMessageDialog(null, "Se actualizo correctamente la nota ");
            act=true;
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error en actualizar nota " + ex.getMessage());
        }
        return act;
    }

    
    public boolean borrarInscripcion(int idAlumno, int idMateria) {
        
        boolean borrar=false;
        try {
            String sql = "DELETE FROM inscripcion WHERE idAlumno =? and idMateria =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int rs= ps.executeUpdate();
             if (rs > 0) {
                // JOptionPane.showMessageDialog(null, "Se borró al alumno ");
                borrar = true;
            } else {
                //JOptionPane.showMessageDialog(null, "Error, el alumno no existe ");
            }
            ps.close();

        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error de conexion desde borrar inscripcion " + ex);
        }
        return borrar;
    }

    
    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
        try {
            String sql = "SELECT * FROM inscripcion;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Inscripcion inscripcion;
            while (resultSet.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(resultSet.getInt("idInscripcion"));

                Alumno a = buscarAlumno(resultSet.getInt("idAlumno"));
                inscripcion.setAlumno(a);

                Materia m = buscarMateria(resultSet.getInt("idMateria"));
                inscripcion.setMateria(m);

                inscripcion.setNota(resultSet.getInt("nota"));

                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones: " + ex.getMessage());
        }

        return inscripciones;
    }

    
    public List<Inscripcion> obtenerInscripcionesXAlumno(int idAlumno) {
        List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
        try {
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet resultSet = ps.executeQuery();
            Inscripcion inscripcion;
            while (resultSet.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(resultSet.getInt("idInscripcion"));

                Alumno a = buscarAlumno(resultSet.getInt("idAlumno"));
                inscripcion.setAlumno(a);

                Materia m = buscarMateria(resultSet.getInt("idMateria"));
                inscripcion.setMateria(m);

                inscripcion.setNota(resultSet.getInt("nota"));

                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones " + ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        List<Alumno> alumnosXMateria = new ArrayList<>();  
        try {
            String sql = "SELECT a.idAlumno,nombre,apellido,fechaNac,activo "
                    + "FROM inscripcion i,alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idMateria);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                Alumno alum = new Alumno();
                alum.setIdAlumno(rs.getInt("idAlumno"));
                alum.setNombre(rs.getString("nombre"));
                alum.setApellido(rs.getString("apellido"));
                alum.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alum.setActivo(true);
                
                alumnosXMateria.add(alum);
            }      
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias.");
        }
        return alumnosXMateria;
    }

    
    public List<Materia> obtenerMateriasInscriptas(int idAlumno) {
        List<Materia> materias = new ArrayList<Materia>();

        try {
            String sql = "SELECT inscripcion.idMateria, nombre,anioMateria FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria\n"
                    + "and inscripcion.idAlumno = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet resultSet = ps.executeQuery();
            Materia materia;
            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnioMateria(resultSet.getInt("anioMateria"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las materias " + ex.getMessage());
        }
        return materias;
    }
    

    public List<Materia> obtenerMateriasNoInscriptas(int idAlumno) {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            String sql = "Select * from materia where idMateria not in "
                    + "(select idMateria from inscripcion where idAlumno =?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet resultSet = ps.executeQuery();
            Materia materia;
            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnioMateria(resultSet.getInt("anioMateria"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las materias: " + ex.getMessage());
        }
        return materias;
    }

    
    public Alumno buscarAlumno(int idAlumno) {
        AlumnoData alumData = new AlumnoData(conexion);
        return alumData.buscarAlumno(idAlumno);
    }
    

    public Materia buscarMateria(int idMateria) {
        MateriaData matData = new MateriaData(conexion);
        return matData.buscarMateria(idMateria);
    }

    
    
    //extra
    public List<Inscripcion> obtenerInscripcionesXMateria(int idMateria) {
        List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
        try {
            String sql = "SELECT * FROM inscripcion WHERE idMateria = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet resultSet = ps.executeQuery();
            Inscripcion inscripcion;
            while (resultSet.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(resultSet.getInt("idInscripcion"));

                Alumno a = buscarAlumno(resultSet.getInt("idAlumno"));
                inscripcion.setAlumno(a);

                Materia m = buscarMateria(resultSet.getInt("idMateria"));
                inscripcion.setMateria(m);

                inscripcion.setNota(resultSet.getInt("nota"));

                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones " + ex.getMessage());
        }
        return inscripciones;
    }
    
    
}
