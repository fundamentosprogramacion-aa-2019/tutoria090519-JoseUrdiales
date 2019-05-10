/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetelaboratorio;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class EjemploSwitch1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String matricula;
        // Ejercicio que consiste en reconocer las placas de la región Costa
        System.out.println("¿Cual es su matricula?");
        matricula = entrada.nextLine();
        char letra = matricula.charAt(0);
        
        switch(letra){
            case 'e':
            case 'E':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Esmeraldas\n", 
                        matricula.toUpperCase());
                break;
            case 'j':
            case 'J':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Santo Domingo de los Tsáchilas\n", 
                        matricula.toUpperCase());
                break;
            case 'M':
            case 'm':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Manabí\n", 
                        matricula.toUpperCase());
                break;
            case 'r':
            case 'R':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Los Ríos\n", 
                        matricula.toUpperCase());
                break;
            case 'g':
            case 'G':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Guayas\n", 
                        matricula.toUpperCase());
                break;
            case 'y':
            case 'Y':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Santa Elena\n", 
                        matricula.toUpperCase());
                break;
            case 'o':
            case 'O':
                System.out.printf("Su placa %s es de la provincia de "
                        + "El Oro\n", 
                        matricula.toUpperCase());
                break;            
            default:
                System.out.printf("La placa %s no pertenece a la "
                        + "regiòn de la Costa\n", 
                        matricula.toUpperCase ());
        }
    }
}
