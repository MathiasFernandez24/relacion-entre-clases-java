package servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import entidades.Revolver;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RevolverService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Revolver crearRevolver() {
        Revolver arma = new Revolver();
        girarYCargar(arma);
        return arma;
    }

    public void girarYCargar(Revolver r) {
        r.setPosicionBala(ThreadLocalRandom.current().nextInt(1, 7));
        r.setPosicionTambor(ThreadLocalRandom.current().nextInt(1, 7));
    }

    public Boolean gatillar(Revolver r) {
        if (r.getPosicionBala() == r.getPosicionTambor()) {
            r.setPosicionBala(0);
            return true;
        } else {
            return false;
        }
    }
    public void girarTambor(Revolver r){
        r.setPosicionTambor(r.getPosicionTambor()+1);
        if (r.getPosicionTambor()>6) {
            r.setPosicionTambor(1);
        }
    }
    public void toString(Revolver r){
        System.out.println("Posicion tambor: "+r.getPosicionTambor());
        System.out.println("Posicion bala  : "+r.getPosicionBala()+"\n");
    }
}
