/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu03
 */
/**
 * Clase que hereda de Thread y representa un hilo.
 */
public class HiloT extends Thread {

    /**
     * Constructor por defecto de la clase HiloT.
     */
    public HiloT() {
    }

    /**
     * Constructor de la clase HiloT con nombre de hilo personalizado.
     *
     * @param name el nombre del hilo.
     */
    public HiloT(String name) {
        super(name);
    }

    /**
     * Método run que define el comportamiento del hilo.
     * Imprime las iteraciones del hilo y su nombre.
     * Al finalizar, muestra un mensaje indicando que el hilo ha terminado.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion no. " + i + " de " + getName());
        }
        System.out.println("Termina el hilo " + getName());
    }
}

