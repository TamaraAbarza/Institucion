package institucion.controlador;

import institucion.modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

    public MateriaData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

    public boolean insetarMateria(Materia materia) {
        boolean insertar=false;
        String sql = "INSERT INTO materia (nombre, anioMateria,  activo)  VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setInt(3, materia.isActivo() ? 1 : 0);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            //JOptionPane.showMessageDialog(null, " Se agregó la materia correctamente");
            insertar=true;

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
            } else {
                //JOptionPane.showMessageDialog(null, "Error, no se pudo agregar la materia");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar materia" + ex);

        }
        return insertar;
    }

    public Materia buscarMateria(int idMateria) {
        Materia materia = null;

        String sql = "SELECT * FROM materia WHERE idMateria =? AND  activo =1;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materia.setActivo(rs.getBoolean("activo"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde buscar materia " + ex);
        }

        if (materia != null) {
           // JOptionPane.showMessageDialog(null, "Se encontró la materia " + materia);
        } else {
           // JOptionPane.showMessageDialog(null, "Error, no existe la materia que intenta buscar");
        }

        return materia;

    }

    public boolean modificarMateria(Materia materia) {

        boolean mod=false;
        String sql = "UPDATE materia SET nombre=?, anioMateria=?, activo=? WHERE idMateria=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());

            int rs = ps.executeUpdate();

            if (rs > 0) {
               // JOptionPane.showMessageDialog(null, "Se modificó correctamente la materia " + materia);
                mod=true;
            } else {
              //  JOptionPane.showMessageDialog(null, "Error, no se pudo modificar la materia. La materia que intenta modifcar no existe ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde modificar materia " + ex);
        }
        return mod;

    }

    public boolean borrarMateria(int idMateria) {

        boolean borrar=false;
        String sql = "UPDATE materia SET activo =0 WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMateria);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                //JOptionPane.showMessageDialog(null, "Se eliminó correctamente la materia");
                borrar=true;
            } else {
                //JOptionPane.showMessageDialog(null, "Error, no se pudo borrar la materia. La materia que intenta borrar no existe");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde borrar materia " + ex);

        }
        return borrar;
    }

    public List<Materia> obtenerMaterias() {
        ArrayList<Materia> materias = new ArrayList<>();

        try {
            String sql = "SELECT * FROM materia WHERE activo=1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Materia materia;
            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnioMateria(resultSet.getInt("anioMateria"));
                materia.setActivo(resultSet.getBoolean("activo"));

                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las materias: " + ex.getMessage());
        }

        return materias;
    }

    public boolean activarMateria(int idMateria) {

        boolean activar=false;
        String sql = "UPDATE materia SET activo =1 WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMateria);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                //JOptionPane.showMessageDialog(null, "Se activo el estado de la materia ");
                activar=true;
            } else {
               // JOptionPane.showMessageDialog(null, "Error, la materia que intenta activar no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar materia " + ex);

        }
        return activar;
    }
    
    //METODO EXTRA
    public List<Materia> materiasInactivas() {
        ArrayList<Materia> materias = new ArrayList<>();

        try {
            String sql = "SELECT * FROM materia WHERE activo=0;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Materia materia;
            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnioMateria(resultSet.getInt("anioMateria"));
                materia.setActivo(resultSet.getBoolean("activo"));

                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las materias: " + ex.getMessage());
        }

        return materias;
    }

    
    
    
}
