package beans;


public class Usuario {
 
    private String username;
    private String contrasena;
    private boolean rolAdministrador;
    private String nombres;
    private String apellidos;
    private String email;
    private String direccion;
    private String telefono;

    public Usuario(String username, String contrasena, boolean rolAdministrador, String nombres, String apellidos, String email, String direccion, String telefono) {
        this.username = username;
        this.contrasena = contrasena;
        this.rolAdministrador = rolAdministrador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
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
        return "Usuario{" + "username=" + username + ", contrasena=" + contrasena + ", rolAdministrador=" + rolAdministrador + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    
    }