
package exercicios;

 import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        int somaImpares = 0;
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um valor: ");
            int valor = sc.nextInt();
            if (valor >= 0 && valor <= 10) {
            contador++;
            if(valor % 2 == 1){
                somaImpares += valor;
           }
            
        }
            
      }
            
        System.out.println("Ao todo foram "+contador+" valores entre 0 e 10");
          System.out.println("Nesse intervalo, a soma dos impares foi " +somaImpares); 
   }
    
}
