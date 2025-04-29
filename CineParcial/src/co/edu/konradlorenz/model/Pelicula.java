/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author USUARIO
 */
public class Pelicula {
  private String nombre;
    private int duracionMinutos;

    public Pelicula(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracionMinutos = duracion;
    }

    public String getNombre() {
        return nombre;
    }

//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

//    public void setDuracionMinutos(int duracionMinutos) {
//        this.duracionMinutos = duracionMinutos;
//    }
    
  
}
