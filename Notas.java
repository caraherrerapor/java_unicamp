
package unican_oop;


public class Notas {
    // atributos
   private int nota1;
    private int nota2;
    private int nota3;
    
    // metodos
    
    public void ponNotas(int n1,int n2,int n3){
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }
    public double  media(){
        return (nota1+nota2+nota3)/3.0;
    
    }
    public int mediaEntera(){
        return (nota1+nota2+nota3)/3;
    
    }
    
    public static void main(String[] args) {
        Notas notas = new Notas();
        
       notas.ponNotas(3, 4, 5);
        System.out.println(notas.mediaEntera()); 
        System.out.println(notas.media());
        
        
    }
    
    
    
    
}
