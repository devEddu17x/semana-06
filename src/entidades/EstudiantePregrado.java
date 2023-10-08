/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author sistemas
 */
public class EstudiantePregrado extends Estudiante {

    private String añoCursando;

    public EstudiantePregrado(String añoCursando, String nombreInstitucion, String nombre, String apellido, String dni) {
        super(nombreInstitucion, nombre, apellido, dni);
        this.añoCursando = añoCursando;
    }

    public EstudiantePregrado() {
        super();
        this.añoCursando = "No establecido";
    }

    public String getAñoCursando() {
        return añoCursando;
    }

    public void setAñoCursando(String añoCursando) {
        this.añoCursando = añoCursando;
    }
    
    public String toString() {
        return "EstudiantePregrado{ Nombre: "+ getNombre() +" Apellido: "+getApellido()+ " DNI: "+getDni()+" Institucion: "+getNombreInstitucion() +" Año cursando: " + añoCursando + '}';
    }

}
