
package entidades;

import java.util.ArrayList;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Voto {
    Alumno alumno;
    ArrayList<Alumno> companerosVotados;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> companerosVotados) {
        this.alumno = alumno;
        this.companerosVotados = companerosVotados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getCompanerosVotados() {
        return companerosVotados;
    }

    public void setCompanerosVotados(ArrayList<Alumno> companerosVotados) {
        this.companerosVotados = companerosVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", companerosVotados=" + companerosVotados + '}';
    }
    
}
