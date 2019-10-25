/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicioDos {
   /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombres 
    ingreso de ciudad de naciemiento
    ingreso de edad
    ingreso de costo de matricula
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Datos personales:
    Nombres:
    Ciudad de nacimiento:
    Edad: 
    Matricula:
    */
        public static void main(String[]args){
            Scanner entrada = new Scanner(System.in);
        
            String nombres;
            String ciudad;
            int edad;
            double matricula;
            
            System.out.println("ingrese sus nombres");
            nombres = entrada.nextLine();
            System.out.println("ingrese su ciudad de nacimiento");
            ciudad = entrada.nextLine();
            System.out.println("ingrese su edad");
            edad = entrada.nextInt(); // ingreso de enteros
            System.out.println("ingrese su valor de matricula");
            matricula = entrada.nextDouble(); // ingreso de decimales
            
            System.out.printf("Datos Personales:\nNombres:%s\nCiudad:"
            + " %s\nEdad: %d\nMatricula: %.2f\n", nombres, ciudad, edad, matricula);
            
           
            
            
            
        }

        
}
