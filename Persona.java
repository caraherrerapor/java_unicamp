
package unican_oop;


public class Persona {
    // atributos
    private int edad;
    private String nombre;
    
    // constructor

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    // metodo retorna la edad
    
    public int edad(){
        return edad;
    }
    
    // metodo retorna el nombre
    
    public String nombre(){
        return nombre;
    }
    
    
}
