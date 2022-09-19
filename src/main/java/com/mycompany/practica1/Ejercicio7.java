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
public class Ejercicio7 {
    public static void main(String[] args) {
         System.out.println("Ingrese 10 números");
        Scanner sc = new Scanner(System.in);
        int Suma1 = 0;
        int Suma2 = 0;
        for (int i = 0; i < 10; i++) {
            int ni = sc.nextInt();
            if (i < 5) {
                Suma1 = Suma1 + ni;
            } else {
                Suma2 = Suma2 + ni;
            }
        }
        System.out.println("La sumana de los 5 primeros números es : " + Suma1 );
        System.out.println("La sumana de los 5 ultimos números es : " + Suma2 );
        System.out.println("El producto es : " + (Suma1 * Suma2) );
    }
}

