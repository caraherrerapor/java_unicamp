/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unican_oop;

/**
 *
 * @author lagra
 */
public class Arreglo {

    int[] lista;

    public Arreglo(int[] arreglo) {
        lista = new int[arreglo.length];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = arreglo[i];

        }

    }
    
    public void mostrar(){
        
        for (int i = 0; i < lista.length; i++) {
            
            System.out.println(lista[i]);
        }
    }

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        Arreglo arr = new Arreglo(lista);
        arr.mostrar();
        
    }
}


