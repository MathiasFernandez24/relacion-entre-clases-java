
package entidades;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Pelicula {
    private String titulo, director;
    private int duracionMinutos, edadMinima;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracionMinutos, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionMinutos=" + duracionMinutos + ", edadMinima=" + edadMinima + '}';
    }
    
    
    
}
