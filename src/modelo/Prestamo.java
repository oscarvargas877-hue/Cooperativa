/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Prestamo {
     //atributos
    private int idPrestamo;
    private float monto;
    private float tasaInteres;
    private int plazoMeses;
    private String estado;
   
    //constructor
    public Prestamo(int idPrestamo, float monto, float tasaInteres, int plazoMeses, String estado){
        this.idPrestamo=idPrestamo;
        this.monto=monto;
        this.tasaInteres=tasaInteres;
        this.plazoMeses=plazoMeses;
        this.estado=estado;
    }
    
    //Metodo de encapsulamiento set y get
    public void setIdPrestamo(int idPrestamo){
        this.idPrestamo=idPrestamo;
    }
    public int getIdPrestamo(){
        return idPrestamo;
    }
    public void setMonto(float monto){
        this.monto=monto;
    }
    public float getMonto(){
        return monto;
    }
    public void setTasaInteres(float tasaInteres){
        this.tasaInteres=tasaInteres;
    }
    public float getTasaInteres(){
        return tasaInteres;
    }
    public void setPlazoMeses(int plazoMeses){
        this.plazoMeses=plazoMeses;
    }
    public int plazoMeses(){
        return plazoMeses;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public String getEstado(){
        return estado;
    }
    
    //Metodo de logica
    public void cuotaMensual(){
    //calcular la cuota mensual
       float interesTotal=(this.monto*(this.tasaInteres/100));
       float cuotaMensual=(this.monto+interesTotal)/this.plazoMeses;
       
        System.out.println("\nID de préstamo: " + this.idPrestamo );
        System.out.println("Monto solicitado: " + this.monto);
        System.out.println("Tasa de intereses: " + this.tasaInteres + " %");
        System.out.println("Plazo: "+ this.plazoMeses);
        System.out.println("Estado: " + this.estado);
        System.out.println("Cuota mensual: " + cuotaMensual);
    }
    
}
