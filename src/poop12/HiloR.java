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
 * Clase que implementa la interfaz Runnable para representar un hilo.
 */
public class HiloR implements Runnable {

    /**
     * Constructor de la clase HiloR.
     */
    public HiloR() {
    }
    
    /**
     * Método run que define el comportamiento del hilo.
     * Imprime las iteraciones del hilo y su nombre.
     * Al finalizar, muestra un mensaje indicando que el hilo ha terminado.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion " + i + " " + Thread.currentThread().getName());
        }
        System.out.println("Termina el " + Thread.currentThread().getName());
    }
}
