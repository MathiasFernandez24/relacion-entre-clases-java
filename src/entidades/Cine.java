package entidades;

import java.util.ArrayList;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Cine {

    private ArrayList<Sala> arrayListSalas = new ArrayList();

    public Cine() {
    }

    public ArrayList<Sala> getArrayListSalas() {
        return arrayListSalas;
    }

    public void setArrayListSalas(ArrayList<Sala> arrayListSalas) {
        this.arrayListSalas = arrayListSalas;
    }

    @Override
    public String toString() {
        return "Cine{" + "arrayListSalas=" + arrayListSalas + '}';
    }

}
