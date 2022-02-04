/*Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.*/

package Ej6;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.*;
import java.util.Scanner;

/*
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        int opc;
        HashMap<String, Double> productos = new HashMap();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        do{
        System.out.println("***BIENVENIDOS A TIENDA MANOLO***");
        System.out.println("Eliga una opcion:");
        System.out.println("1)Introducir un nuevo producto");
        System.out.println("2)Modificar el precio de un producto");
        System.out.println("3)Eliminar un producto");
        System.out.println("4)Mostrar los productos en stock");
        System.out.println("5)Salir");
       
        opc=read.nextInt();
        
        switch (opc){
            case 1: 
                System.out.println("Ingrese el producto: "); String nombre = read.next().toUpperCase();
                System.out.println("Ingrese el precio: "); double precio = read.nextDouble();
                productos.put(nombre, precio);
                System.out.println("Producto correctamente agregado!");
                break;
            case 2:
                System.out.println("Ingrese el producto para cambiar su precio: "); String prod = read.next().toUpperCase();
                if(productos.containsKey(prod)){
                    System.out.println("Ingrese el nuevo precio del producto: "); double prec = read.nextDouble();
                    productos.put(prod, prec);
                    System.out.println("Precio correctamente cambiado!");
                }else
                System.out.println("No se encuentra el producto. 404 NOT FOUND");
                break;
            case 3:
                System.out.println("Ingrese el producto a eliminar: "); String elim = read.next().toUpperCase();
                if(productos.containsKey(elim))
                    productos.remove(elim);
                else
                    System.out.println("No se encuentra el producto. 404 NOT FOUND");
                break;
            case 4:
                if(productos.isEmpty())
                    System.out.println("LISTA VACIA!");
                else{
                System.out.println("PRODUCTOS EN STOCK");
                System.out.println("Producto     Precio");
                for (Map.Entry<String, Double> aux : productos.entrySet()) {
                    String key = aux.getKey();
                    Double value = aux.getValue();
                    System.out.println(key +"           $"+value);
                   }
                }
                break;
            case 5:
                System.out.println("Gracias por utilizar el programa <3");
                break;
            default:
                System.out.println("Incorrecto, ingrese una opcion valida por favor!");
                break;
        }
        
        limpiar();
        
      }while(opc != 5);

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
