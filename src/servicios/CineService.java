package servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import entidades.Asiento;
import entidades.Espectador;
import entidades.Sala;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CineService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Espectador> muchosEspectadores() {
        ArrayList<Espectador> s = new ArrayList();
        
        for (int i = 1; i < 89; i++) {
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
        String x = "";
        System.out.println("\n");
        for (int i = 8; i > 0; i--) {
            System.out.print("|");
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
                if (mapa.get(aux).getDisponible()) {
                    x = " ";
                } else {
                    x = "X";
                }
                System.out.print(aux + " " + x + "|");
            }
            System.out.println("");
        }
    }
    
    public void sentarEspectadorAleatoriamente(Sala sala, Espectador espectador) {
        String aux = "";
        ArrayList<String> listaKey = new ArrayList();
        sala.getHashAsientos().forEach((key, value) -> {
            if (value.getDisponible()) {
                listaKey.add(key);
            }
        });
        if (espectador.getEdad() >= sala.getPeli().getEdadMinima() && espectador.getDineroDisponible() >= sala.getPrecioEntrada()) {
            if (listaKey.isEmpty()) {
                System.out.println("ERROR, Sala llena");
            } else {
                
                Collections.shuffle(listaKey);
                sala.getHashAsientos().forEach((key, value) -> {
                    if (key.equals(listaKey.get(0))) {
                        value.setDisponible(false);
                        value.setCliente(espectador);
                    }
                });
            }
        }
        
    }
    
    public void llenarSalaDeEspectadores(ArrayList<Espectador> espectadores, Sala sala) {
        
        for (Espectador espectador : espectadores) {
            sentarEspectadorAleatoriamente(sala, espectador);
        }
        
    }
}
