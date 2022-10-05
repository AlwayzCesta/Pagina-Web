/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import connection.DBConnection;
import java.sql.Statement;

/**
 *
 * @author Mailo
 */
public class DetalleOrdenController implements IDetalleOrdenController {
    
    @Override
    public String comprar(int idProducto, String username) {

        
        DBConnection con = new DBConnection();
        String sql = "Insert into detalleorden values (null,'" + username + "', '" + idProducto + "')";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

           

            

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            con.desconectar();
        }
        return "false";
    }
    @Override
    public String pagar( String username) {
        
        

        
        DBConnection con = new DBConnection();
        String sql = "DELETE FROM detalleorden WHERE username= '"+username+"'";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

           

            

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            con.desconectar();
        }
        return "false";
    }
    
}
