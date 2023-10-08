
package datos;
import java.util.ArrayList;
import entidades.EstudiantePregrado;
import entidades.EstudiantePosgrado;
import entidades.Estudiante;

public class ListaEstudiantes {
    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private static ArrayList<EstudiantePosgrado> listaEstudiantePosgrados = new ArrayList<>();
    
    public static void agregarEstudiante(Estudiante estudiante){
        if (estudiante instanceof EstudiantePosgrado){
            listaEstudiantes.add((EstudiantePosgrado) estudiante);
        } else {
            listaEstudiantes.add((EstudiantePregrado) estudiante);
        }
    }
    
    public static void listarEstudiantesInstitucion(String nombre){
        for (Estudiante estudiante : listaEstudiantes){
            if(estudiante.getNombreInstitucion().equals(nombre)){
                System.out.println(estudiante.toString());
            }
        }
    }
    
    public static void listarEstudiantesPosgrado(){
        ordenarEstudiantesPosgradoPorMaestria();
        for (EstudiantePosgrado estudiante: listaEstudiantePosgrados){
            System.out.println(estudiante.toString());
        }
    }
    
    private static void ordenarEstudiantesPosgradoPorMaestria(){
        quicksortMaestria(listaEstudiantePosgrados, 0, listaEstudiantePosgrados.size() - 1);
    }

    private static void quicksortMaestria(ArrayList <EstudiantePosgrado> listaEstudiante, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indicePivote = particionMaestria(listaEstudiante, izquierda, derecha);
            quicksortMaestria(listaEstudiante, izquierda, indicePivote - 1);
            quicksortMaestria(listaEstudiante, indicePivote + 1, derecha);
        }
    }
    
    private static int particionMaestria(ArrayList <EstudiantePosgrado> listaEstudiante, int izquierda, int derecha) {
        String pivote = listaEstudiante.get(izquierda).getNombreMaestria();
        int i = izquierda + 1;
    
        for (int j = i; j <= derecha; j++) {
            if (listaEstudiante.get(j).getNombreInstitucion().compareTo(pivote) < 0) {
                EstudiantePosgrado temp = listaEstudiante.get(i);
                listaEstudiante.set(i, listaEstudiante.get(j));
                listaEstudiante.set(j, temp);
                i++;
            }
        }
    
        EstudiantePosgrado temp = listaEstudiante.get(izquierda);
        listaEstudiante.set(izquierda, listaEstudiante.get(i-1));
        listaEstudiante.set(i-1, temp);
    
        return i - 1;
    } 

}
