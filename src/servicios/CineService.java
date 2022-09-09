package servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import entidades.Asiento;
import entidades.Espectador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CineService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Espectador> muchosEspectadores() {
        ArrayList<Espectador> s = new ArrayList();

        for (int i = 1; i < 21; i++) {
            s.add(new Espectador("Espectador " + i, ThreadLocalRandom.current().nextInt(15, 81), ThreadLocalRandom.current().nextInt(200, 1001)));
        }
        return s;
    }

    public HashMap<String, Asiento> crearHashMapAsientos() {
        HashMap<String, Asiento> r = new HashMap();
        String aux = "";
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 7; j++) {
                switch (j) {
                    case 1:
                        aux = i + "A";
                        break;
                    case 2:
                        aux = i + "B";
                        break;
                    case 3:
                        aux = i + "C";
                        break;
                    case 4:
                        aux = i + "D";
                        break;
                    case 5:
                        aux = i + "E";
                        break;
                    case 6:
                        aux = i + "F";
                        break;
                }
                r.put(aux, new Asiento());
            }
        }
        return r;
    }
    
       public void mostrarOrdenadoHashMapAsientos(HashMap<String, Asiento> mapa) {
        String aux = "";
        for (int i = 8; i > 0; i--) {
            for (int j = 1; j < 7; j++) {
                switch (j) {
                    case 1:
                        aux = i + "A";
                        break;
                    case 2:
                        aux = i + "B";
                        break;
                    case 3:
                        aux = i + "C";
                        break;
                    case 4:
                        aux = i + "D";
                        break;
                    case 5:
                        aux = i + "E";
                        break;
                    case 6:
                        aux = i + "F";
                        break;
                }
                System.out.print(aux+""+mapa.get(aux).getDisponible()+" ");
            }
            System.out.println("");
        }
    }
}
