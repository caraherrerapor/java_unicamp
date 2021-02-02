
package unican_oop;

/**
 *
 * @author lagra
 */
public class Solido {
    // atributos
    private double masa;
    private double radio;
    // metodo constructor
    public Solido(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }
    
    // metodos 
    
    public double momentoInercia(){
        return (2/5)*masa*radio*radio;
    }
    public double masa(){
        return masa;
    }
    public double radio(){
        return radio;
        
    }
    
    
    
    
    
}
