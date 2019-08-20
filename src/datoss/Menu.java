
package datoss;

import java.util.Scanner;
import Validaciones.Validador;

public class Menu {
    
    public void menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué desea hacer?");
        System.out.println();
        System.out.println("1.- Ver carta");
        System.out.println("2.- hacer pedido ");
        System.out.println("3.- Cerrar programa");
        Validador val = new Validador();
        
        int opcn = val.validarNumero();
        seleccionMenu(opcn);
    }
    public void seleccionMenu(int opcn) {        
        switch (opcn) {
            case 1: 
                verCarta();                    
                menu();
                break;            
            case 2:
                hacerPedido();
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
    public void verCarta() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué carta desea ver?");
        System.out.println();
        System.out.println("1.- Comida.");
        System.out.println("2.- Bebidas.");
        System.out.println("3.- Regresar menu anterior.");
        Validador val = new Validador();
        int opcn = val.validarNumero();
        opcionCarta(opcn);
    }
    public void opcionCarta(int opcn) {        
        Carta ct = new Carta();
        switch (opcn) {
            case 1:
                ct.mostrarComestibles();
                menu();
                break;
            case 2:
                ct.mostrarBebestibles();
                menu();
                break;
            case 3:
                menu();
                break;
            default:
                menu();
                break;
        }

    }
    public void hacerPedido(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Que pedido desea hacer?");
    System.out.println("1.- Comestible");
    System.out.println("2.- Bebestible");
    System.out.println("3.- Regresar menu anterior");
    Validador val = new Validador();
        int opcn = val.validarNumero();
        opcionPedido(opcn);
    }
    public void opcionPedido(int opcn){
    Pedido pd = new Pedido();
    switch (opcn) {
            case 1:
                pd.agregarComida();
                menu();
                break;
            case 2:
                pd.agregarBebida();
                menu();
                break;
            case 3:
                menu();
                break;
            default:
                menu();
                break;
        }
    }
}
