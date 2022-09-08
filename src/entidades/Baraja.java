
package entidades;

import java.util.ArrayList;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Baraja {
    ArrayList<Carta> baraja = new ArrayList();

    public Baraja() {
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }
    
}
