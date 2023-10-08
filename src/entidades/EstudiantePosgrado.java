/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author sistemas
 */
public class EstudiantePosgrado extends Estudiante{
    private String nombreMaestria;

    public EstudiantePosgrado(String nombreMaestria, String nombreInstitucion, String nombre, String apellido, String dni) {
        super(nombreInstitucion, nombre, apellido, dni);
        this.nombreMaestria = nombreMaestria;
    }

    public EstudiantePosgrado(){
        super();
        this.nombreMaestria = "No Establecida";
    }

    public String getNombreMaestria() {
        return nombreMaestria;
    }

    public void setNombreMaestria(String nombreMaestria) {
        this.nombreMaestria = nombreMaestria;
    }

    @Override
    public String toString() {
        return "EstudiantePosgrado{ Nombre: "+ getNombre() +" Apellido: "+getApellido()+ " DNI: "+getDni()+" Institucion: "+getNombreInstitucion()+ " Nombre Maestria:" + nombreMaestria + '}';
    }
    
}
