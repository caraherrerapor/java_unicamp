
package unican_oop;


public class Resistencias {
    //atributos
    private double r1;
    private double r2;
    private double r3;
    // metodos
    
    // --metodo constructor--

    public Resistencias(double r1, double r2, double r3) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }
    public double calculaResEquiv(){
        return  1/((1/r1)+(1/r2)+(1/r3));
                
        
    }
    public static void main(String[] args) {
        Resistencias res = new Resistencias(3,4,5);
        
        System.out.println(res.calculaResEquiv()); 
        
    }
}
