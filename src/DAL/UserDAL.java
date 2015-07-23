package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class UserDAL {
    
    private Conexion conn;
    
    public UserDAL(){
        conn = new Conexion();
    }
    
    public int insertUser(BLL.User u){
        try
        {
            String sql = "insert into cliente values(?,?,?,?,?,?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            insert.setString(1,u.getNuevoUser());
            insert.setString(2, u.getPwNuevoUser());
            insert.setInt(3, u.getRut());
            insert.setString(4, u.getNombre());
            insert.setString(5, u.getApellido());
            insert.setString(6, u.getFechaNacimiento());
            insert.setInt(7, u.getBilletera());
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public BLL.User buscarUser(String username){
        try
        {
            String sql = "select * from cliente where username = ?";
            PreparedStatement search = conn.crearSentencia(sql);
            search.setString(1, username);
            ResultSet User = search.executeQuery();
            if(User.next())
            {
                BLL.User u = new BLL.User();
                u.setNuevoUser(User.getString(1));
                u.setPwNuevoUser(User.getString(2));
                u.setRut(User.getInt(3));
                u.setNombre(User.getString(4));
                u.setApellido(User.getString(5));
                u.setFechaNacimiento(User.getString(6));
                u.setBilletera(User.getInt(7));
                return u;
            }
            else
            {
                return null;
            }
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public int updateBilleteraUser(int billetera, String username){
        try
        {
            String sql = "update cliente set billetera = billetera + ? where username = ?";
            PreparedStatement update = conn.crearSentencia(sql);
            update.setInt(1, billetera);
            update.setString(2, username);
            return update.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    
    
     public ArrayList <BLL.User> ConsultarUser(){
        try
        {
            ArrayList<BLL.User> user = new ArrayList<>();
            String sql = "select * from cliente";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                BLL.User u = new BLL.User();
                u.setNuevoUser(listado.getString(1));
                u.setPwNuevoUser(listado.getString(2));
                u.setRut(listado.getInt(3));
                u.setNombre(listado.getString(4));
                u.setApellido(listado.getString(5));
                u.setFechaNacimiento(listado.getString(6));
                u.setBilletera(listado.getInt(7)); 
                user.add(u);
            }
            return user;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
}