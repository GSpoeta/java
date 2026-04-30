package Lista6;

import java.util.Scanner;
import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui cria o random pra gerar o numero secreto
        Random rand = new Random();

        // aqui gera um numero aleatorio de 1 a 100
        int numero = rand.nextInt(100) + 1;
        
        // aqui variaveis do palpite e quantidade de tentativas
        int palpite, tentativas = 0;

        // aqui repete ate o usuario acertar o numero
        do {
            // aqui pede um palpite pro usuario
            System.out.print("Adivinhe o número (1-100): ");
            
            // aqui le o palpite digitado
            palpite = sc.nextInt();
            
            // aqui aumenta o numero de tentativas
            tentativas++;

            // aqui da dica se o numero secreto e maior
            if (palpite < numero) {
                System.out.println("Maior!");
                
            // aqui da dica se o numero secreto e menor
            } else if (palpite > numero) {
                System.out.println("Menor!");
            }

        // aqui continua ate acertar o numero
        } while (palpite != numero);

        // aqui mostra quantas tentativas o usuario precisou
        System.out.println("Acertou em " + tentativas + " tentativas!");
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}