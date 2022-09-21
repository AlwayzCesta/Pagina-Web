package beans;

public class Producto {
    private int idProducto;
    private String referencia;
    private String nombreProducto;
    private String categoria;
    private String descripcion;
    private double precio;
    private int unidadesDisponibles;

    public Producto(int idProducto, String referencia, String nombreProducto, String categoria, String descripcion, double precio, int unidadesDisponibles) {
        this.idProducto = idProducto;
        this.referencia = referencia;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", referencia=" + referencia + ", nombreProducto=" + nombreProducto + ", categoria=" + categoria + ", descripcion=" + descripcion + ", precio=" + precio + ", unidadesDisponibles=" + unidadesDisponibles + '}';
    }
    
    
}
