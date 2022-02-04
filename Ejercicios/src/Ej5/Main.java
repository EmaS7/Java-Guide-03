/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.*/

package Ej5;

import static Ej5.ServicePais.ordenarPais;
import java.util.*;

/**
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashSet<Pais> paises = new HashSet();//usamos un conjunto treeSet
       ArrayList<Pais> listaPais;
       Scanner read = new Scanner (System.in).useDelimiter("\n");
       String rta;
       
       do{
           paises.add(ServicePais.crearPais()); //este metodo de clase servicio retorna un objeto de nuestra clase Pais, que se agreega a la lista
           System.out.println("Desea ingresar un nuevo país?");
           rta = read.next();
       }while (rta.equalsIgnoreCase("si") || (rta.equalsIgnoreCase("s")));
       listaPais = new ArrayList(paises); 
       listaPais.sort(ordenarPais);
       ServicePais.mostrarPaises(listaPais);
       System.out.println("Desea eliminar un pais?s/n: "); String resp = read.next();
       if(resp.equalsIgnoreCase("s"))
          ServicePais.buscarYEliminar(paises);
        else
            System.out.println("Gracias por usar el programa<3");
      
    }
    
    

}
