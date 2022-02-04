/*Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.*/

package Ej3;

import java.util.ArrayList;
import java.util.HashSet;
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
        ArrayList<String> alumnos = new ArrayList();
        HashSet<Integer> notas = new HashSet();
        String resp="";
        String buscaAlumno;
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Alumno al;
        do{
           // notas.clear();
            al = new Alumno();
            System.out.println("Ingrese el nombre del alumno: "); alumnos.add(read.next());
            al.setNombre(alumnos);
            for(int i=0; i<3; i++){
                System.out.println("Indique la" +(i+1)+ "Nota: "); notas.add(read.nextInt());
                for (Integer aux : notas) {
                    if(aux<=0 || aux>=11){
                        System.out.println("Error, debe igresar una nota entre 1 y 10");
                        notas.add(read.nextInt());
                }else
                    al.setNotas(notas);   
               }
            }
             notas.clear();
            
           /* System.out.println("Ingrese nota 1: "); notas.add(read.nextInt());
            al.setNotas(notas);
            System.out.println("Ingrese nota 2: "); notas.add(read.nextInt());
            al.setNotas(notas);
            System.out.println("Ingrese nota 3: "); notas.add(read.nextInt());
            al.setNotas(notas);*/
           
            System.out.println("Desea agreagar otro alumno? s/n: "); resp = read.next();
        }while(resp.equals("s"));
        
        Integer calc;
//        calc = Alumno.notaFinal(buscaAlumno);
        System.out.println("Ingrese el nombre del alumno para buscar su nota"); buscaAlumno = read.next();
        for (String aux : al.getNombre()) {
            if(aux.equals(buscaAlumno)){
                calc = al.notaFinal(buscaAlumno);
                System.out.println("La nota final del alumno es: "+calc);
                break;
            }else 
                System.out.println("No se encuentra el alumno buscado :( ");
        }
        
// Alumno.mostrarAlumno();
        

    }
}
        

