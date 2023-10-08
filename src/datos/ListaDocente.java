package datos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import entidades.Docente;
import java.util.ArrayList;

/**
 *
 * @author sistemas
 */
public class ListaDocente {

    private static ArrayList<Docente> listaDocentes = new ArrayList<>();

    public static void añadirDocente(Docente docente) {
        listaDocentes.add(docente);
    }

    public static void mostrarDocentes() {
        ordenarDniAscendente();
        for (Docente docente : listaDocentes) {
            System.out.println(docente.toString());
        }
    }

    private static void ordenarDniAscendente() {
        quicksortDNI(listaDocentes, 0, listaDocentes.size() - 1);
    }

    private static void quicksortDNI(ArrayList<Docente> listaDocente, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indicePivote = particionDni(listaDocente, izquierda, derecha);
            quicksortDNI(listaDocente, izquierda, indicePivote - 1);
            quicksortDNI(listaDocente, indicePivote + 1, derecha);
        }
    }

    private static int particionDni(ArrayList<Docente> listaDocente, int izquierda, int derecha) {
        String pivote = listaDocente.get(izquierda).getDni();
        int i = izquierda + 1;

        for (int j = i; j <= derecha; j++) {
            if (listaDocente.get(j).getDni().compareTo(pivote) < 0) {
                Docente temp = listaDocente.get(i);
                listaDocente.set(i, listaDocente.get(j));
                listaDocente.set(j, temp);
                i++;
            }
        }

        Docente temp = listaDocente.get(izquierda);
        listaDocente.set(izquierda, listaDocente.get(i - 1));
        listaDocente.set(i - 1, temp);

        return i - 1;
    }
}
