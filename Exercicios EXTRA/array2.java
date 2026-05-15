
package exercicios;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int [5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o valor para indice "+i+" :");
            numeros[i] = sc.nextInt();
            
            
        }
        System.out.println("\nValores armazenados no array: ");
        
         for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos no indice "+i+" :"+numeros[i]);
            numeros[i] = sc.nextInt();
            
        }
    }
    
    
}
