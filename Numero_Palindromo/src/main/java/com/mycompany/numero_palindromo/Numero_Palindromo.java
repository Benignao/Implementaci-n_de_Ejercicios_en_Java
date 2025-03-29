/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numero_palindromo;

/**
 *
 * @author brsan
 */
import java.util.Scanner;
public class Numero_Palindromo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

    // Obtener la entrada del usuario
            int numero = Scanner.nextInt();


    int reverseNum = 0;
    int temp = numero;

    // Invertir los dígitos del número
    while (temp != 0) {
        int digit = temp % 10;
        reverseNum = reverseNum * 10 + digit;
        temp = temp / 10;
    }

    // Comprueba si el número original es igual al número invertido
    if (numero == reverseNum) {
        System.out.println(numero +" Este numero es palindromo");
    } else {
        System.out.println(numero +" Este numero no es palindromo");
    }
}}}
