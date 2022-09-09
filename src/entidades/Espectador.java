
package entidades;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Espectador {
    private String nombre;
    private int edad, dineroDisponible;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, int dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(int dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible + '}';
    }
    
    
}
