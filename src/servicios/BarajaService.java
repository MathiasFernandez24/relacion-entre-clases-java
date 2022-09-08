package servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import entidades.Baraja;
import entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Carta> llenarBaraja() {
        ArrayList<Carta> r = new ArrayList();
        for (int i = 1; i < 13; i++) {
            if (i == 8 || i == 9) {
                continue;
            } // Luis lo hizo, crack
            r.add(new Carta(i, "Oro"));
            r.add(new Carta(i, "Copa"));
            r.add(new Carta(i, "Espada"));
            r.add(new Carta(i, "Basto"));
        }
        return r;
    }

    public void mostrarBaraja(ArrayList<Carta> mazo) {
        for (Carta carta : mazo) {
            System.out.println(carta);
        }
    }

    public void mezclarBaraja(ArrayList<Carta> mazo) {
        Collections.shuffle(mazo);
    }

    public void sacarCarta(ArrayList<Carta> mazo, ArrayList<Carta> mazoDescarte) {
        if (mazo.isEmpty()) {
            System.out.println("No quedan mas cartas");
        } else {
            System.out.println("la carta sacada es: " + mazo.get(0));
            mazoDescarte.add(mazo.get(0));
            mazo.remove(0);
        }
    }

    public void cartasDisponibles(ArrayList<Carta> mazo) {
        System.out.println("Las cartas disponibles son " + mazo.size());;
    }

    public void darCartas(ArrayList<Carta> mazo, ArrayList<Carta> mazoDescarte) {
        System.out.print("Cartas a sacar: ");
        int cantidad = sc.nextInt();
        if (mazo.size() >= cantidad) {
            for (int i = 0; i < cantidad; i++) {
                sacarCarta(mazo, mazoDescarte);
            }
        } else {
            System.out.println("Error, No hay esa catidad de cartas disponibles");
        }
    }

    public void cartasMonton(ArrayList<Carta> mazo) {
        System.out.println("Las cartas disponibles del monton son " + mazo.size());;
    }
}
