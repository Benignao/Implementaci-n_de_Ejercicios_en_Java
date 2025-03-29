/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formula_cuadratica;

/**
 *
 * @author brsan
 * Ecuaciones cuadraticas a evaluar
 * de la forma  ax^2+bx+c
 * x^2+6x+8
 * 4x^2+12x+9
 * 2x^2+x+2
 */

public class Formula_Cuadratica {

    public static void main(String[] args) {
    double a = 2, b =1, c =2 ,x1,x2,producto,raiz,cuadrado,diferencia;
       cuadrado=Math.pow(b,2);//con esta instruccion se eleva un numero al cuadrado
        producto=4*a*c;
        diferencia=cuadrado-producto;
        raiz=Math.sqrt (diferencia) ;// con esta instruccion se obtiene la raiz cuadrada de un numero
        x1=(-b+raiz)/(2*a); //solucion 1 de la ecuacion cuadratica
        x2=(-b-raiz)/(2*a); //solucion 2 de la ecuacion cuadratica
        System.out.println ("La ecuacion es: " +a+"x^2+ "+b+"x+ "+c+" = 0");
        System.out.println ("El discriminante es: "+ raiz);
        
                    if (raiz >= 0) {
        System.out.println ("Las raices solucion son:");
        System.out.println ("El valor x1 es: "+x1);
        System.out.println ("El valor x2 es: "+x2); 
            } else 
                    {
                System.out.println("No hay soluciones reales si el discriminante es menor a cero");
                
        
    
    }


}}
