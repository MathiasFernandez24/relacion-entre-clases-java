
package entidades;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Revolver {
    private int posicionTambor, posicionBala;

    public Revolver() {
    }

    public Revolver(int posicionTambor, int posicionBala) {
        this.posicionTambor = posicionTambor;
        this.posicionBala = posicionBala;
    }

    public int getPosicionTambor() {
        return posicionTambor;
    }

    public void setPosicionTambor(int posicionTambor) {
        this.posicionTambor = posicionTambor;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionTambor=" + posicionTambor + ", posicionBala=" + posicionBala + '}';
    }
    
    
}
