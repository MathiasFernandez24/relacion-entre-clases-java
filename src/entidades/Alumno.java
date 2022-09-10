package entidades;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Alumno {

    String nombreCompleto;
    Integer dni, cantidadDeVotos;
    HashSet<Alumno> companerosVotados;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, Integer dni, Integer cantidadDeVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadDeVotos = cantidadDeVotos;
        this.companerosVotados = new HashSet();
    }

    public Alumno(String nombreCompleto, Integer dni, Integer cantidadDeVotos, HashSet<Alumno> companerosVotados) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadDeVotos = cantidadDeVotos;
        this.companerosVotados = companerosVotados;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(Integer cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public HashSet<Alumno> getCompanerosVotados() {
        return companerosVotados;
    }

    public void setCompanerosVotados(HashSet<Alumno> companerosVotados) {
        this.companerosVotados = companerosVotados;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cantidadDeVotos=" + cantidadDeVotos + '}';
    }

}
