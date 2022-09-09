
package entidades;

import java.util.ArrayList;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Cine {
    private ArrayList<Sala> arrayListSalas = new ArrayList();
    private int precioEntrada;

    public Cine() {
    }

    public Cine(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<Sala> getArrayListSalas() {
        return arrayListSalas;
    }

    public void setArrayListSalas(ArrayList<Sala> arrayListSalas) {
        this.arrayListSalas = arrayListSalas;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "arrayListSalas=" + arrayListSalas + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
    
}
