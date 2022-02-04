/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej3;

import java.util.ArrayList;
import java.util.*;


/*
  @author $EmaS7
 */
public class ServiceAlumno {
   static Scanner read = new Scanner(System.in).useDelimiter("\n");
   public static void mostrarAlumno(ArrayList<String> alumno, ArrayList<Integer> notas){
        System.out.println("--ALUMNOS--"+"--NOTAS--");
        for (String aux : alumno) {
            System.out.println(aux.toString());
            for (Integer aux2 : notas) {   
                System.out.print(aux2.toString());
            }
        }
    }

}
