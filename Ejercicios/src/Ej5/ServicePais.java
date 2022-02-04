/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej5;


import java.util.Iterator;
import java.util.*;


/*
  @author $EmaS7
 */
public class ServicePais {
    static Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public static Pais crearPais() {
        Pais p = new Pais();
        System.out.println("Ingrese el nombre del pais");
        p.setNombrePais(read.next().toUpperCase());
        return p;
    }
    
    public static void mostrarPaises(ArrayList<Pais> paises) {
        System.out.println("\nLISTA DE PAISES (ordenados alfabeticamente)");
        for (Pais p : paises) {
            System.out.println(" " + p);
        }
    }
    
//    public static void eliminaPais(String paisElim){
//        Iterator<String> it = paises.iterator();
//         System.out.println("Desea eliminar un pais? s/n"); resp = read.next().toLowerCase();
//        if(resp.equals("s")){
//            System.out.println("Ingrese el pais a eliminar: "); paisElim = read.next();
//            if(paises.equals(paisElim)){
//               Paises.eliminaPais(paisElim);
//               for (String pais : paises) {
//                System.out.println(pais.toString());
//        }
//           }
//        }else
//            System.out.println("No se encuentra el pais buscado :(");
//        System.out.println("Programa terminado");
//        while(it.hasNext()){
//          String aux = it.next();
//            if(aux.equals(paisElim))
//                it.remove();
//    }
    
    public static void buscarYEliminar(HashSet<Pais> paises) {
        Iterator<Pais> it = paises.iterator();  //creamos un objeto "it" de clase iterator, del tipo "pais" de nuestra clase
        String busqueda;
        boolean bandera = false;

        System.out.println("\nIngrese el país a buscar");
        busqueda = read.next().toUpperCase();
        while (it.hasNext()) { //le damos comienzo al bucle del iterator
            if (it.next().getNombrePais().equals(busqueda)) {
                bandera = true;
                System.out.println("\nSe encontró el país " + busqueda + " en la lista");
                it.remove(); //borra el país de la lista
                System.out.println("--- El país " + busqueda + " a sido borrado ---");
            }
        }

        if (bandera == false) {
            System.out.println("\nEl país " + busqueda + " no está en la lista. La lista sigue quedando:");
        }
       // mostrarPaises();
    }
    public static Comparator<Pais> ordenarPais = new Comparator<Pais>(){
        @Override
        public int compare(Pais p1, Pais p2){
            return p1.getNombrePais().compareTo(p2.getNombrePais());
        }
    };
}
