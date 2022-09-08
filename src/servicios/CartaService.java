package servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import entidades.Carta;
import java.util.Scanner;

public class CartaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Carta crearCarta(Integer numero, String palo) {
        Carta carta = new Carta();
        carta.setNumero(numero);
        carta.setPalo(palo);
        return carta;
    }
    
}
