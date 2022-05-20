package institucion;

import institucion.controlador.AlumnoData;
import institucion.controlador.Conexion;
import institucion.controlador.InscripcionData;
import institucion.controlador.MateriaData;
import institucion.modelo.Alumno;
import institucion.modelo.Inscripcion;
import institucion.modelo.Materia;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InstitucionTest {

    public static void main(String[] args) {

        try {
            Conexion conexion = new Conexion();
            AlumnoData alumData = new AlumnoData(conexion);
            MateriaData matData = new MateriaData(conexion);
            InscripcionData inscData = new InscripcionData(conexion);

//            //INSERTAR ALUMNO
//            Alumno alumno1 = new Alumno("Abarza", "Tamara", LocalDate.of(1998, 1, 12), true);
//            Alumno alumno4 = new Alumno("Tania", "Aguero", LocalDate.of(1999, 05, 15), true);
//            alumData.insertarAlumno(alumno1);
//            alumData.insertarAlumno(alumno4);
//
//            // MODIFICAR ALUMNO
//            Alumno alumno2 = new Alumno(7, "Tamara", "Abarza", LocalDate.of(1998, 12, 01), true);
//            Alumno alumno3 = new Alumno(8, "Luciano", "Cejas", LocalDate.of(1997, 01, 29), true);
//            alumData.modificarAlumno(alumno2);
//            alumData.modificarAlumno(alumno3);
//            //prueba con alumno que no existe
//            Alumno alumno5 = new Alumno(10, "Luciano", "Cejas", LocalDate.of(1997, 01, 29), true);
//            alumData.modificarAlumno(alumno4);
//
//            //BORRAR ALUMNO
//            alumData.borrarAlumno(7);
//            alumData.borrarAlumno(20);
//            alumData.activarAlumno(7);
//
//            //BUSCAR ALUMNO
//            Alumno buscar = alumData.buscarAlumno(8);
//            Alumno buscar2 = alumData.buscarAlumno(7);
//            if (buscar != null) {
//                System.out.println("Se encontró al alumno");
//                System.out.println(buscar);
//            } else {
//                System.out.println("Error, el alumno no existe");
//            }
//
//            //OBTENER ALUMNOS
//            List<Alumno> alumnos = alumData.obtenerAlumnos();
//            System.out.println("Lista de alumnos:");
//            System.out.println(alumnos);
//
//            //MATERIA DATA
//            Materia materia1 = new Materia("Laboratorio 1", 1, true);
//            Materia materia2 = new Materia("Estructura de datos", 2, true);
//            Materia materia3= new Materia("Ingles",2,true);
//            Materia materia4=new Materia("programacion web",1,true);
//            matData.insetarMateria(materia1);
//            matData.insetarMateria(materia2);
//              matData.insetarMateria(materia3);
//              matData.insetarMateria(materia4);

//            Materia matModificada = new Materia(4, "EDA ", 1, true);
//            matData.modificarMateria(matModificada);
//            matData.borrarMateria(3);
//            matData.activarMateria(3);
//            Materia buscarMat1 = matData.buscarMateria(3);
//            Materia buscarMat2 = matData.buscarMateria(4);
//            if (buscarMat1 != null) {
//                System.out.println("Se encontró la materia");
//                System.out.println(buscarMat1);
//            } else {
//                System.out.println("Error, la materia no existe");
//            }
//            List<Materia> materias = matData.obtenerMaterias();
//            System.out.println("lista de materias");
//            System.out.println(materias);
//

////            PRUEBA INSCRIPCION DATA
////agregar inscripcion
//            Inscripcion inscripcion1 = new Inscripcion(buscar, buscarMat1);
//            Inscripcion inscripcion2 = new Inscripcion(buscar, buscarMat2);
//            Inscripcion inscripcion3 = new Inscripcion(buscar2, buscarMat2);
//            inscData.guardarInscripcion(inscripcion1);
//            inscData.guardarInscripcion(inscripcion2);
//            inscData.guardarInscripcion(inscripcion3);
////Actualizar notas
//            inscData.actualizarNotainscripcion(8, 3, 10);
//            inscData.actualizarNotainscripcion(8, 4, 8);
////borrar inscripcion
//            inscData.borrarInscripcion(8, 3);
//
////LISTAS INSCRIPCION
////lista de inscripciones
//            List<Inscripcion> listInscripciones = inscData.obtenerInscripciones();
//            System.out.println(listInscripciones);
////Lista de inscripciones x alumno
//            System.out.println("inscripciones del alumno " + buscar2);
//            List<Inscripcion> listInscripcionesXAlum1 = inscData.obtenerInscripcionesXAlumno(buscar2.getIdAlumno());
//            System.out.println(listInscripcionesXAlum1);
//            System.out.println("inscripciones del alumno " + buscar);
//            List<Inscripcion> listInscripcionesXAlum2 = inscData.obtenerInscripcionesXAlumno(buscar.getIdAlumno());
//            System.out.println(listInscripcionesXAlum2);
////lista de materias inscriptas x alumno
//            List<Materia> materiasInsc = inscData.obtenerMateriasInscriptas(buscar.getIdAlumno());
//            System.out.println(materiasInsc);
//            System.out.println("Materias no cursadas del alumno " + buscar2);
////lista de materias no inscriptas x alumno
//            List<Materia> materiasNoInsc = inscData.obtenerMateriasNoInscriptas(buscar2.getIdAlumno());
//            System.out.println(materiasNoInsc);
////lista de alumnos x materia
//            List<Alumno> alumnosXMat = inscData.obtenerAlumnosXMateria(3);
//            System.out.println(alumnosXMat);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InstitucionTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
