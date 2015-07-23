
package BLL;

import java.util.ArrayList;

public class VideoGame {
    private int idjuego;
    private String titulo;
    private String descripcion;
    private int restriccion;
    private String caratula;
    private int valor;

    //Constructor por defecto.
    public VideoGame() {
    }

    //Constructor con parámetros.
    public VideoGame(int idjuego, String titulo, String descripcion, int restriccion, String caratula, int valor) {
        this.idjuego = idjuego;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.restriccion = restriccion;
        this.caratula = caratula;
        this.valor = valor;
    }
    
    //Getters & Setters
    public int getIdjuego() {
        return idjuego;
    }

    public void setIdjuego(int idjuego) {
        this.idjuego = idjuego;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(int restriccion) {
        this.restriccion = restriccion;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //Registra un juego.
    public int registrarJuego(  int idjuego, 
                                String titulo, 
                                String descripcion, 
                                int restriccion, 
                                String caratula, 
                                int valor){
        VideoGame v = new VideoGame(idjuego,titulo,descripcion,restriccion,caratula,valor);

        int resultado = new DAL.VideoGameDAL().insertVideoGame(v);
        return resultado;
    }
           
    public int maxIdjuego(){
        return new DAL.VideoGameDAL().maxJuegos();
    }
    
    public ArrayList<VideoGame> listadoVideoGames(){
        return new DAL.VideoGameDAL().selectVideoGames();
    }
    
    public String tituloJuego(int idjuego){
        return new DAL.VideoGameDAL().tituloJuego(idjuego);
    }
}
