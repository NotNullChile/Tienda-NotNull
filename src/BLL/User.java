package BLL;

import java.util.ArrayList;

public class User {
    private String nuevoUser;
    private String pwNuevoUser;
    private int rut;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int Billetera;

    //Constructor por defecto.
    public User(){
    }

    //Constructor con parámetros.
    public User(String nuevoUser, String pwNuevoUser, int rut, String nombre, 
            String apellido, String fechaNacimiento, int Billetera) {
        this.nuevoUser = nuevoUser;
        this.pwNuevoUser = pwNuevoUser;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.Billetera = Billetera;
    }

    //Getters and Setters
    public String getNuevoUser() {
        return nuevoUser;
    }

    public void setNuevoUser(String nuevoUser) {
        this.nuevoUser = nuevoUser;
    }

    public String getPwNuevoUser() {
        return pwNuevoUser;
    }

    public void setPwNuevoUser(String pwNuevoUser) {
        this.pwNuevoUser = pwNuevoUser;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getBilletera() {
        return Billetera;
    }

    public void setBilletera(int Billetera) {
        this.Billetera = Billetera;
    }
    
    public int registrarUserBLL(String nuevoUser, String pwNuevoUser, int rut, 
        String nombre, String apellido, String fechaNacimiento, int billetera){
        User p = new User(nuevoUser, pwNuevoUser, rut, nombre, apellido, fechaNacimiento, billetera);
        int resultado = new DAL.UserDAL().insertUser(p);
        return resultado;
    }
    
    public User buscarUser(String username){
        return new DAL.UserDAL().buscarUser(username);
    }
    
     public int actualizarBilletera(int billetera, String username){
        int resultado = new DAL.UserDAL().updateBilleteraUser(billetera,username);
        return resultado;
     }
     
      public ArrayList<User> listadoUser(){
        return new DAL.UserDAL().ConsultarUser();
     }
}
