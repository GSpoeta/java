
package Gabriel11p1;

import java.util.Scanner;


public class somando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [4][4];
        
        int resultado = 0;
                
        System.out.println("Digite o valor da matriz 4x4; ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Elemento ["+i+"]["+j+"]; ");
                matriz[i][j] = sc.nextInt();
                
                
            }
            
        }
        //coluna
        for (int i = 0; i < 4; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j]; //somando elementos da linha 1
                somaColuna += matriz[j][i]; //somando elementos da coluna 1
                
                
            }
            System.out.println("Soma da linha "+(i+1)+"; "+somaLinha);
             System.out.println("Soma da coluna "+(i+1)+"; "+somaColuna);
            resultado = somaLinha+somaColuna;
        }
        System.out.println("A soma de todas as linhas e colunas é ; "+resultado);
    }
    
 
    
}
