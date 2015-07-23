package DAL;
//FINAL
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class VideoGameDAL {
        
    private Conexion conn;
    
    public VideoGameDAL(){
        conn = new Conexion();
    }
    public int insertVideoGame(BLL.VideoGame v){
        try
        {
            String sql = "insert into videogame values(?,?,?,?,?,?)";
            PreparedStatement insert = conn.crearSentencia(sql);
            insert.setInt   (1, v.getIdjuego());
            insert.setString(2, v.getTitulo());
            insert.setString(3, v.getDescripcion());
            insert.setInt   (4, v.getRestriccion());
            insert.setString(5, v.getCaratula());
            insert.setInt   (6, v.getValor());
            return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public ArrayList<BLL.VideoGame> selectVideoGames(){
        try
        {
            ArrayList<BLL.VideoGame> games = new ArrayList<>();
            String sql = "select * from videogame order by titulo asc";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            {
                ImageIcon i = new ImageIcon();
                BLL.VideoGame v = new BLL.VideoGame();
                v.setIdjuego(listado.getInt(1));
                v.setTitulo(listado.getString(2));
                v.setDescripcion(listado.getString(3));
                v.setRestriccion(listado.getInt(4));
                v.setCaratula(listado.getString(5));
                v.setValor(listado.getInt(6));
                
                games.add(v);
            }
            return games;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    
    
      public int maxJuegos(){
         try 
         {
            String sql = "select max(idjuego) from videogame";
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
         } catch (SQLException e) 
         {
             return -1;
         }
     }  
      
      public String tituloJuego(int idjuego){
         try 
         {
            String sql = "select v.titulo\n" +
                         "from biblioteca b inner join videogame v\n" +
                         "on b.idjuego = v.idjuego\n" +
                         "where b.idjuego = ? \n" +
                         "group by v.titulo";
            PreparedStatement select = conn.crearSentencia(sql);
            select.setInt(1, idjuego);
            ResultSet valor = select.executeQuery();
            if(valor.next())
            {
                return valor.getString(1);
            }
            else
            {
                return null;
            } 
         } catch (SQLException e) 
         {
             return null;
         }
     } 
}
