/*
Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */

package Ej3Extras;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.*;

/*
  @author $EmaS7
 */
public class ServiceLibro {
    static Scanner read = new Scanner(System.in).useDelimiter("\n");
    public static boolean prestamo(HashSet<Libro> l){
        boolean var=false;
        String busca;
        System.out.println("Ingrese el nombre del libro que quiere prestar: "); busca=read.next();
        for (Libro lib : l) {
         if(busca.equalsIgnoreCase(lib.getTitulo())){
            System.out.println("Libro "+busca+" encontrado");
            if(lib.getNumEjemplares()>0){
                lib.setNumEjemplares(lib.getNumEjemplares()-1);
                lib.setNumEjemPrestados(lib.getNumEjemPrestados()+1);
                return var = true;
            }  
        }
        
    }return var;
 }  
    public static boolean devolucion(HashSet<Libro> l){
        boolean var=false;
        String busca;
        System.out.println("Ingrese el nombre del libro que quiere devolver: "); busca=read.next();
        for (Libro lib : l) {
        if(busca.equalsIgnoreCase(lib.getTitulo())){
            System.out.println("Libro "+busca+" encontrado");
            if(lib.getNumEjemPrestados()>0){
                lib.setNumEjemPrestados(lib.getNumEjemPrestados()-1);
                lib.setNumEjemplares(lib.getNumEjemplares()+1);
                var = true;
            }
        }
        
     }return var;
    }
    public static void mostrarLibros(HashSet<Libro> l){
        System.out.println("Libros en stock");
        for (Libro aux : l) {
            System.out.println(aux+" ");
        }
    }
    
    public static void menuBiblioteca(HashSet<Libro> l) throws AWTException{
        int opc;
        
        do{
        System.out.println("***BIBLIOTECA MUNICIPAL***");
        System.out.println("Eliga una opcion:");
        System.out.println("1)Prestar un libro");
        System.out.println("2)Devolver un libro");
        System.out.println("3)Mostrar todos los libros");
        System.out.println("4)Salir");
       
        opc=read.nextInt();
        
        switch (opc){
            case 1: 
                if(prestamo(l)==true)
                    System.out.println("Libro prestado correctamente");
                else
                    System.out.println("No se pudo prestar el libro :c");
                break;
            case 2:
                if(devolucion(l)==true)
                    System.out.println("Libro devuelto correctamente");
                else
                    System.out.println("No se ha podido devolver el libro");
                break;
            case 3:
                mostrarLibros(l);
                break;
            case 4:
                System.out.println("Gracias por utilizar el programa <3");
                break;
            default:
                System.out.println("Incorrecto, ingrese una opcion valida por favor!");
        }
        limpiar();
      }while(opc != 4);
    }
    
    public static void limpiar() throws AWTException {
        System.out.println("\nPresione Enter para continuar..."); //si uso esto, no usar pressbot.delay
        new java.util.Scanner(System.in).nextLine(); //si uso esto, no usar pressbot.delay

        Robot pressbot = new Robot();
        pressbot.setAutoDelay(1);
        //pressbot.delay(10000); por si lo quiero tener automatico sin tocar tecla, sacar las dos primeras lineas
        pressbot.keyPress(17);//orden para apretar CTRL key
        pressbot.keyPress(76);//orden para apretar L key
        pressbot.keyRelease(17); //orden para soltar CTRL key
        pressbot.keyRelease(76); //orden para soltar  key
    }

}
