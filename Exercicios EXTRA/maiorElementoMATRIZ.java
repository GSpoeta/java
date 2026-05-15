
package Gabriel11;
  import java.util.Scanner;

public class maiorElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int [3][3];
        
        System.out.println("Digite os valores dea matriz 3x3: ");
        for (int i = 0; i < m.length; i++) { //linha
            for (int j = 0; j < m[i].length; j++) { //coluna
                System.out.println("Elemento ["+i+"]["+j+"]:");
                m[i][j] = sc.nextInt();
                
            }
            
        }
        int maior = m [0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] > maior){
                    maior = m[i][j];
                }
            }
        }
    
//exibindo o maior valor encontrado

 System.out.println("Maior: "+maior);
}
}
