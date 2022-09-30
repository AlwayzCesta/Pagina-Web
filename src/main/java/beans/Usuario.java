package beans;


public class Usuario {
    private int idCliente;
    private String username;
    private String contrasena;
    private boolean rolAdministrador;
    private String nombres;
    private String apellidos;
    private String email;
    private String pais;
    private String ciudad;
    private String direccion;
    private String telefono;

    public Usuario(int idCliente, String username, String contrasena, boolean rolAdministrador, String nombres, String apellidos, String email, String pais, String ciudad, String direccion, String telefono) {
        this.idCliente = idCliente;
        this.username = username;
        this.contrasena = contrasena;
        this.rolAdministrador = rolAdministrador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isRolAdministrador() {
        return rolAdministrador;
    }

    public void setRolAdministrador(boolean rolAdministrador) {
        this.rolAdministrador = rolAdministrador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idCliente=" + idCliente + ", username=" + username + ", contrasena=" + contrasena + ", rolAdministrador=" + rolAdministrador + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", pais=" + pais + ", ciudad=" + ciudad + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }