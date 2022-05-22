package institucion.controlador;

import institucion.modelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

    public void insertarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumno (nombre, apellido, fechaNac, activo)  VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));//localDate a Date
            ps.setInt(4, alumno.isActivo() ? 1 : 0);
            // if reducido
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            JOptionPane.showMessageDialog(null, " Se agregó al alumno " + alumno + " correctamente");

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar agregar al alumno");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar alumno " + ex);

        }

    }

    public Alumno buscarAlumno(int idAlumno) {
        Alumno alumno = null;

        String sql = "SELECT * FROM alumno WHERE activo =1 AND idAlumno =?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde buscar alumno " + ex);
        }

        if (alumno != null) {
            JOptionPane.showMessageDialog(null, "Se encontró al alumno " + alumno);
        } else {
            JOptionPane.showMessageDialog(null, "Error, no existe el alumno que intenta buscar");
        }
        return alumno;
    }

    public void borrarAlumno(int idAlumno) {

        String sql = "UPDATE alumno SET activo =0 WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se borró al alumno ");
            } else {
                JOptionPane.showMessageDialog(null, "Error, el alumno no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar alumno " + ex);

        }

    }

    public void modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno SET nombre=?,apellido=?,fechaNac=?,activo=? WHERE idAlumno=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(4, alumno.isActivo());
            ps.setInt(5, alumno.getIdAlumno());

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se modifico correctamente al alumno " + alumno);
            } else {
                JOptionPane.showMessageDialog(null, "Error, no se pudo modificar al alumno. El alumno que intenta modifcar no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde modificar alumno " + ex);

        }

    }

    public void activarAlumno(int idAlumno) {

        String sql = "UPDATE alumno SET activo =1 WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se activo el estado del alumno ");
            } else {
                JOptionPane.showMessageDialog(null, "Error, el alumno no existe");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar alumno " + ex);

        }
    }

    public List<Alumno> obtenerAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        try {
            String sql = "SELECT * FROM alumno WHERE activo=1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Alumno alumno;
            while (resultSet.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFechaNac(resultSet.getDate("fechaNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }

        return alumnos;
    }

}
