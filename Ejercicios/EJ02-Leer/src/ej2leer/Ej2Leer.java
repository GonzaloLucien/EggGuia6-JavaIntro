/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2leer;

import java.util.Scanner;

/**
 *
 * @author Motherfucker
 */
public class Ej2Leer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre, estúpido:");
        String name;
        name = leer.nextLine();
        System.out.println("Tu nombre horrible es " + name + ".");
    }
    
}
