
package exercicios;

import java.util.Scanner;

public class menujogo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao;
                
        System.out.println(" ++ BEM-VINDO AO SISTEMA DO JOGO ++ ");
        
        do {
            System.out.println("\n == MENU PRINCIPAL ==");
            System.out.println("1. Iniciar Nova Partida"); 
            System.out.println("2. Carregar jogo salvo"); 
            System.out.println("3. Ver recordes");
            System.out.println("4. Sair");
            
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            if (opcao == 1) {
                System.out.println("\n Iniciando nova partida...");
                System.out.println("PARTIDA 1 INICIADA");
            } else if (opcao == 2) {
                System.out.println("\n Função ainda não disponível aguarde a proxima atulizaçao em 2030.\n");
                
            } else if (opcao == 3) {
                System.out.println("\n Mostrando recordes...\n");
                
            } else if (opcao == 4) {
                System.out.println("\n Saindo do jogo... \n ");
                
            } else {
                System.out.println("\n Opção inválida!\n ");
            }
            
        } while (opcao != 4);
        
       
    }
}