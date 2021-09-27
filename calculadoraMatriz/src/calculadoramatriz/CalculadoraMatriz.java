
package calculadoramatriz;

import java.util.Scanner;

public class CalculadoraMatriz {

    public static void main(String[] args) {
 
        Scanner obj1 = new Scanner(System.in);
        
        int priMatriz [][] = new int [2][2];
        int segMatriz [][] = new int [2][2];   
        int resulSuma [][] = new int [2][2];
        int resulRest [][] = new int [2][2];
        int resulMult [][] = new int [2][2];
        
       
        System.out.println("digite los numeros de la primera matriz");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(" digite un numero en la posicion ["+i+"]["+j+"] : ");
                priMatriz[i][j] = obj1.nextInt();
                       
            }
            
                    
        }
      
        //segunda matriz
   
        
         System.out.println("digite los numeros de la segunda matriz");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("digite un numero en la posicion ["+i+"]["+j+"]:");
                segMatriz[i][j] = obj1.nextInt();
                                      
            }
        
        }
        
        for (int i = 0; i < priMatriz.length; i++) {
            for (int j = 0; j < segMatriz.length; j++) {
                resulSuma[i][j] = priMatriz[i][j] + segMatriz[i][j];
                
                
            }
            
        }
        for (int i = 0; i < priMatriz.length; i++) {
            for (int j = 0; j < segMatriz.length; j++) {
                resulRest[i][j] = priMatriz[i][j] - segMatriz[i][j];
                
                
            }
            
        }
        for (int i = 0; i < priMatriz.length; i++) {
            for (int j = 0; j < segMatriz.length; j++) {
                resulMult[i][j] = priMatriz[i][j] * segMatriz[i][j];
                
                
            }
            
        }
        
        
        
        // imprimir variables 
        System.out.println("la suma de las matrices es : ");
        for (int i = 0; i < priMatriz.length; i++) {
            for (int j = 0; j < priMatriz.length; j++) {
                System.out.println("[" + priMatriz[i][j] + "]" ); 
            }
            if (i == 1) {
                System.out.println("      +      ");
            } 
            else {
                System.out.println("             ");
            }
            
             for (int j = 0; j < segMatriz.length; j++) {
                System.out.println("[" + segMatriz[i][j] + "]" ); 
            }
              if (i == 1) {
                System.out.println("      +      ");
            } 
            else {
                System.out.println("             ");
            }
               for (int j = 0; j < resulSuma.length; j++) {
                System.out.println("[" + resulSuma [i][j] + "]" ); 
            }  
              
        
        }
        System.out.println("esta es la resta de la matriz");
        for (int i = 0; i < priMatriz.length; i++) {
            for (int j = 0; j < priMatriz.length; j++) {
                System.out.println("[" + priMatriz[i][j] + "]" ); 
            }
            if (i == 1) {
                System.out.println("      -     ");
            } 
            else {
                System.out.println("             ");
            }
            
             for (int j = 0; j < segMatriz.length; j++) {
                System.out.println("[" + segMatriz[i][j] + "]" ); 
            }
              if (i == 1) {
                System.out.println("      =      ");
            } 
            else {
                System.out.println("             ");
            }
               for (int j = 0; j < resulRest.length; j++) {
                System.out.println("[" + resulRest [i][j] + "]" ); 
            }  
              
        
        }      
        System.out.println("esta es la multiplicacion de");
        for (int i = 0; i < priMatriz.length; i++) {
            for (int j = 0; j < priMatriz.length; j++) {
                System.out.println("[" + priMatriz[i][j] + "]" ); 
            }
            if (i == 1) {
                System.out.println("      *      ");
            } 
            else {
                System.out.println("             ");
            }
            
             for (int j = 0; j < segMatriz.length; j++) {
                System.out.println("[" + segMatriz[i][j] + "]" ); 
            }
              if (i == 1) {
                System.out.println("      =      ");
            } 
            else {
                System.out.println("             ");
            }
               for (int j = 0; j < resulMult.length; j++) {
                System.out.println("[" + resulMult [i][j] + "]" ); 
            }  
              
        
        }
        
    }
    
}
