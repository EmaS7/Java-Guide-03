/*Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.*/

package Ej2Extras;

import java.awt.AWTException;
import java.awt.Robot;
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
        ArrayList<CantanteFamoso> listaCantante = new ArrayList(); 
        CantanteFamoso cantante;
        int cont=1,opc;
        do{
            cantante = new CantanteFamoso();
            System.out.println("Ingrese el nombre del artista "+cont+": "); cantante.setNombre(read.next().toUpperCase());
            System.out.println("Ingrese el disco con mas ventas del artista: "); cantante.setDiscoConMasVentas(read.next().toUpperCase());
            listaCantante.add(cantante);
            cont+=1;
        }while(listaCantante.size()!=5); //ver si agrega 5 o 6
        for (CantanteFamoso aux : listaCantante) {
            System.out.println(aux.toString());
        }
        limpiar();
     //   do{
        System.out.println("Que desea hacer ahora??");
        System.out.println("Eliga una opcion:");
        System.out.println("1)Agregar un nuevo cantante(solo 1)");
        System.out.println("2)Mostrar todos los artistas");
        System.out.println("3)Eliminar un artista");
        System.out.println("4)Salir");

        opc=read.nextInt();
        switch (opc){
            case 1:
                cantante = new CantanteFamoso();  //PREGUNTAR:  Porque si no creo el objeto en esta opcion me sale repetido en la lista. 
                System.out.println("Ingrese el nombre del artista "+cont+": "); cantante.setNombre(read.next().toUpperCase());
                System.out.println("Ingrese el disco con mas ventas del artista: "); cantante.setDiscoConMasVentas(read.next().toUpperCase());
                listaCantante.add(cantante);
                break;
            case 2:
                System.out.println("Lista de artistas ingresados:");
                for (CantanteFamoso aux : listaCantante) {
                System.out.println(aux.toString());
                }
                break;
            case 3:
                System.out.println("Ingrese el artista a eliminar: "); String elim = read.next().toUpperCase();
                listaCantante.remove(elim);
                break;
            case 4:
                System.out.println("Gracias por utilizar el programa");
                break;
            default:
                System.out.println("Ingrese una opcion valida. 404 NOT FOUND");
                break;
            }
           limpiar();
   //   }while(opc != 5);
        System.out.println("Lista modificada: ");
        for (CantanteFamoso aux : listaCantante) {
                System.out.println(aux.toString());
                }
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
