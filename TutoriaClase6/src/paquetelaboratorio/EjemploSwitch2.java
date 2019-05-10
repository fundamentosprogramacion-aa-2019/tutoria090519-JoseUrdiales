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
public class EjemploSwitch2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String matricula;
        // Ejercicio que consiste en reconocer las placas de la región Costa
        System.out.println("¿Cual es su matricula?");
        matricula = entrada.nextLine();
        char letra = matricula.charAt(0);
        
        switch(letra){
            case 'k':
            case 'K':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Sucumbíos\n", 
                        matricula.toUpperCase());
                break;
            case 'q':
            case 'Q':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Orellana\n", 
                        matricula.toUpperCase());
                break;
            case 'N':
            case 'n':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Napo\n", 
                        matricula.toUpperCase());
                break;
            case 's':
            case 'S':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Pastaza\n", 
                        matricula.toUpperCase());
                break;
            case 'v':
            case 'V':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Morona Santiago\n", 
                        matricula.toUpperCase());
                break;
            case 'z':
            case 'Z':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Zamora Chinchipe\n", 
                        matricula.toUpperCase());
                break;
            default:
                System.out.printf("La placa %s no pertenece a la "
                        + "regiòn amazonica\n", 
                        matricula.toUpperCase ());
        }
    }
}
