/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Validaciones.Validador;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gilio
 */
public class Carta {

    Validador val = new Validador();

    ArrayList<String> mesa = new ArrayList<String>();
    ArrayList<String> comida = new ArrayList<String>();
    ArrayList<String> bebestibles = new ArrayList<String>();

    public void cartaComida() {
        comida.add("1.- Hambueguesas.");
        comida.add("2.- Pollo y papas fritas.");
        comida.add("3.- Carne a la olla.");
        comida.add("4.- Pizza napolitana.");
        comida.add("5.- Pizza vegetariana.");

        bebestibles.add("1.- Bebida");
        bebestibles.add("2.- Nectar");
        bebestibles.add("3.- Jugos naturales");
        bebestibles.add("4.- Agua mineral");

    }

    public void mostrarCartaComida() {
        
        String ruta = "cartaComida.txt";
        Path archivo = Paths.get(ruta);
        String texto = "";

        try {
            texto = new String(Files.readAllBytes(archivo));
            System.out.println("El contenido del archivo es:\n" + texto);
            System.out.println();
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido."); // El archivo no se lee pues bien no existe o la ruta está mal escrita.
        }

    }

    public void mostrarCartaBebestibles() {
        String ruta = "cartaBebestibles.txt";
        Path archivo = Paths.get(ruta);
        String texto = "";

        try {
            texto = new String(Files.readAllBytes(archivo));
            System.out.println("El contenido del archivo es:\n" + texto);
            System.out.println();
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido."); // El archivo no se lee pues bien no existe o la ruta está mal escrita.
        }
    }

    public void menuMesas() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué carta desea ver?");
        System.out.println();
        System.out.println("1.- Comida.");
        System.out.println("2.- Bebestibles.");
        System.out.println("3.- Regresar menu anterior.");

        int opcn = val.validarNumero();
        seleccion(opcn);
    }

    public void seleccion(int opcn) {
        Mesa menu = new Mesa();

        switch (opcn) {
            case 1:
                mostrarCartaComida();
                menu.menu();
                break;

            case 2:
                mostrarCartaBebestibles();
                menu.menu();
                break;

            case 3:
                menu.menu();
                break;

            default:
                menu.menu();
                break;
        }

    }

}
