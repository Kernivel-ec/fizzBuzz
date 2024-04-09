package com.kernivel.fizzbuzz;
/**
 * @author ING. Roberto Calero
 * www.kernivel.com
 */

/*
 * Reto #0
 * FIZZ BUZZ
 * Enunciado: Escribe un programa que muestre por consola los números de 1 a 50 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class FizzBuzz {

    public static void main(String[] args) {
        
        //Hay varias posibles formas de hacer este ejercicio, en esta ocacion se mostrara 2 formas.
        
        //Utilizamos un for para imprimir los numeros del 1 al 50
        System.out.println("Forma 1");
        //Forma #1
        //Uso de if else
        for(int x = 1 ; x <= 50; x++){
            
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println(x + ": fizzbuzz");
            } else if (x % 3 == 0 && x % 5 != 0) {
                System.out.println(x + ": fizz");
            }else if(x % 3 != 0 && x % 5 == 0){
                System.out.println(x + ": buzz");
            }else{
                System.out.println(x);   
            }
        }
        System.out.println("Forma 2");
        //Forma #2
        //Uso de if else
        for(int y = 1 ; y <= 50 ; y++){
            boolean divisibleTres = false, divisibleCinco =  false;
            
            if (y % 3 == 0) divisibleTres =  true;            
            if (y % 5 == 0) divisibleCinco =  true;
            
            if(divisibleTres && divisibleCinco){
                System.out.println(y + ": fizzbuzz");
            }else if (divisibleTres) {
                System.out.println(y + ": fizz");
            }else if (divisibleCinco){
                System.out.println(y + ": buzz");
            }else{
             System.out.println(y);
            }
            
        }
        
        /*
        *Ambas formas funcionan correctamente, en la primera comprar el resultado del residuo
        *y en la siguiente utiliza boolean verdadero o falso y verica el resultado.
        *Esta es una muestra de que no existe una solo forma de resolver un problema.
        */
    }
}