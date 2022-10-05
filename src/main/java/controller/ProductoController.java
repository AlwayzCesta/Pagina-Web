/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import beans.Producto;
import com.google.gson.Gson;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoController implements IProductoController {
    
    @Override
    public String listar(String username) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select l.idProducto, l.referencia, l.nombreProducto , l.categoria , l.precio , l.unidadesDisponibles from producto l "
                        + "inner join detalleOrden d on l.idProducto = d.idProducto inner join usuario u on d.username = u.username where d.username ='" + username + "'";

      

        List<String> teclados = new ArrayList<String>();

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                int idProducto = rs.getInt("idProducto");
                String referencia = rs.getString("referencia");
                String nombreProducto = rs.getString("nombreProducto");
                String categoria = rs.getString("categoria");
                int unidadesDisponibles = rs.getInt("unidadesDisponibles");
                double precio = rs.getDouble("precio");

                Producto teclado = new Producto(idProducto,referencia,nombreProducto,categoria, precio,unidadesDisponibles);

                teclados.add(gson.toJson(teclado));

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return gson.toJson(teclados);

    }
    
}
