/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu03
 */
/**
 * Clase principal que contiene el método main para ejecutar el programa.
 */
public class POOP12 {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Version extendida 
        /*System.out.println("Inicia Hilo principal");
        HiloT hilo1 = new HiloT("HiloPrincipal");
        hilo1.start();
        HiloT hilo2 = new HiloT("HiloSecundario");
        hilo2.start();
        HiloT hilo3 = new HiloT("HiloTerciario");
        hilo3.start();*/
        
        //Version corta
        /*System.out.println("Inicia Hilo principal");
        new HiloT("HiloPrincipal").start();
        new HiloT("HiloSecundario").start();
        new HiloT("HiloTerciario").start();*/
        
        System.out.println("************************");
        
        //new Thread(new HiloR(),"Primer HiloR").start();
        //new Thread(new HiloR(),"segundo HiloR").start();
        //new Thread(new HiloR(),"Tercer HiloR").start();
        
        new Cuenta("Acceso 1").start();
        new Cuenta("Acceso 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        System.out.println("Termina el hilo principal");
    }
    
}
