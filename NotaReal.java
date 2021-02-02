package unican_oop;

public class NotaReal {

    // atributos

    private double notaMedia;

    // constructor
    //public NotaReal(double nota) {
       // notaMedia = nota;
    //}

    public NotaReal(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    

    //metodo coviernte nota media
    public String convierte() {
        String notaLetra;
        if (notaMedia < 0.0) {
            notaLetra = "Error";
        } else if (notaMedia < 5.0) {
            notaLetra = "suspenso";
        } else if (notaMedia < 7.0) {
            notaLetra = "aprobado";
        }else if(notaMedia < 9.0){
            notaLetra = "notable";
            
        }else if (notaMedia <10.0){
            notaLetra = "sobresaliente";
        }else{
            notaLetra = "Error";
        }return notaLetra;
        
    }
    public static void main(String[] args) {
        NotaReal not = new NotaReal(5.7);
      System.out.println(not.convierte() );
        
        
    }

}
