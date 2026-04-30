package Lista6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui variavel da opcao do usuario
        int op;

        // aqui faz o loop que executa pelo menos uma vez
        do {
            
            // aqui mostra a mensagem da sorte
            System.out.println("Sua sorte: Hoje será um ótimo dia!");
            
            // aqui pergunta se quer abrir outro biscoito
            System.out.print("Abrir outro biscoito? (1=Sim, 0=Não): ");
            
            // aqui le a opcao digitada
            op = sc.nextInt();

        // aqui repete enquanto o usuario digitar 1
        } while (op == 1);

        // aqui mensagem final quando o usuario sair
        System.out.println("Até a próxima!");
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}