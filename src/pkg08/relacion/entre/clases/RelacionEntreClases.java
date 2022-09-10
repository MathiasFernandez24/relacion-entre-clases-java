package pkg08.relacion.entre.clases;

import entidades.Alumno;
import entidades.Carta;
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Perro;
import entidades.Persona;
import entidades.Revolver;
import entidades.Sala;
import entidades.Simulador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import servicios.BarajaService;
import servicios.CineService;
import servicios.PerroYPersonaService;
import servicios.RevolverService;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class RelacionEntreClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicioExtra1();
        //ejercicioExtra2();
        ejercicioExtra4();
    }

    public static void ejercicio1() {
        Perro pr1 = new Perro("Mini", "Caniche", 7, 5);
        Perro pr2 = new Perro("Moris", "Salchicha", 7, 5);
        Persona p1 = new Persona("Mathi", "Fernandez", 28, 37649242, pr1);
        Persona p2 = new Persona("Meli", "Aguilera", 26, 38592187, pr2);

        mostrar(p1);
        mostrar(p2);
    }

    public static void mostrar(Persona p) {
        System.out.println(p.getNombre() + " " + p.getApellido() + ", DNI: " + p.getDni() + ", tiene " + p.getEdad() + " años y tiene una mascota, sus datos son:\n" + p.getPerrito() + "\n");
    }

    public static void ejercicio2() {
        RevolverService sv = new RevolverService();
        Revolver arma = sv.crearRevolver();
        sv.toString(arma);

        sv.girarTambor(arma);
        sv.gatillar(arma);
        sv.toString(arma);

        sv.girarTambor(arma);
        sv.gatillar(arma);
        sv.toString(arma);

        sv.girarTambor(arma);
        sv.gatillar(arma);
        sv.toString(arma);

        sv.girarTambor(arma);
        sv.gatillar(arma);
        sv.toString(arma);

        sv.girarTambor(arma);
        sv.gatillar(arma);
        sv.toString(arma);

        sv.girarTambor(arma);
        sv.gatillar(arma);
        sv.toString(arma);

    }

    public static void ejercicio3() {
        BarajaService sv = new BarajaService();
        ArrayList<Carta> mazo = sv.llenarBaraja();
        ArrayList<Carta> mazoDescarte = new ArrayList();

        sv.mostrarBaraja(mazo);
        sv.mezclarBaraja(mazo);
        System.out.println("---------------");
        sv.mostrarBaraja(mazo);

        sv.sacarCarta(mazo, mazoDescarte);
        sv.sacarCarta(mazo, mazoDescarte);
        sv.sacarCarta(mazo, mazoDescarte);
        sv.sacarCarta(mazo, mazoDescarte);

        sv.mostrarBaraja(mazo);
        System.out.println("-------------------");
        sv.mostrarBaraja(mazoDescarte);

        sv.cartasDisponibles(mazo);
        sv.darCartas(mazo, mazoDescarte);
        sv.cartasDisponibles(mazo);
        sv.cartasMonton(mazoDescarte);
        System.out.println("----");
        sv.mostrarBaraja(mazo);
    }

    public static void ejercicioExtra1() {
        PerroYPersonaService sv = new PerroYPersonaService();
        ArrayList<Perro> listaPerros = sv.llenarListaPerros();
        ArrayList<Perro> listaPerrosAdoptados = new ArrayList();
        ArrayList<Persona> listaPersonas = sv.llenarListaPersonas();

        sv.adoptar(listaPerros, listaPerrosAdoptados, listaPersonas);

        System.out.println(listaPerrosAdoptados);
        System.out.println(listaPersonas);

    }

    public static void ejercicioExtra2() {
        CineService sv = new CineService();
        ArrayList<Espectador> listaEspectadores = sv.muchosEspectadores();
        Sala sala1 = new Sala();
        sala1.setPeli(new Pelicula());
        sala1.setHashAsientos(sv.crearHashMapAsientos());

        sv.mostrarOrdenadoHashMapAsientos(sala1.getHashAsientos());
        sv.llenarSalaDeEspectadores(listaEspectadores, sala1);
        sv.mostrarOrdenadoHashMapAsientos(sala1.getHashAsientos());

        //muestra el contenido de la silla 1A, para corroborar datos
        System.out.println(sala1.getHashAsientos().get("1A"));
    }

    public static void ejercicioExtra4() {
        Simulador sv = new Simulador();
        ArrayList<Alumno> listaAlumnos = sv.generarListaAlumnos();
        listaAlumnos.forEach((a) -> System.out.println(a));
        sv.votacion(listaAlumnos);
    }
}
