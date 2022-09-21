package beans;
import java.sql.Date;

public class Orden {
    private int idOrden;
    private int idCliente;
    private String estado;
    private Date fechaCompra;

    public Orden(int idOrden, int idCliente, String estado, Date fechaCompra) {
        this.idOrden = idOrden;
        this.idCliente = idCliente;
        this.estado = estado;
        this.fechaCompra = fechaCompra;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", idCliente=" + idCliente + ", estado=" + estado + ", fechaCompra=" + fechaCompra + '}';
    }
    
    
    
    
}
