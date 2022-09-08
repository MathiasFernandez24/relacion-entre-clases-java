package pkg08.relacion.entre.clases;

import entidades.Carta;
import entidades.Perro;
import entidades.Persona;
import entidades.Revolver;
import java.util.ArrayList;
import java.util.HashMap;
import servicios.BarajaService;
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
        ejercicioExtra1();
        //ejercicioExtra3();
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
    
    public static void ejercicioExtra1(){
        PerroYPersonaService sv = new PerroYPersonaService();
        ArrayList<Perro> listaPerros = sv.llenarListaPerros();
        ArrayList<Perro> listaPerrosAdoptados = new ArrayList();
        ArrayList<Persona> listaPersonas = sv.llenarListaPersonas();
        
        sv.adoptar(listaPerros, listaPerrosAdoptados, listaPersonas);
        
        System.out.println(listaPerrosAdoptados);
        System.out.println(listaPersonas);
        
    }

    public static void ejercicioExtra3() {

        HashMap<String, Boolean> sala = new HashMap();
        llenar(sala);
        System.out.println("");
        mostrar(sala);

        System.out.println(sala);

    }

    public static void mostrar(HashMap<String, Boolean> sala) {
        String llave = "";
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        llave = i + "A";
                        break;
                    case 1:
                        llave = i + "B";
                        break;
                    case 2:
                        llave = i + "C";
                        break;
                    case 3:
                        llave = i + "D";
                        break;
                    case 4:
                        llave = i + "E";
                        break;
                    case 5:
                        llave = i + "F";
                        break;
                }
                System.out.print(sala.get(llave) + " ");
            }

            System.out.println(" ");
        }
    }

    public static void llenar(HashMap<String, Boolean> sala) {
        String llave = "";
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        llave = i + "A";
                        break;
                    case 1:
                        llave = i + "B";
                        break;
                    case 2:
                        llave = i + "C";
                        break;
                    case 3:
                        llave = i + "D";
                        break;
                    case 4:
                        llave = i + "E";
                        break;
                    case 5:
                        llave = i + "F";
                        break;
                }
                System.out.print(llave + " ");
                sala.put(llave, false);
            }
            System.out.println("");
        }
    }

}
