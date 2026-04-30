package Lista6;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui variavel que representa a pressao do pneu
        int pressao = 0;
        
        // aqui variavel da opcao do usuario
        int op;

        // aqui loop que vai aumentando a pressao ate o pneu encher ou estourar
        do {
            
            // aqui aumenta a pressao em 10 a cada rodada
            pressao += 10; 

            // aqui verifica se a pressao passou do limite
            if (pressao > 100) {
                System.out.println("Pressão atual: " + pressao);
                System.out.println("Pneu explodiu! Na sua cara");
                break; 
            }

            // aqui mostra a pressao atual
            System.out.println("Pressão atual: " + pressao);
            
            // aqui pergunta se o pneu ja esta cheio
            System.out.print("O pneu está cheio? (1=Sim, 2=Não): ");
            
            // aqui le a resposta do usuario
            op = sc.nextInt();

        // aqui continua enquanto nao estiver cheio
        } while (op == 2);

        // aqui mensagem final caso o pneu nao tenha explodido
        if (pressao <= 100)
            System.out.println("Pneu cheio!");
    }
}