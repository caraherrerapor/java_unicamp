package unican_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaPersonas1 {

    public static int edadMaxima(ArrayList<Persona> perso) {
        int max = perso.get(0).edad();
        for (int i = 0; i < perso.size(); i++) {
            if (perso.get(i).edad() > max) {
                max = perso.get(i).edad();

            }
        }
        return max;

    }

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<Persona>();

        int i = 1;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Escriba edad");
            int edad = input.nextInt();
            System.out.println("Escriba nombre");
            String nombre = input.nextLine();

         lista.add(new Persona(edad, nombre));

         i++;

         } while (i > 5);


        /*
        
        
        for (int j = 1; j < 5; j++) {
            System.out.println("Escriba edad");
            int edad = input.nextInt();
            System.out.println("Escriba nombre");
            String nombre = input.nextLine();
            lista.add(new Persona(edad, "nombre"));

        }
        
        
         
         */
    }

}
