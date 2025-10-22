/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
    // Ejercicio Socio
    //instancia o crear el objeto
    Socio socio1 =new Socio("Juan", "1002064283", "2008-01-10",50);
    socio1.datoAhorroAcumulado();

    Socio socio2 = new Socio("Lucas", "1004262877","2009-02-11",30);
    socio2.datoAhorroAcumulado();

    Socio socio3 = new Socio("Mayra", "1003256544", "2010-09-12", 70);
    socio3.datoAhorroAcumulado();
    //Muestra los datos del socio y el ahorro acumulado

    // Ejercicio Prestamo
    //instancia o crear el objeto
    Prestamo prestamo1 = new Prestamo(1,1000,20, 12, "activo");
        prestamo1.cuotaMensual();
    
    Prestamo prestamo2 = new Prestamo(2,2000,20,12,"activo");
        prestamo2.cuotaMensual();
    
    Prestamo prestamo3 = new Prestamo(3,3000,20,12,"activo");
        prestamo3.cuotaMensual();
        //Muestra los detalles del prestamo y la cuota mensual
    
     // Ejercicio CuentaAhorro
    //instancia o crear el objeto  
    
    CuentaAhorro cuentaAhorro1 = new CuentaAhorro("Juan","2020202136", 3550, "2008-01-10");
        cuentaAhorro1.mostrarSaldo();
    
    CuentaAhorro cuentaAhorro2 = new CuentaAhorro("Lucas","2403569874", 7000, "2009-02-11");
        cuentaAhorro2.mostrarSaldo();
        
    CuentaAhorro cuentaAhorro3 = new CuentaAhorro("Mayra", "2356478912",5000,"2010-09-12");
        cuentaAhorro3.mostrarSaldo();
        //Muestra la informacion detallada de la cuenta del titular
    }
  
}
