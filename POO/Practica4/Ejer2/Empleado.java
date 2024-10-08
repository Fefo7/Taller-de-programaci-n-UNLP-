/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer2;

/**
 *
 * @author Usuario
 */
public abstract class Empleado {
    // por su nombre, sueldo básico y antigüedad
    private String nombre;
    private double sueldo;
    private int antiguedad;

    public Empleado(String nombre, double sueldo, int antiguedad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
     public  double calcularSueldoACobrar()
     {
         double porcentaje = (this.getSueldo() * 10) /100;
         if( this.getAntiguedad() != 0)
         {
           porcentaje = porcentaje * this.getAntiguedad();
         }
         return this.getSueldo() + porcentaje  ;
     };
    
     
   @Override
   public String toString()
   {
       return "Nombre: "+ getNombre() +
               "Sueldo: " + this.calcularSueldoACobrar() + 
               "Efectividad: "+ this.calcularEfectividad();
       
   }
     
    public abstract double calcularEfectividad ();
   
    
}
