
package unican_oop;

import static java.lang.Math.sin;
import static java.lang.Math.toDegrees;


public class PlanoInclinado {
    // atributos
    private double anguloRad;
    private double masa;
    private double radio;
    
    // metodo constructor
    public PlanoInclinado(double anguloRad, double masa, double radio) {
        this.anguloRad = anguloRad;
        this.masa = masa;
        this.radio = radio;
    }
    
    // metodos
    
    public double aceleracion(){
        double g = 9.8;
        double I = (2/5)*masa*radio*radio;
        
        return  g*sin(toDegrees(anguloRad))/(1+((2/5)*masa*radio*radio)/(masa*radio*radio));
        
    }
    public double distancia(double t){
        return (1/2)*aceleracion()*t*t;
        
    }
    public double eCineticaTras(double t){
        return (1/2)*masa*aceleracion()*t*aceleracion()*t;
        
    }
    public double eCineticaRot(double t){
        double I = (2/5)*masa*radio*radio;
        return (1/2)*I*(aceleracion()*t);
        
    }
    
    // main
    public static void main(String[] args) {
        PlanoInclinado pinc = new PlanoInclinado(30.0,1.5,0.2);
         double  t = 4.0;
        System.out.println("a = "+pinc.aceleracion());  
        System.out.println("d = "+ pinc.distancia(t));
        System.out.println("ecr = "+ pinc.eCineticaRot(t));
        System.out.println("ect = "+ pinc.eCineticaTras(t));
    }
    
    
}
