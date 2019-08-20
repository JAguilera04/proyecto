
package datoss;

import Validaciones.Validador;
import java.util.ArrayList;


public class Pedido {
    ArrayList<Comestibles> comidas;
    ArrayList<Bebestibles> bebidas;
    Pedido(){    
    }
    public void agregarComida(){
        Carta carta = new Carta();
        System.out.println("ingrese opcion a elegir para agregar al pedido");
        carta.mostrarComestibles();
        Validador val = new Validador();
        int opcn = val.validarNumero();
        addComida(opcn);
    }
    public void addComida(int opcn){
    switch (opcn) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
    }
    }
    public void agregarBebida(){
        Carta carta = new Carta();
        System.out.println("ingrese opcion a elegir para agregar al pedido");
        carta.mostrarComestibles();
        Validador val = new Validador();
        int opcn = val.validarNumero();
        addBebida(opcn);
    }
    public void addBebida(int opcn){
    switch (opcn) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
    }
    }
}
