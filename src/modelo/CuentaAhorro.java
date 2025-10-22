/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class CuentaAhorro {
     //Atributos
    private String titular;
    private String numeroCuenta;
    private float saldo;
    private String fechaApertura;
  
    
    //constructor
    public CuentaAhorro(String titular, String numeroCuenta, float saldo, String fechaApertura){
        this.titular=titular;
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
        this.fechaApertura=fechaApertura;
    }
    
    //Metodo de encapsulamiento set y get
    public void setTitular(String titular){
        this.titular=titular;
    }
    public String getTitular(){
        return titular;
    }
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }
    public String getnumeroCuenta(){
        return numeroCuenta;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setFechaApertura(String fechaApertura){
        this.fechaApertura=fechaApertura;
    }
    public String getFechaApertura(){
        return fechaApertura;
    }
    
    //Metodo de logica
    //Mostrar los datos del titular
    public void mostrarSaldo(){
        System.out.println("\nTitular: " +this.titular);
        System.out.println("Cuenta: "+ this.numeroCuenta);
        System.out.println("Fecha apertura: " + this.fechaApertura);
        System.out.println("Saldo actual $: " + this.saldo);
    }
}
