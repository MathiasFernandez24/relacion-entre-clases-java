package entidades;

import java.util.HashMap;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Sala {
    private int nombre;
    private HashMap<String, Asiento> hashAsientos = new HashMap();
    private Pelicula peli;

    public Sala() {
    }

    public Sala(int nombre, Pelicula peli) {
        this.nombre = nombre;
        this.peli = peli;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Asiento> getHashAsientos() {
        return hashAsientos;
    }

    public void setHashAsientos(HashMap<String, Asiento> hashAsientos) {
        this.hashAsientos = hashAsientos;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombre=" + nombre + ", hashAsientos=" + hashAsientos + ", peli=" + peli + '}';
    }
    
}
