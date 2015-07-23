package BLL;
//FINAL
import java.util.ArrayList;

public class Biblioteca {
private int idventa;
private String username;
private int idJuego;
private String serie;
    
    public Biblioteca()                                                         {
    }
    
    public Biblioteca(int idventa, String username, int idJuego, String serie)  {
        this.idventa = idventa;
        this.username = username;
        this.idJuego = idJuego;
        this.serie = serie;
    }

    public int getIdventa()                                                     {
        return idventa;
    }

    public void setIdventa(int idventa)                                         {
        this.idventa = idventa;
    }

    public String getUsername()                                                 {
        return username;
    }

    public void setUsername(String username)                                    {
        this.username = username;
    }

    public int getIdJuego()                                                     {
        return idJuego;
    }

    public void setIdJuego(int idJuego)                                         {
        this.idJuego = idJuego;
    }

    public String getSerie()                                                    {
        return serie;
    }

    public void setSerie(String serie)                                          {
        this.serie = serie;
    }
    
    public int insertBiblioteca(int idventa, String username, int idJuego, String serie){
        Biblioteca b = new Biblioteca(idventa, username, idJuego, serie);
        int resultado = new DAL.BibliotecaDAL().insertBiblioteca(b);
        return resultado;
    }   
    
    public int maxIdventa()                                                             {
        return new DAL.BibliotecaDAL().maxJuegos();
    }
    
    public ArrayList<BLL.Biblioteca> ConsultarBibliotecaUsuario(String usuario)         {
        return new DAL.BibliotecaDAL().ConsultarBibliotecaUsuario(usuario);
    }
    
    public ArrayList<BLL.Biblioteca> ConsultarBiblioteca()                              {
        return new DAL.BibliotecaDAL().ConsultarBiblioteca();
    }
}


//REVISADO OK