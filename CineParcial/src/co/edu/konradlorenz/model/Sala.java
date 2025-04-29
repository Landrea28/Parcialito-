/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author USUARIO
 */
public abstract class Sala implements CalculadoraPrecio{

    
    protected int numero;
    protected boolean[][] asientos;
    public double precioBase;

    public abstract void configurarSala(); // Método abstracto

    public Sala(int numero, int filas, int columnas, double precioBase) {
        this.numero = numero;
        this.asientos = new boolean[filas][columnas] ;
        this.precioBase = precioBase;
    }

    public int getNumero() {
        return numero;
    }
   public boolean estaOcupado(int filas, int columnas){
       return asientos[filas][columnas];
   }
   public void reservarAsiento(int filas, int columnas) throws AsientoOcupadoException{
       if (estaOcupado(filas, columnas)) {
          throw new AsientoOcupadoException("Asiento ocupado");
       }
       asientos[filas][columnas]= true;
   }
   
}
