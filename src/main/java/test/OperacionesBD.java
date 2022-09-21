package test;
import beans.Producto;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
      listarProducto();
        
    }
    public static void actualizarProducto(int id, String cantidad){
        DBConnection con = new DBConnection();
        String sql="UPDATE pelicula SET  genero = '"+cantidad+"'WHERE id="+id;
        try {
            Statement st= con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        finally{
            con.desconectar();
        }
      
    }
    public static void listarProducto(){
        DBConnection con = new DBConnection();
        String sql="SELECT * FROM producto";
        
        try {
            Statement st= con.getConnection().createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                int idProducto = rs.getInt("idProducto");
                String referencia = rs.getString("referencia");
                String nombreProducto = rs.getString("nombreProducto");
                String categoria = rs.getString("categoria");
                String descripcion = rs.getString("descripcion");
                double precio = rs.getDouble("precio");
                int unidadesDisponibles = rs.getInt("unidadesDisponibles");
                
                Producto teclados = new Producto(idProducto,referencia,nombreProducto,categoria,descripcion,precio,unidadesDisponibles);
                System.out.println(teclados.toString());
                
            }
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        finally{
            con.desconectar();
        }
      
    }
    
}
