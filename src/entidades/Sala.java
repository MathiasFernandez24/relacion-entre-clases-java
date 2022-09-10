package entidades;

import java.util.HashMap;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Sala {

    private int nombre, precioEntrada=500;
    private HashMap<String, Asiento> hashAsientos = new HashMap();
    private Pelicula peli;

    public Sala() {
    }

    public Sala(int nombre, int precioEntrada, Pelicula peli) {
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
        this.peli = peli;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
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
        return "Sala{" + "nombre=" + nombre + ", precioEntrada=" + precioEntrada + ", hashAsientos=" + hashAsientos + ", peli=" + peli + '}';
    }
}
