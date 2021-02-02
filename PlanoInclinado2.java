
package unican_oop;

import static java.lang.Math.sin;
import static java.lang.Math.toDegrees;

public class PlanoInclinado2 {
    // atributos
    private double anguloRad;
    private Solido cuerpo;
    // metodo constructor

    public PlanoInclinado2(double anguloRad, Solido cuerpo) {
        this.anguloRad = anguloRad;
        this.cuerpo = cuerpo;
    }
   
    
    // metodos
    
    public double aceleracion(){
        double g = 9.8;
        return  g*sin(toDegrees(anguloRad))/(1+(cuerpo.momentoInercia()/cuerpo.masa()*cuerpo.radio()*cuerpo.radio()));
        
    }
    public double distancia(double t){
        return (1/2)*aceleracion()*t*t;
        
    }
    public double eCineticaTras(double t){
        return (1/2)*cuerpo.masa()*aceleracion()*t*aceleracion()*t;
        
    }
    public double eCineticaRot(double t){
        double vel_ang = aceleracion()*t/cuerpo.radio();
        return (1/2)*cuerpo.momentoInercia()*vel_ang;
        
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
