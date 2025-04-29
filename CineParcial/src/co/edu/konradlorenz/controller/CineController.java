/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.View;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */


public class CineController {
    private List<Pelicula> peliculas;
    private List<Sala> salas;

    public CineController() {
        peliculas = new ArrayList<>();
        salas = new ArrayList<>();
    }

    public void agregarSala(Sala sala) {
        salas.add(sala);
        sala.configurarSala();
    }
    public void agregarPelicula(Pelicula peli) {
        peliculas.add(peli);
    }

    public void hacerReserva(int idPelicula, int numSala, int fila, int columna) 
            throws AsientoOcupadoException, SalaNoEncontradaException {
        // Completar: Buscar sala y película, luego reservar
        Sala salaEncontrada = null;
        for (Sala s : salas) {
            if (s.getNumero()==numSala) {
                salaEncontrada=s;
                break;
            }
        }
        if (salaEncontrada== null) {
            throw new SalaNoEncontradaException("Sala no encontrada");
        }
        if (idPelicula < 0 || idPelicula>= peliculas.size()) {
            throw new IllegalArgumentException("ID no valido");
        }
        Pelicula pelicula = peliculas.get(idPelicula);
        Reserva reserva = new Reserva(pelicula, salaEncontrada, fila, columna);
        double precioFinal = salaEncontrada.calcularPrecio(salaEncontrada.precioBase);
        View.mostrarTexto("Reserva exitosa: "+pelicula.getNombre()+"Precio: "+precioFinal);
    }
    public void run() {
        agregarPelicula(new Pelicula("x",123));
        agregarPelicula(new Pelicula("z",456));
         agregarSala(new Sala3D(1, 5, 5, 25.5));
         agregarSala(new SalaVIP(2, 6, 6, 35.5));
        try {
            hacerReserva(1, 1, 2, 3); 
            hacerReserva(0, 2, 2, 1); 
        } catch (Exception e) {
            View.mostrarTexto("Error: " + e.getMessage());
        } 
        //catch (AsientoOcupadoException | SalaNoEncontradaException |IllegalArgumentException e) {
            //View.mostrarTexto("Error: " + e.getMessage());
       // }

}

}