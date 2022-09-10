package entidades;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Simulador {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    List<String> nombres = Arrays.asList("Ariel", "Bernardo", "Cristian", "Daniel", "Ezequiel", "Franco", "Gustavo", "Hernan", "Ismael", "Javier");
    List<String> apellidos = Arrays.asList("Aguilera", "Bartolome", "Castro", "Dumanzic", "E", "Fernandez", "Giaccaglia", "H", "Iruca", "J");

    public ArrayList<Alumno> generarListaAlumnos() {
        System.out.print("Cantidad de Alumnos a crear: ");
        int cantAlumnos = sc.nextInt();
        ArrayList<Alumno> a = new ArrayList();
        ArrayList<Integer> dnis = new ArrayList();
        int dniRandom = 0;
        String nombre = "";
        for (int i = 0; i < cantAlumnos; i++) {

            while (true) {
                dniRandom = ThreadLocalRandom.current().nextInt(10000000, 40000000);
                if (dnis.contains(dniRandom)) {
                    System.out.println("Generar nuevo DNI, alumno " + i);
                } else {
                    dnis.add(dniRandom);
                    break;
                }
            }
            Collections.shuffle(nombres);
            Collections.shuffle(apellidos);
            nombre = nombres.get(0) + " " + apellidos.get(0);
            a.add(new Alumno(nombre, dniRandom, 0));
        }
        return a;
    }
    
    //Incompleto
    public void votacion(ArrayList<Alumno> listaAlumnos) {
        for (Alumno alumno : listaAlumnos) {
            
        }
    }
}
