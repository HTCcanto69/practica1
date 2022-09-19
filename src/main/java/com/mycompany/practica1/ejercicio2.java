/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica1;

import java.util.Scanner;
/**
 *
 * @author Hermes Ccanto Torres
 */
public class ejercicio2 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  
        String Nombre;
        String Apellido;
        System.out.println("Ingrese su nombre");
        Nombre=sc.nextLine();
        System.out.println("Ingrese su apellido");
        Apellido=sc.nextLine();
        System.out.println("Su nombre completo es: "+Nombre+" "+Apellido);
     }
}

