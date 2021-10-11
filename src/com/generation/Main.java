package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
	// Estructura de control if

        if(condicion) {
        } else if_ (){
        }else {
        }
        //----------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("¿Cual es tu nombre?");
        switch (sc.nextLine())         }
        String nombre = sc.nextLine();

        if (edad > 18) {
            System.out.println("Felicidades " + nombre + ", puedes votar");
        } else {
            System.out.println("Hola " + nombre + ",Aun no puedes votar");
        }
        sc.close();

//        System.out.println("¿Cual es tu nombre?);
//        sc.nextLine();
*/
//----------------------------------------------
/*
        //Estructura de control switch

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro número");
        int numero2 = sc.nextInt();
        System.out.println("Ingresa la operación deseana: \n1)Suma \n2)Resta \n3)Mutiplicación \n4)División");
        int operacion = sc.nextInt();
        sc.nextLine();
        float resultado = 0;

        switch(operacion) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
            case 3:
                resultado = numero1 * numero2;
            case 4:
                resultado = numero1 / numero2;
            default:
                System.out.println("La operación que seleccionaste es inválida");
                break;
        }
        sc.close();
        System.out.println(resultado);

 */
        // Pedir un número al usuario y dependiendo la respuesta
        // mostrar un dia de la semana, ejemplo: 1) Domingo, 2) Lunes ... 7)Sabado
        // Si elige un numero fuera de ese rango mostar un mensaje de error;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número");
        int numero = sc.nextInt();

        switch(numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error");
                break;
        }
        sc.close();
    }
}
