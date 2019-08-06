
package nivel1exercicio2;

import java.util.Scanner;


public class Nivel1Exercicio2 {

   
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println ("Informe o Valor referente A:");
        double valorA = leia.nextDouble();
        
        System.out.println ("Informe o valor referente B:");
        double valorB = leia.nextDouble();
        
        System.out.println ("Informe o valor referente C:");
        double valorC = leia.nextDouble();
        
        
        double resultadoDelta = ((valorB * valorB) - 4*valorA * valorC);
        
        
        double resultadoX1 = ((-(valorB) + Math.sqrt(resultadoDelta))/(2 * valorA));
        double resultadoX2 = ((-(valorB) - Math.sqrt(resultadoDelta))/(2 * valorA)); 
      
        System.out.println ("x1 = "+resultadoX1);
        System.out.println ("x2 = "+resultadoX2);

    }
    
}
