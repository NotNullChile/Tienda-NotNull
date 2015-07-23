package DAL;

import BLL.SerialNumber;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SerialNumberDAL {
    private Conexion conn;
    
    public SerialNumberDAL(){
        conn = new Conexion();
    }
    
    public int insertSerialNumber(BLL.SerialNumber s){
        try
        {
        String sql = "insert into serialnumber values(?,?,?)";
        PreparedStatement insert = conn.crearSentencia(sql);
        insert.setString(1,s.getSerie());
        insert.setInt(2,s.getEstado());
        insert.setInt(3,s.getIdjuego());
        return insert.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }      
    }
    
    public ArrayList<BLL.SerialNumber> buscarSerial(){
        try{    
        ArrayList<BLL.SerialNumber> serial = new ArrayList<>();
            String sql = "select * from serialnumber";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                BLL.SerialNumber s = new BLL.SerialNumber();
                s.setSerie(listado.getString(1));
                s.setEstado(listado.getInt(2));
                s.setIdjuego(listado.getInt(3));
                serial.add(s);
            }
            return serial;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public int updateSerialNumber(BLL.SerialNumber s){
        try
        {
            String sql = "update serialnumber set estado = 1 where serie = ?";
            PreparedStatement update = conn.crearSentencia(sql);
            update.setString(1, s.getSerie());
            
            return update.executeUpdate();
        }
        catch(SQLException e)
        {
            return e.getErrorCode();
        }
    }
    
    public ArrayList <BLL.SerialNumber> contarSeriales(){
        try
        {
            ArrayList<BLL.SerialNumber> serial = new ArrayList<>();
            String sql =    "select serie , count(serie), idjuego\n" +
                            "from serialnumber\n" +
                            "group by idjuego\n" +
                            "order by 3";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                BLL.SerialNumber s = new BLL.SerialNumber();
                s.setSerie(listado.getString(1));
                s.setEstado(listado.getInt(2));
                s.setIdjuego(listado.getInt(3));        
                serial.add(s);
            }                          
            return serial;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public ArrayList <BLL.SerialNumber> SerialesCompradas(){
        try
        {
            ArrayList<BLL.SerialNumber> serial = new ArrayList<>();
            String sql =    "select serie , count(serie), idjuego\n" +
                            "from serialnumber \n" +
                            "where estado = 1\n" +
                            "group by idjuego\n" +
                            "order by 3";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                BLL.SerialNumber s = new BLL.SerialNumber();
                s.setSerie(listado.getString(1));
                s.setEstado(listado.getInt(2));
                s.setIdjuego(listado.getInt(3));    
                serial.add(s);
            }                          
            return serial;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public ArrayList <BLL.SerialNumber> SerialesDelJuego(int idJuego){
        try
        {
            ArrayList<BLL.SerialNumber> serial = new ArrayList<>();
            String sql =    "select *\n" +
                            "from serialnumber\n" +
                            "where idjuego = ?";
            PreparedStatement select = conn.crearSentencia(sql);
            select.setInt(1, idJuego);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                BLL.SerialNumber s = new BLL.SerialNumber();
                s.setSerie(listado.getString(1));
                s.setEstado(listado.getInt(2));
                s.setIdjuego(listado.getInt(3));
                
                serial.add(s);
            }                          
            return serial;
        }
        catch(SQLException e)
        {
            return null;
        }
    }

    
    public ArrayList <BLL.SerialNumber> GananciaTotalxJuego(){
        try
        {
            ArrayList<BLL.SerialNumber> ganancia = new ArrayList<>();
            String sql =    "select v.titulo,v.valor,sum(v.valor)\n" +
                            "from videogame v inner join serialnumber s\n" +
                            "on v.idjuego = s.idjuego\n" +
                            "where s.estado = 1\n" +
                            "group by 1\n" +
                            "order by 1 asc";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                BLL.SerialNumber s = new BLL.SerialNumber();
                s.setSerie(listado.getString(1));
                s.setEstado(listado.getInt(2));
                s.setIdjuego(listado.getInt(3));
                
                ganancia.add(s);
            }                          
            return ganancia;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public ArrayList <ArryL> usuarioMax(){
        try
        {
            ArrayList<ArryL> usuarioMax = new ArrayList<>();
            String sql =    "select username, count(username)\n" +
                            "from biblioteca \n" +
                            "group by 1\n" +
                            "order by 2 desc\n";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                ArryL s = new ArryL();
                s.setUsername(listado.getString(1));
                s.setCantidad(listado.getInt(2));
                
                usuarioMax.add(s);
            }                          
            return usuarioMax;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public ArrayList <BLL.SerialNumber> topfive(){
        try
        {
            ArrayList<BLL.SerialNumber> serial = new ArrayList<>();
            String sql =    "select serie , count(serie) 'cantidad juegos', idjuego\n" +
                            "from serialnumber \n" +
                            "where estado = 1\n" +
                            "group by idjuego\n" +
                            "order by 2 desc";
            PreparedStatement select = conn.crearSentencia(sql);
            ResultSet listado = select.executeQuery();
            while(listado.next())
            { 
                BLL.SerialNumber s = new BLL.SerialNumber();
                s.setSerie(listado.getString(1));
                s.setEstado(listado.getInt(2));
                s.setIdjuego(listado.getInt(3));
                
                serial.add(s);
            }                          
            return serial;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public class ArryL{
 
    private String username;
    private int cantidad;

    public ArryL(String username, int cantidad) 
    {
        this.username = username;
        this.cantidad = cantidad;
    }

        private ArryL() {
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }   
    }    
}
