/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).*/

package Ej1Extras;

//import java.util.ArrayList;
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
        ArrayList<Integer> num = new ArrayList();
        Scanner read = new Scanner(System.in);
        int numLectura;
        do{
            System.out.println("Ingrese in valor numerico entero(Ingrese -99 para terminar): "); numLectura=read.nextInt();
            if(numLectura != -99){
                num.add(numLectura);
            }
        }while(numLectura != -99);
        for (Integer aux : num) {
            System.out.println(aux);
        }
        sumaLista(num);
        promedioLista(num);

    }
    
    public static void sumaLista(ArrayList<Integer> suma){
        int calc=0;
        int num1;     //this is
        int num2;    //     just fot test 
        
        for (Integer aux : suma) {
            calc += aux;
        }
        System.out.println("La suma de todos los numeros de la lista es: "+calc);
    }
    public static void promedioLista(ArrayList<Integer> prom){   //fijarse lo del promedio, pq no muestra todos los decimales
        Integer calc = 0;
        int cont=0;
        double promedio;
        for (int i = 0; i < prom.size(); i++) {
            calc=calc+prom.get(i);
            cont+=1;
        }
        promedio = calc/cont;
        System.out.println("El promedio es: "+promedio);
    }

}
