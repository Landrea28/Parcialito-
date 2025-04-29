/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.View;

/**
 *
 * @author USUARIO
 */
public class SalaVIP extends Sala implements CalculadoraPrecio{

    public SalaVIP(int numero, int filas, int columnas, double precioBase) {
        super(numero, filas, columnas, 35.5); //vale 35.000 la boleta vip
    }

    @Override
    public void configurarSala() {
        View.mostrarTexto("Alistando su servicio VIP!!!");
    }

    @Override
    public double calcularPrecio(double precioBase) {
       return precioBase * 2.0; 
    }

    
    
}
