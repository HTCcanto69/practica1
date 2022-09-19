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
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        float nota1,nota2,nota3,nota4,nota5;
        float promedio;
        System.out.println("ingrese la primera nota"); 
        nota1=entrada.nextFloat();
        System.out.println("ingrese la segunda nota"); 
        nota2=entrada.nextFloat();
        System.out.println("ingrese la tercera nota"); 
        nota3=entrada.nextFloat();
        System.out.println("ingrese la cuarta nota"); 
        nota4=entrada.nextFloat();
        System.out.println("ingrese la quinta nota"); 
        nota5=entrada.nextFloat();
        promedio=(nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println("el promedio es "+promedio+"");
        
    }
}
