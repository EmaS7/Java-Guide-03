/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej5;

import java.util.Objects;
import java.util.*;


/*
  @author $EmaS7
 */
public class Pais implements Comparable <Pais>{
 private String nombrePais;

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Pais() {
    }

    
    //metodoS automatico para que elimine elementos repetidos de los conjuntos
    //Si no lo ponemos, los elementos PUEDEN estar repetidos
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombrePais);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        
        if (!Objects.equals(this.nombrePais, other.nombrePais)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nombre del País: " + nombrePais;
    }

    @Override
    public int compareTo(Pais t) {
         return this.nombrePais.compareTo(t.getNombrePais());
    }

}
