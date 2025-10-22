/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Socio {
    //Atributos
    private String nombre;
    private String cedula;
    private String fechaIngreso;
    private float ahorroMensual;
    
   
    //Constructor
    public Socio(String nombre, String cedula, String fechaIngreso, float ahorroMensual ){
        this.nombre=nombre;
        this.cedula=cedula;
        this.fechaIngreso=fechaIngreso;
        this.ahorroMensual=ahorroMensual;
    }
    
    //Metodo de encapsulamiento set y get
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public String getCedula(){
        return cedula;
    }
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso=fechaIngreso;
    }
    public String getFechaIngreso(){
        return fechaIngreso;
    }
    public void setAhorroMensual(float ahorroMensual){
        this.ahorroMensual=ahorroMensual;
    }
    public float getAhorroMensual(){
        return ahorroMensual;
    
    }
    
    //Metodo de logica
    //Calcular el total ahorrado hasta la fecha
    public void datoAhorroAcumulado(){
        int meses=12;
        float totalAhorro=this.ahorroMensual*meses;
        System.out.println("\nsocio: " + nombre);
        System.out.println("cedula: " + cedula);
        System.out.println("fecha de ingreso: " + fechaIngreso);
        System.out.println("Ahorro mensual $ : " + ahorroMensual );
        System.out.println("ahorro acumulado en: " + meses + " meses "+ totalAhorro);
    }
    
    
}
