
package unican_oop;

public class ListaPersonas {
    
    public static int edadMaxima(Persona[] perso){
        int max = perso[0].edad();
        
        for (int i = 0; i < perso.length; i++) {
            if (perso[i].edad() > max) {
                max= perso[i].edad();
            }
            
        }
        return max;
    }
    
    public static void main(String[] args) {
        Persona[] lista = new Persona[5];
        lista[0] = new Persona(10,"juan");
        lista[1] = new Persona(14,"pedro");
        lista[2] = new Persona(18,"andres");
        lista[3] = new Persona(3,"doble");
        lista[4] = new Persona(8,"vasos");
        System.out.println("Edad maxima: "+edadMaxima(lista));
        
    }
    
}
