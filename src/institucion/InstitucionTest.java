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

//****************************************************************************************************************************
//            //PRUEBA ALUMNO

//            //INSERTAR ALUMNO (fecha ("yyyy/MM/dd"))
//            Alumno alumno1 = new Alumno("Abarza", "Tamara", LocalDate.of(1998, 12, 1), true);
//            Alumno alumno2= new Alumno("Luciano","Cejas", LocalDate.of(1997, 1, 29), true);
//            Alumno alumno3 = new Alumno("Tania", "Aguero", LocalDate.of(1999,5,15), true);
//            Alumno alumno4= new Alumno("Lautaro","Lucero",LocalDate.of(1996,10,27),true);
//            alumData.insertarAlumno(alumno1);
//            alumData.insertarAlumno(alumno2);
//            alumData.insertarAlumno(alumno3);
//            alumData.insertarAlumno(alumno4);

//            //MODIFICAR ALUMNO
//            Alumno alumno5 = new Alumno(10, "Tamara", "Abarza", LocalDate.of(1998, 12, 01), true);
//            Alumno alumno6 = new Alumno(13,"Lautaro","Lucero",LocalDate.of(1998,10,28),true);
//            alumData.modificarAlumno(alumno5);
//            alumData.modificarAlumno(alumno6);
//            //prueba con alumno que no existe
//            Alumno alumno7 = new Alumno(43, "Luciano", "Cejas", LocalDate.of(1997, 01, 29), true);
//            alumData.modificarAlumno(alumno7);

//            //BORRAR ALUMNO
//            alumData.borrarAlumno(10);
//            //BORRAR ALUMNO QUE NO EXISTE
//            alumData.borrarAlumno(20);

//            //ACTIVAR ESTADO ALUMNO
//            alumData.activarAlumno(10);

//            //BUSCAR ALUMNO
//            Alumno buscar = alumData.buscarAlumno(11);
//            Alumno buscar2 = alumData.buscarAlumno(7);

//            //LISTA DE ALUMNOS ACTIVOS
//            List<Alumno> listaAlumnos = alumData.obtenerAlumnos();
//            System.out.println("Lista de alumnos:");
//            System.out.println(listaAlumnos);

//****************************************************************************************************************************
//            //PRUEBA MATERIA

//            //INSERTAR MATERIA
//            Materia materia1 = new Materia("Laboratorio 1", 1, true);
//            Materia materia2 = new Materia("Estructura de datos", 2, true);
//            Materia materia3 = new Materia("Ingles", 2, true);
//            Materia materia4 = new Materia("programacion web", 1, true);
//            matData.insetarMateria(materia1);
//            matData.insetarMateria(materia2);
//            matData.insetarMateria(materia3);
//            matData.insetarMateria(materia4);

//            //MODIFICAR MATERIA
//            Materia materiaMod = new Materia(8, "EDA ", 1, true);
//            matData.modificarMateria(materiaMod);

//            //BORRAR MATERIA
//            matData.borrarMateria(7);

//            //ACTIVAR MATERIA
//            matData.activarMateria(7);

//            //ACTIVAR MATERIA QUE NO EXISTE
//            matData.activarMateria(3);

//            //BUSCAR MATERIA
//            Materia buscarMat1 = matData.buscarMateria(3);
//            Materia buscarMat2 = matData.buscarMateria(9);

//            //LISTA DE MATERIAS ACTIVAS
//            List<Materia> materias = matData.obtenerMaterias();
//            System.out.println("lista de materias");
//            System.out.println(materias);

//****************************************************************************************************************************
            //PRUEBA INSCRIPCION DATA
            
            //GUARDAR INSCRIPCION
            //primero obtengo los alumnos y materias con su id para ponerlos en el argumento del constructor de inscripcion
//            Alumno luciano = alumData.buscarAlumno(11);
//            Alumno tania = alumData.buscarAlumno(12);
//            Materia eda = matData.buscarMateria(8);
//            Materia ingles = matData.buscarMateria(9);

//            Inscripcion inscripcion1 = new Inscripcion(luciano, eda);
//            Inscripcion inscripcion2 = new Inscripcion(luciano, ingles);
//            Inscripcion inscripcion3 = new Inscripcion(tania, ingles);
//            inscData.guardarInscripcion(inscripcion1);
//            inscData.guardarInscripcion(inscripcion2);
//            inscData.guardarInscripcion(inscripcion3);

//            //ACTUALIZAR NOTAS
//            inscData.actualizarNotainscripcion(luciano.getIdAlumno(), eda.getIdMateria(), 10);
//            inscData.actualizarNotainscripcion(tania.getIdAlumno(), ingles.getIdMateria(), 8);
            
//            //BORRAR INSCRIPCION
//            inscData.borrarInscripcion(luciano.getIdAlumno(), ingles.getIdMateria());

//            //LISTAS
//            //LISTA DE TODAS LAS INSCRIPCIONES
//            List<Inscripcion> listaInscripciones = inscData.obtenerInscripciones();
//            System.out.println("Lista de inscripciones:");
//            System.out.println(listaInscripciones);
//
//            //LISTA DE INSCRIPCIONES POR ALUMNO
//            System.out.println("inscripciones del alumno " + luciano);
//            List<Inscripcion> listInscripcionesXAlum1 = inscData.obtenerInscripcionesXAlumno(luciano.getIdAlumno());
//            System.out.println(listInscripcionesXAlum1);
//            System.out.println("inscripciones del alumno " + tania);
//            List<Inscripcion> listInscripcionesXAlum2 = inscData.obtenerInscripcionesXAlumno(tania.getIdAlumno());
//            System.out.println(listInscripcionesXAlum2);
            
//            //LISTA DE MATERIAS INSCRIPTAS POR ALUMNO
//            System.out.println("Lista de materias inscriptas por "+luciano);
//            List<Materia> materiasInsc = inscData.obtenerMateriasInscriptas(luciano.getIdAlumno());
//            System.out.println(materiasInsc);
            
//            //LISTA DE MATERIAS NO INSCRIPTAS POR ALUMNO
//            System.out.println("Materias no cursadas del alumno " + tania);
//            List<Materia> materiasNoInsc = inscData.obtenerMateriasNoInscriptas(tania.getIdAlumno());
//            System.out.println(materiasNoInsc);
            
//            //LISTA DE ALUMNOS POR MATERIA
//            System.out.println("Lista de alumnos de la materia "+ingles);
//            List<Alumno> alumnosXMat = inscData.obtenerAlumnosXMateria(ingles.getIdMateria());
//            System.out.println(alumnosXMat);

//****************************************************************************************************************************
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InstitucionTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
