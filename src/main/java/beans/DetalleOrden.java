package beans;

public class DetalleOrden {
    private int idDetalleOrden;
    private int idOrden;
    private int idProducto;
    private int cantidad;

    public DetalleOrden(int idDetalleOrden, int idOrden, int idProducto, int cantidad) {
        this.idDetalleOrden = idDetalleOrden;
        this.idOrden = idOrden;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public int getIdDetalleOrden() {
        return idDetalleOrden;
    }

    public void setIdDetalleOrden(int idDetalleOrden) {
        this.idDetalleOrden = idDetalleOrden;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleOrden{" + "idDetalleOrden=" + idDetalleOrden + ", idOrden=" + idOrden + ", idProducto=" + idProducto + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
