/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author USUARIO
 */
public class Reserva {

    private Pelicula pelicula;
    private Sala sala;
    private int fila, columna;

    public Reserva(Pelicula pelicula, Sala sala, int fila, int columna) throws AsientoOcupadoException {
        sala.reservarAsiento(fila, columna);
        this.pelicula = pelicula;
        this.sala = sala;
        this.fila = fila;
        this.columna = columna;
    }
}
