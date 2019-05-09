/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menejosswitch;

/**
 *
 * @author Jose Luis
 */
public class UsoSwitch {
    public static void main(String[] args) {
        String cadena = "Martes1";
        switch(cadena){
            case "lunes":
                System.out.printf("Dia %s", cadena);
                break;
            case "martes":
                System.out.printf("Dia %s", cadena);
                break;
            default:
                System.out.printf("Ninguna opcion encontrada");
        }
    }
}
