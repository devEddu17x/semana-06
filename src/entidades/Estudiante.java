/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class Estudiante extends Persona {
    
    private String nombreInstitucion;

    public Estudiante(String nombreInstitucion, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.nombreInstitucion = nombreInstitucion;
    }

    public Estudiante(){
        super();
        this.nombreInstitucion = "X";
    }
    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }
    
    
    
}
