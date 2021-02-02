package unican_oop;

public class tablasEnteros {

    // atributos
    int[] nums;
    /*
     el constructor me permite almacenar una tabla de datos
    
    
     */

    public tablasEnteros(int[] numeros) {

        nums = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            nums[i] = numeros[i];

        }

    }

    public double media() {
        int suma = 0;
        for (int x : nums) {
            suma = suma + x;
        }
        return (double) suma / nums.length;
    }
    
    public static void main(String[] args) {
        int[] n ={1,2,3,4,5};
        tablasEnteros t = new tablasEnteros(n);
        System.out.println("la media es "+ t.media());
        System.out.println("la longitud es "+ t.hashCode());
    }
    
    

}
