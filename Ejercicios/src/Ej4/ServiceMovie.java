/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej4;
import java.util.*;

/*
  @author $EmaS7
 */
public class ServiceMovie {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");
    public static void creaPelicula(Pelicula p){
       System.out.println("Ingrese el titulo de la pelicula: "); p.setTitulo(read.next());
       System.out.println("Ingrese el director: "); p.setDirector(read.next());
       System.out.println("Duracion(en horas):"); p.setHoras(read.nextDouble());
       
    }
    
    public static void mostrarPeliculas(ArrayList <Pelicula> peli){
        for (Pelicula pelicula : peli) {
            System.out.println(pelicula.toString());
        }
    }
     public static void duracionMas1Hora(ArrayList <Pelicula> peli){
        for (Pelicula pelicula : peli) {
           if(pelicula.getHoras()>1){
               System.out.println("Peliculas con mas de 1 hora de duracion: ");
               System.out.println(pelicula.toString());
           }
        }
    }
     
}
