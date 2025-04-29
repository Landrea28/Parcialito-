/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author USUARIO
 */
public class Sala3D extends Sala implements CalculadoraPrecio{

    public Sala3D(int numero, int filas, int columnas, double precioBase) {
        super(numero, filas, columnas, 25.5); //vale 25.000 la boleta vip
    }

    
    
    @Override
    public void configurarSala() {
        System.out.println("Configurando proyector 3D...");
    }

    @Override
    public double calcularPrecio(double precioBase) {
        return precioBase * 1.5; // Precio incrementado para 3D
    }

    


}
