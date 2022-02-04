/*Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.*/

package Ej3Extras;

import java.util.Objects;


/*
  @author $EmaS7
 */
public class Libro {
    private String titulo;
    private String autor;
    private Integer numEjemplares;
    private Integer numEjemPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numEjemplares, Integer numEjemPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemPrestados = numEjemPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(Integer numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public Integer getNumEjemPrestados() {
        return numEjemPrestados;
    }

    public void setNumEjemPrestados(Integer numEjemPrestados) {
        this.numEjemPrestados = numEjemPrestados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.titulo);
        hash = 71 * hash + Objects.hashCode(this.autor);
        hash = 71 * hash + Objects.hashCode(this.numEjemplares);
        hash = 71 * hash + Objects.hashCode(this.numEjemPrestados);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.numEjemplares, other.numEjemplares)) {
            return false;
        }
        if (!Objects.equals(this.numEjemPrestados, other.numEjemPrestados)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo = " + titulo + ", Autor = " + autor + ", numero de Ejemplares = " + numEjemplares + ", numero de Ejemplares Prestados = " + numEjemPrestados + '}';
    }
    
    

}
