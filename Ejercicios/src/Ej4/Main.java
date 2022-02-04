

package Ej4;

import java.util.ArrayList;
import java.util.*;
import Ej4.utilidades.Comparadores;
/**
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // boolean ban;
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String resp="";
        do{
            Pelicula p = new Pelicula();
            ServiceMovie.creaPelicula(p);
            listaPeliculas.add(p);
            System.out.println("Desea cargar otra pelicula?s/n: "); resp = read.next().toLowerCase();
        }while(resp.equalsIgnoreCase("s"));

        ServiceMovie.mostrarPeliculas(listaPeliculas);
        ServiceMovie.duracionMas1Hora(listaPeliculas);
        Collections.sort(listaPeliculas, Comparadores.ordenarDuracionMayAMen);
        System.out.println("Punto 3");
        ServiceMovie.mostrarPeliculas(listaPeliculas);
        Collections.sort(listaPeliculas, Comparadores.ordenarDuracionMenAMay);
        System.out.println("Punto 4");
        ServiceMovie.mostrarPeliculas(listaPeliculas);
        Collections.sort(listaPeliculas, Comparadores.ordenarTitulo);
        System.out.println("Punto 5");
        ServiceMovie.mostrarPeliculas(listaPeliculas);
        Collections.sort(listaPeliculas, Comparadores.ordenarDirector);
        System.out.println("Punto 6");
        ServiceMovie.mostrarPeliculas(listaPeliculas);
    }

}
