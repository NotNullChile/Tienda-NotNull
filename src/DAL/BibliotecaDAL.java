package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BibliotecaDAL {
    
    private Conexion conn;
    
    public BibliotecaDAL(){
        conn = new Conexion();
    }
    public int insertBiblioteca(BLL.Biblioteca b){
        try
        {
            String sql = "insert into biblioteca values(?,?,?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            insert.setInt(1, b.getIdventa());
            insert.setString(2, b.getUsername());
            insert.setInt(3, b.getIdJuego());
            insert.setString(4,b.getSerie());
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public int maxJuegos(){
        try 
        {
            String sql = "select max(idventa) from biblioteca";
            PreparedStatement count = conn.crearSentencia(sql);
            ResultSet valor = count.executeQuery();
            if(valor.next())
            {
                return valor.getInt(1);
            }
            else
            {
                return -1;
            } 
        } 
        catch (SQLException e) 
        {
             return -1;
        }
    }
     
    public ArrayList <BLL.Biblioteca> ConsultarBibliotecaUsuario(String usuario){
        try
        {
            ArrayList<BLL.Biblioteca> biblio = new ArrayList<>();
            String sql = "select * from biblioteca where username = ?";
            PreparedStatement select = conn.crearSentencia(sql);
            select.setString(1, usuario);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                BLL.Biblioteca b = new BLL.Biblioteca();
                b.setIdventa(listado.getInt(1));
                b.setUsername(listado.getString(2));
                b.setIdJuego(listado.getInt(3));
                b.setSerie(listado.getString(4));
                biblio.add(b);
            }                          
            return biblio;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
     
    public ArrayList <BLL.Biblioteca> ConsultarBiblioteca(){
        try
        {
            ArrayList<BLL.Biblioteca> biblio = new ArrayList<>();
            String sql = "select * from biblioteca";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                BLL.Biblioteca b = new BLL.Biblioteca();
                b.setIdventa(listado.getInt(1));
                b.setUsername(listado.getString(2));
                b.setIdJuego(listado.getInt(3));
                b.setSerie(listado.getString(4));
                biblio.add(b);
            }                          
            return biblio;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
}      

