/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios2boperadores54786;

/**
 *
 * @author carol
 */

public class Ejercicios2BOperadores54786 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriz1 = {{23,3},{5,32}};
        
       System.out.println("Matriz: ");
       for (int i = 0; i < matriz1.length; i++) {
           for (int j = 0; j < matriz1[i].length; j++) {
               System.out.print(matriz1[i][j]);
           }
           System.out.println();
       }
       int matriz00 = 23;
       int matriz01 = 3;
       int matriz10 = 5;
       int matriz11 = 32;
       int resultado = 0;
       
       resultado = (matriz00 * matriz11) - (matriz01 * matriz10);
       
       System.out.println("La determinante es:"+" " + resultado);
       
               
    }
    
}
