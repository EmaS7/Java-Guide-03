/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.*/
/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.*/

package Ej1yEj2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


/*
  @author $EmaS7
 */
public class Perros {
    private static ArrayList<String> raza = new ArrayList();
    private static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void cargaRaza(){
        String respuesta="";
        //String razaa;
        do{
            System.out.println("Ingrese una raza de perro: "); raza.add(read.next());
           // Raza.add(razaa);
            System.out.println("Desea ingresar otra raza de perro? s/n: "); respuesta = read.next();
        }while (respuesta.equalsIgnoreCase("s"));
        
    }
    public static void mostrarRaza(){
        System.out.println("Razas ingresadas: ");
        for (String aux : raza){
          System.out.println(aux.toString());   
        }
        System.out.println("Cantidad ingresada: "+raza.size());
        
    }
    public static void eliminarRaza(String razaPerro){
     Iterator<String> it = raza.iterator();
        
        while(it.hasNext()){
            String aux = it.next();
            if(aux.equals(razaPerro))
                it.remove();
            
    }
  }
    public static void ordenaRazas(){
        Collections.sort(raza);
        for (String aux : raza) {
            System.out.println(aux.toString());
        }
    }
}
