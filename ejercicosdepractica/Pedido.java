package ejercicosdepractica;

import java.util.Date;
import java.util.List;

public class Pedido {
    
    private Cliente1 cliente;    
    private List<Productos> productos;  
    private Date fecha;
    private int numeroTarjetaC;

    public Pedido(Cliente1 cliente, List<Productos> productos, Date fecha, int numeroTarjetaC) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaC = numeroTarjetaC;
    }

    public Cliente1 getCliente() {
        return cliente;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getNumeroTarjetaC() {
        return numeroTarjetaC;
    }

    public void setCliente(Cliente1 cliente) {
        this.cliente = cliente;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNumeroTarjetaC(int numeroTarjetaC) {
        this.numeroTarjetaC = numeroTarjetaC;
    }       

    public String toString() {
        return "Pedido{" + "cliente=" + cliente + ", productos=" + productos + ", fecha=" + fecha + ", numeroTarjetaC=" + numeroTarjetaC + '}';
    }
}
