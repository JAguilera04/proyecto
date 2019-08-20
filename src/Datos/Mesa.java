/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Validaciones.Validador;
import java.util.Scanner;

/**
 *
 * @author gilio
 */
public class Mesa {
    
    Validador val = new Validador();
    
    public void menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué desea hacer?");
        System.out.println();
        System.out.println("1.- Ver carta");
        System.out.println("2.- ");
        System.out.println("3.- Cerrar programa");
        
        int opcn = val.validarNumero();
        seleccion(opcn);
    }
    
    public void seleccion(int opcn) {
        
        switch (opcn) {
            case 1: Carta m = new Carta();
                   m.menuMesas();
                    
                menu();
                break;
            
            case 2:
                menu();
                break;
            
            case 3:
                System.out.println("Que tenga un buen día.");
                System.exit(0);
                break;
            
            default:
                menu();
                break;
        }
        
    }
    
}
