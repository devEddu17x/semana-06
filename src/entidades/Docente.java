/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author sistemas
 */
public class Docente extends Persona{
    private String especializacion;

    public Docente(String especializacion, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.especializacion = especializacion;
    }
    
    public Docente(){
        super();
        this.especializacion = "NE";
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public String toString() {
        
        return "Docente{ Nombre: "+ getNombre() +" Apellido: "+getApellido()+ " DNI: "+getDni()+" Especializacion: " + especializacion + '}';
    }
}
