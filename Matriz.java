
package unican_oop;


public class Matriz {
    
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{3,7,3},{3,7,5}};
        System.out.println("");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" "+matrix[i][j]);
                
                
            }
             System.out.println("");
           
            
        }
        
    }
    
}
