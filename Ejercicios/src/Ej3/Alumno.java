/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
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


/*
  @author $EmaS7
 */
public class Alumno {
    private ArrayList<String> nombre;   //= new ArrayList();
    private HashSet<Integer> notas;    //= new HashSet();

    public Alumno(ArrayList<String> nombre, HashSet<Integer> notas){
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public Alumno(){
        nombre = new ArrayList();
        notas = new HashSet();
    }

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

    public HashSet<Integer> getNotas() {
        return notas;
    }

    public void setNotas(HashSet<Integer> notas) {
        this.notas = notas;
    }
    
    public void mostrarAlumno(){
        System.out.println("--ALUMNOS--"+"--NOTAS--");
        for (String aux : nombre) {
            System.out.println(aux.toString());
            for (Integer aux2 : notas) {   
                System.out.print(aux2.toString());
            }
        }
    }
    public Integer notaFinal(String alumno){
        Integer calc=0;
        for (String aux : nombre) {
            if(aux.equals(alumno)){
                for (Integer aux2 : notas) {
                    calc += aux2;
                }
            }
        }
        return calc/3;
    }
  }
