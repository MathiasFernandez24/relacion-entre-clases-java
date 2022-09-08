package servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroYPersonaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Perro> llenarListaPerros() {
        ArrayList<Perro> lista = new ArrayList();
        lista.add(new Perro("Mini", "Caniche", 7, 5));
        lista.add(new Perro("Moris", "Salchicha", 7, 5));
        lista.add(new Perro("Renato", "Caniche", 10, 5));
        lista.add(new Perro("Chatran", "Felino", 5, 4));
        lista.add(new Perro("Firulais", "Boxer", 10, 15));
        lista.add(new Perro("Ayudante de Santa", "Galgo", 3, 7));
        return lista;
    }

    public ArrayList<Persona> llenarListaPersonas() {
        ArrayList<Persona> lista = new ArrayList();
        lista.add(new Persona("Mathi", "Fernandez", 28, 1));
        lista.add(new Persona("Maira", "Julian", 35, 2));
        lista.add(new Persona("Joel", "Reinoso", 25, 3));
        lista.add(new Persona("Mauricio", "Alvarez", 22, 4));
        lista.add(new Persona("Marcos", "Romero", 24, 5));
        return lista;
    }

    public void adoptar(ArrayList<Perro> listaPerros, ArrayList<Perro> listaPerrosAdoptados, ArrayList<Persona> listaPersonas) {
        int x;
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre() + " que mascota desea adoptar: ");
            for (int i = 0; i < listaPerros.size(); i++) {
                System.out.println((i) + " - " + listaPerros.get(i).getNombre());

            }

            do {
                do {
                    System.out.print("Selecciona: ");
                    x = sc.nextInt();
                } while (x > 5 || x < 0);

                if (listaPerrosAdoptados.contains(listaPerros.get(x))) {
                    System.out.println("Ese perro ya tiene Dueño");
                } else {
                    System.out.println("Felicidades " + persona.getNombre() + ", adoptaste a: " + listaPerros.get(x).getNombre());
                    System.out.println("Datos de la mascota: "+listaPerros.get(x));
                    listaPerrosAdoptados.add(listaPerros.get(x));
                    persona.setPerrito(listaPerros.get(x));
                    listaPerros.get(x);
                    break;
                }

            } while (listaPerrosAdoptados.contains(listaPerros.get(x)));

//            if (x >= 0 && x <= 5) {
//                    
//                
//                
//            } else {
//                System.out.println("ERROR, Opcion no valida");
//            }
            System.out.println("");
        }
    }
}
