package Lista6;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner scanner = new Scanner(System.in);
        
        // aqui variavel que guarda o numero digitado
        int numero;

        // aqui loop que roda pelo menos uma vez
        do {
            
            // aqui pede um numero pro usuario
            System.out.print("Digite um número (999 para parar): ");
            
            // aqui le o numero digitado
            numero = scanner.nextInt();

            // aqui faz o papagaio repetir o numero digitado
            if (numero != 999) {
                System.out.println("Papagaio diz: " + numero);
            }

        // aqui continua ate o usuario digitar 999
        } while (numero != 999);

        // aqui mensagem final quando o loop termina
        System.out.println("O papagaio foi dormir...");

        // aqui fecha o scanner
        scanner.close();
    }
}