/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author osamc
 */
/**
 * Clase que hereda de Thread y representa una cuenta con saldo.
 */
public class Cuenta extends Thread {
    private static long saldo = 0;

    /**
     * Constructor de la clase Cuenta con nombre de hilo personalizado.
     *
     * @param name el nombre del hilo.
     */
    public Cuenta(String name) {
        super(name);
    }

    /**
     * Método run que define el comportamiento del hilo.
     * Realiza operaciones de depósito o extracción de dinero según el nombre del hilo.
     * Al finalizar, muestra un mensaje indicando que el hilo ha terminado.
     */
    @Override
    public void run() {
        if (getName().equals("Deposito 1") || getName().equals("Deposito 2")) {
            this.depositarDinero(100);
        } else {
            this.extraerDinero(50);
        }
        System.out.println("Termina el " + getName());
    }

    /**
     * Método sincronizado para depositar dinero en la cuenta.
     *
     * @param cantidad la cantidad de dinero a depositar.
     */
    public synchronized void depositarDinero(int cantidad) {
        saldo += cantidad;
        System.out.println("Se deposita: " + cantidad + "$");
        notifyAll();
    }

    /**
     * Método sincronizado para extraer dinero de la cuenta.
     *
     * @param cantidad la cantidad de dinero a extraer.
     */
    public synchronized void extraerDinero(int cantidad) {
        try {
            if (saldo <= 0) {
                System.out.println(getName() + " espera Deposito " + "\nSaldo= " + saldo);
                sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        saldo -= cantidad;
        System.out.println(getName() + " extrajo " + cantidad + " $\nSaldo restante= " + saldo);
        notifyAll();
    }
}

