
package Gabriel11;

  import java.util.Scanner;

public class tabuada_matriz {
    
   
           
    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite um numero para ver a tabuada");
    int numero = sc.nextInt();
    
    
        int[][] tabuada = new int[11][11];
        
        for (int linha = 1; linha < 11; linha++) { //linha
            for (int coluna = 1; coluna < 11; coluna++) { //coluna
                tabuada[linha][coluna] = (linha) * (coluna);
            }                
            }
            System.out.println("tabuada do " + numero + " :");
            for (int coluna = 1; coluna < 11; coluna++) {
            
            System.out.println(numero +" x "+coluna+" = "+ tabuada[numero][coluna] +"\t");
                System.out.println("");

        }
    }
}

