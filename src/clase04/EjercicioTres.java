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
public class EjercicioTres {
    /*
    Generar un programa que permita pedir datos por teclado para:
    Ingreso de nombres completo de un estudiante
    Ingreso de nota 1 (debe ser entero)
    Ingreso de nota 2 (debe ser entero
    Ingreso del ciclo que cursa el alumno (debe ser cadena)
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe del Alumno
    Nombres Completos:
    Ciclo:
    Nota 1:
    Nota 2:
    */
            public static void main(String[]args){
                Scanner entrada = new Scanner(System.in);
                
                String nombres;
                int nota1;
                int nota2;
                String ciclo;
                
                System.out.println("Ingrese su nombre completo");
                nombres = entrada.nextLine();
                System.out.println("ingrese de nota 1");
                nota1 = entrada.nextInt();
                System.out.println("ingreso de nota 2");
                nota2 = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese el ciclo");
                ciclo = entrada.nextLine();
                
             System.out.printf("Informe del alumno:\nNombres:%s\nNota1:"
             + "%d\nNota2:%d\nCiclo:%s\n");
              
            }
    
}
