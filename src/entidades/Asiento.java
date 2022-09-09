package entidades;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Asiento {
    private Boolean disponible=true;
    private Espectador cliente;

    public Asiento() {
    }

    public Asiento(Espectador cliente) {
        this.cliente = cliente;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Espectador getCliente() {
        return cliente;
    }

    public void setCliente(Espectador cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Asiento{" + "disponible=" + disponible + ", cliente=" + cliente + '}';
    }
    
    
}
