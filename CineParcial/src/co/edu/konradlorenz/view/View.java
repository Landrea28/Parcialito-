/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.view;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class View {
    static Scanner sc = new Scanner(System.in);
    public static void mostrarTexto(String s){
        System.out.println(s);
    }
    public static int pedirEntero(){
        int a = 0;
        try{
            a = sc.nextInt();
        }catch(NumberFormatException e){
            System.out.println("Error al ingresar dato requerido, por favor inserte un numero e intenete nuevamente");
        }
        return a;
    }
    public static double pedirDecimal(){
        double b = 0;
        try{
            b = sc.nextDouble();
        }catch(NumberFormatException e){
            System.out.println("Error al ingresar dato requerido, por favor inserte un numero e intenete nuevamente");
        }
        return b;
    }
    public static String pedirTexto(){
        return sc.nextLine();
    }
    public static String menu(){
        return "Error, por favor intente nuevamente"; //mensaje general, predeterminado
    }
}
