package BLL;
//FINAL
import DAL.SerialNumberDAL;
import java.util.ArrayList;
import java.util.Random;

public class SerialNumber {
    private String serie;
    private int estado;
    private int idjuego;

    //Constructor por defecto.
    public SerialNumber() {
    }

    //Constructor con parámetros.
    public SerialNumber(String serie, int estado, int idjuego) {
        this.serie = serie;
        this.estado = estado;
        this.idjuego = idjuego;
    }

    //Getters & Setters
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdjuego() {
        return idjuego;
    }

    public void setIdjuego(int idjuego) {
        this.idjuego = idjuego;
    }
    
    //Genera serialNumbers.
    public void generarSeriales(int cantidad, int idjuego){
        String serie= "";
        for(int i = 0;i<cantidad;i++){
            
            int a, b;
            Random rnd = new Random();
            
            a = (rnd.nextInt(99999));
            b = (rnd.nextInt(99999));
            if(a>=10000 && b>=10000 ){
            serie= (a + "-" +b);  
            
            new BLL.SerialNumber().insertKey(serie, 0, idjuego);
            }
        }
    }
    
    public int insertKey(String serie, int estado, int idjuego){
        SerialNumber s = new SerialNumber(serie,estado,idjuego);
        int resultado = new DAL.SerialNumberDAL().insertSerialNumber(s);
        
        return resultado;
    }   
    
    public ArrayList<SerialNumber> listadoSerialNumbers(){
        return new DAL.SerialNumberDAL().buscarSerial();
    }    
    
    public int actualizarSerial(String serie, int estado, int idjuego){
        
        SerialNumber s = new SerialNumber(serie, estado, idjuego);
        int resultado = new DAL.SerialNumberDAL().updateSerialNumber(s);
        return resultado;
    }

    public ArrayList<SerialNumber> contarSeriales(){
        return new DAL.SerialNumberDAL().contarSeriales();
    }
   
    public ArrayList<SerialNumber> SerialesCompradas(){
        return new DAL.SerialNumberDAL().SerialesCompradas();
    }
   
    public ArrayList<SerialNumber> SerialesDelJuego(int idJuego){
        return new DAL.SerialNumberDAL().SerialesDelJuego(idJuego);
    } 
   
    public ArrayList<SerialNumber> GananciaTotalxJuego(){
        return new DAL.SerialNumberDAL().GananciaTotalxJuego();
    }
    

    public ArrayList<SerialNumberDAL.ArryL> usuarioMax(){
        return new DAL.SerialNumberDAL().usuarioMax();
    }
   
    public ArrayList<SerialNumber> topFive(){
        return new DAL.SerialNumberDAL().topfive();
    }
}
