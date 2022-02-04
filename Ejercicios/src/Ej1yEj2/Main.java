

package Ej1yEj2;

import java.util.Scanner;

/**
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Perros dog = new Perros();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Perros.cargaRaza();
        Perros.mostrarRaza();
        
        
        System.out.println("Desea eliminar una raza? s/n: "); String resp = read.next();
        if(resp.equals("s")){
            System.out.println("Ingrese la raza a eliminar: "); String raza = read.next();
            Perros.eliminarRaza(raza);
        }
        System.out.println("----LISTA ORDENADA----");
        Perros.ordenaRazas();
        
    }

}
