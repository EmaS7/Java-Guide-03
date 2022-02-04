/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej4.utilidades;

import java.util.*;
import Ej4.Pelicula;

/*
  @author $EmaS7
 */
public class Comparadores {
    public static Comparator<Pelicula> ordenarDuracionMayAMen = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p2.getHoras().compareTo(p1.getHoras());
        }
    };
    public static Comparator<Pelicula> ordenarDuracionMenAMay = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getHoras().compareTo(p2.getHoras());
        }
    };
     public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
      public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };

}
