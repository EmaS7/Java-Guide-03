/*Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.*/

package Ej3Extras;

import java.awt.AWTException;
import java.util.*;


/**
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        HashSet<Libro> listaLibro = new HashSet();
        Libro libro;
        String resp;
        do{
           libro = new Libro();
            System.out.println("Ingrese el titulo del libro: "); libro.setTitulo(read.next().toUpperCase()); 
            System.out.println("Ingrese el autor del libro: "); libro.setAutor(read.next().toUpperCase());
            System.out.println("Ingrese el numero de ejemplares: "); libro.setNumEjemplares(read.nextInt());
            libro.setNumEjemPrestados(0);
           listaLibro.add(libro);
            System.out.println("Desea ingresar otro libro? si/no: "); resp = read.next().toLowerCase();
        }while(resp.equalsIgnoreCase("si"));
        
        ServiceLibro.limpiar();
        ServiceLibro.menuBiblioteca(listaLibro);

    }

}
