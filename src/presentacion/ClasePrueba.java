/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import complementos.Complementos;
import datos.ListaDocente;
import entidades.EstudiantePosgrado;
import entidades.EstudiantePregrado;
import entidades.Docente;
import datos.ListaEstudiantes;

/**
 *
 * @author sistemas
 */
public class ClasePrueba {

    public static int maximo = 7;

    public static void main(String[] args) {
        int opcion;
        String menu = "\n1. Registrar los datos de los estudiantes de pregrado.\n"
                + "\n2. Registrar los datos de los estudiantes de posgrado.\n"
                + "\n3. Registrar los datos de los docentes.\n"
                + "\n4. Listar los datos de los estudiantes que pertenezcan a una institución determinada.\n"
                + "\n5. Listar los datos de los estudiantes de posgrado ordenados por la maestría que se encuentran cursandod.\n"
                + "\n6. Listar los datos de los docentes ordenados por su número de DNI.\n";
        do {
            opcion = Complementos.menu(menu, maximo);
            ejecutar(opcion);
        } while (opcion != maximo);
    }

    /*
    String añoCursando, String nombreInstitucion, String nombre, String apellido, String dni) {
        super(nombreInstitucion, nombre, apellido, dni*/
    public static void ejecutar(int x) {
        switch (x) {
            case 1:
                String añoCursando = String.valueOf(Complementos.validarInt(5, 1, "Ingrese el año que esta cursando el estudiante: ", "No se ha ingresado un año valido.", "El rango de año debe estar entre (1-5)"));
                String nombreInstitucion = Complementos.validarString("Ingrese la institucion del estudiante: ", "No se ha ingresado una institucion correcta.");
                String nombre = Complementos.validarString("Ingrese el nombre del estudiante: ", "No se ha ingresado un nombre correcto.");
                String apellido = Complementos.validarString("Ingrese el apellido del estudiante: ", "No se ha ingresado el apellido");
                String dni = String.valueOf(Complementos.validarInt(999999999, 10000000, "Ingrese el DNI del estudiante: ", "No se ha ingresado un DNI correcto.", "El dni debe tener 8 digitos"));
                
                
                EstudiantePregrado estudiante = new EstudiantePregrado(añoCursando, nombreInstitucion.toUpperCase(), nombre, apellido, dni);
                
                
                ListaEstudiantes.agregarEstudiante(estudiante);
                break;
            case 2:
                String nombreMaestria = Complementos.validarString("Ingrese el nombre de la maestria del estudiante: ", "No se ha ingresado un nombre correcto.");
                String nombreInstitucion2 = Complementos.validarString("Ingrese la institucion del estudiante: ", "No se ha ingresado una institucion correcta.");
                String nombre2 = Complementos.validarString("Ingrese el nombre del estudiante: ", "No se ha ingresado un nombre correcto.");
                String apellido2 = Complementos.validarString("Ingrese el apellido del estudiante: ", "No se ha ingresado el apellido");
                String dni2 = String.valueOf(Complementos.validarInt(999999999, 10000000, "Ingrese el DNI del estudiante: ", "No se ha ingresado un DNI correcto.", "El dni debe tener 8 digitos"));
                
                
                EstudiantePosgrado estudiante2 = new EstudiantePosgrado(nombreMaestria.toUpperCase(), nombreInstitucion2.toUpperCase(), nombre2, apellido2, dni2);
                
                
                ListaEstudiantes.agregarEstudiante(estudiante2);
                break;
            case 3:
                String especializacion = Complementos.validarString("Ingrese la especializacion del docente: ", "No se ha ingresado una especializacion correcta.");
                String nombre3 = Complementos.validarString("Ingrese el nombre del docente: ", "No se ha ingresado un nombre correcto.");
                String apellido3 = Complementos.validarString("Ingrese los apellido del docente: ", "No se ha ingresado un apellido correcto.");
                String dni3 = String.valueOf(Complementos.validarInt(999999999, 10000000, "Ingrese el DNI del docente: ", "No se ha ingresado un DNI correcto.", "El dni debe tener 8 digitos"));
                Docente profesor = new Docente(especializacion, nombre3, apellido3, dni3);
                ListaDocente.añadirDocente(profesor);
                break;
            case 4:
                String nombreInstitucionBuscar = Complementos.validarString("Ingrese la institucion a buscar: ", "No se ha ingresado un nombre correcto.");
                ListaEstudiantes.listarEstudiantesInstitucion(nombreInstitucionBuscar.toUpperCase());
                break;
            case 5:
                ListaEstudiantes.listarEstudiantesPosgrado();
                break;
            case 6:
                ListaDocente.mostrarDocentes();
                break;
            case 7: 
                System.out.println("Adios");
                break;

        }
    }
}
