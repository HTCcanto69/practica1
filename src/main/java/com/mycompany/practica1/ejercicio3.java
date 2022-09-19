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
public class ejercicio3 {
        public static void main(String[] args) {
            Scanner obj =new Scanner (System.in);
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int resultado;
        System.out.println("primer número: ");
        n1=obj.nextInt();
        
        System.out.println("segundo número: ");
        n2=obj.nextInt();
        
        System.out.println("tercer número: ");
        n3=obj.nextInt();
        
        System.out.println("cuarto número: ");
        n4=obj.nextInt();
        
        System.out.println("quinto número: ");
        n5=obj.nextInt();
        
       resultado=n1+n2+n3+n4+n5;
       
        System.out.println("resultado final: "+resultado);
    }

        }
