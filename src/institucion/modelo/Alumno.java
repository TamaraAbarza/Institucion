package institucion.modelo;

import java.time.LocalDate;

public class Alumno {

    private int idAlumno;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private boolean activo;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, LocalDate fechaNac, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }

    public Alumno(int idAlumno, String nombre, String apellido, LocalDate fechaNac, boolean activo) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
