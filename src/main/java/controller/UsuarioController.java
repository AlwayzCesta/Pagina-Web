package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;

import beans.Usuario;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController {

    @Override
    public String login(String username, String contrasena) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();

        String sql = "Select * from usuario where username = '" + username
                + "' and contrasena = '" + contrasena + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                
                boolean rolAdministrador = rs.getBoolean("rolAdministrador");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");

                Usuario usuario
                        = new Usuario(username, contrasena, rolAdministrador, nombres, apellidos, email, direccion, telefono);

                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
    public String register(String username, String contrasena, String nombres, String apellidos, String email, String direccion, String telefono) {
        
        
        
       Gson gson = new Gson();

        DBConnection con = new DBConnection();
        
        
        String sql = "Insert into usuario values('" + username + "', '" + contrasena + "','0', '" + nombres
                + "', '" + apellidos + "', '" + email + "', '" + direccion + "', '" + telefono + "')";
        

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            boolean rolAdministrador = false;
            
            Usuario usuario = new Usuario(username, contrasena, rolAdministrador, nombres, apellidos, email, direccion, telefono);

            st.close();

            return gson.toJson(usuario);
             
  
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";
    }
    @Override
    public String pedir(String username) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from usuario where username = '" + username + "'";

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                
                boolean rolAdministrador = rs.getBoolean("rolAdministrador");
                String nombres = rs.getString("nombres");
                String contrasena = rs.getString("contrasena");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                Usuario usuario = new Usuario(username, contrasena, rolAdministrador, nombres, apellidos, email, direccion, telefono);

                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }
    public String modificar(String username,String contrasena,String email,String direccion,String telefono) {

        DBConnection con = new DBConnection();

        String sql = "Update usuario set contrasena = '" + contrasena
                +  "', email = '"+ email + "' , direccion = '"+direccion+"', telefono= '"+telefono+ "' where username = '" + username + "'";

       

       

        try {

            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            return "true";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";

    }
    

}
